/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.ui;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.papyrus.revision.tool.core.I_ReviewStereotype;
import org.eclipse.papyrus.revision.tool.core.I_VersioningStereotype;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 
 * This is the label provider to display reviews for the review editor
 *
 */
public class ReviewsTreeLabelProvider extends StyledCellLabelProvider  {
	protected Font italicFont;
	protected Font boldFont;
	private  Styler fBoldStyler;
	private  Styler fItalicStyler;
	/**
	 * constructor
	 * @param boldFont
	 * @param italicFont
	 */
	public ReviewsTreeLabelProvider( final Font boldFont, final Font italicFont ) {
		this.boldFont= boldFont;
		this.italicFont= italicFont;
		// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
		// With JFace 3.4, the font information (bold in this example) will be ignored.

		fBoldStyler= new Styler() {

			@Override
			public void applyStyles(TextStyle textStyle) {
				textStyle.font= boldFont;

			}
		};
		fItalicStyler= new Styler() {

			@Override
			public void applyStyles(TextStyle textStyle) {
				textStyle.font= italicFont;

			}
		};
	}


	/**
	 * get the color from a author
	 * @param author
	 * @return color
	 */
	public Color getColorFromAuthor(Actor author){
		Device device = Display.getCurrent ();
		if(author!=null){
			String colorRGB= (String)author.getValue(author.getApplicableStereotype(I_VersioningStereotype.AUTHOR_STEREOTYPE), I_VersioningStereotype.AUTHOR_COLOR_ATT);
			if(colorRGB!=null){
				String R=colorRGB.substring(0, colorRGB.indexOf(":"));
				colorRGB=colorRGB.substring(colorRGB.indexOf(":")+1);
				String G=colorRGB.substring(0, colorRGB.indexOf(":"));
				colorRGB=colorRGB.substring(colorRGB.indexOf(":")+1);
				String B=colorRGB;
				return new Color(device,new Integer(R) , new Integer(G), new Integer(B));
			}
		}
		return new Color(device,255 , 255, 255);
	}

	/**
	 * update visual appearance of a cell
	 */
	public void update(ViewerCell cell) {
		Object obj = cell.getElement();

		if(obj instanceof Comment) {
			Comment cmt=(Comment)obj;
			Stereotype theReviewStereotype=cmt.getApplicableStereotype(I_ReviewStereotype.COMMENT_STEREOTYPE);
			Stereotype reviewStereotype=null;
			List<Stereotype> stereotypes= cmt.getAppliedStereotypes();
			System.out.println(cmt);
			for (Stereotype stereotype : stereotypes) {
				if(stereotype.getGenerals().contains(theReviewStereotype)){
					reviewStereotype=stereotype;
				}
			}
			
			if(reviewStereotype!=null){
				StyledString styledString = new StyledString("");
				EObject stereotypeApplicationAuthor=(EObject)cmt.getValue(reviewStereotype, I_VersioningStereotype.VERSIONINGELEMENT_AUTHOR_ATT);
				if(stereotypeApplicationAuthor!=null){
					Actor author=(Actor)UMLUtil.getBaseElement(stereotypeApplicationAuthor);
					if( author!=null){
						styledString.append( author.getName(), fBoldStyler);
					}
					cell.setBackground(getColorFromAuthor(author) );
				}
				else{
					styledString.append( "No author", fBoldStyler);
				}
				if(cmt.getValue(reviewStereotype, I_ReviewStereotype.COMMENT_SUBJECT_ATT)!=null){
					styledString.append( " "+cmt.getValue(reviewStereotype, I_ReviewStereotype.COMMENT_SUBJECT_ATT),fItalicStyler );
				}
				else{
					styledString.append( " No subject",fItalicStyler );
				}

				if(cmt.getValue(reviewStereotype, I_VersioningStereotype.VERSIONINGELEMENT_DATE_ATT)!=null){
					styledString.append( " "+cmt.getValue(reviewStereotype,  I_VersioningStereotype.VERSIONINGELEMENT_DATE_ATT),fBoldStyler );
				}
				styledString.append(" (" +	cmt.getOwnedComments().size() +")", StyledString.COUNTER_STYLER);
				styledString.append("\n" +	cmt.getBody() , StyledString.DECORATIONS_STYLER);

				cell.setText(styledString.toString());
				cell.setStyleRanges(styledString.getStyleRanges());

			}
			else{
				//no stereotype
				StyledString styledString = new StyledString("");
				styledString.append("" +cmt.getBody() , StyledString.DECORATIONS_STYLER);
				cell.setText(styledString.toString());
				cell.setStyleRanges(styledString.getStyleRanges());
			}
		}
		super.update(cell);
	}

}
