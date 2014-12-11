package org.eclipse.papyrus.dsml.validation.generator.xtend;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.codegen.base.IPFileSystemAccess;
import org.eclipse.papyrus.dsml.validation.model.profilenames.Utils;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * A generator for Java based constraints
 */
@SuppressWarnings("all")
public class ConstraintGen {
  public static CharSequence generateConstraint(final Constraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Created by the Papyrus DSML plugin generator");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    String _topPkg = Utils.getTopPkg();
    _builder.append(_topPkg, "");
    _builder.append(".constraints;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.core.runtime.IStatus;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.validation.AbstractModelConstraint;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.validation.IValidationContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.uml2.uml.Element;");
    _builder.newLine();
    _builder.append("import org.eclipse.uml2.uml.Stereotype;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = constraint.getName();
    _builder.append(_name, "");
    _builder.append("Constraint extends AbstractModelConstraint {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public IStatus validate(IValidationContext ctx) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (ctx.getTarget() instanceof Element) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Element element = (Element) ctx.getTarget();");
    _builder.newLine();
    _builder.newLine();
    {
      Boolean _isConstraintForStereotype = Utils.isConstraintForStereotype(constraint);
      if ((_isConstraintForStereotype).booleanValue()) {
        _builder.append("\t\t\t");
        _builder.append("Stereotype appliedStereotype = element.getAppliedStereotype(\"");
        String _constraintForStereotype = Utils.getConstraintForStereotype(constraint);
        _builder.append(_constraintForStereotype, "\t\t\t");
        _builder.append("\"); //$NON-NLS-1$");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("if (appliedStereotype != null) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("if (evaluateConstraint(element, appliedStereotype)) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("return ctx.createSuccessStatus();");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("return ctx.createFailureStatus(\"Constraint not validated\"); //$NON-NLS-1$");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t");
        _builder.append("if (evaluateConstraint(element)) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("return ctx.createSuccessStatus();");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("return ctx.createFailureStatus(\"Constraint not validated\");");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ctx.createSuccessStatus();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      Boolean _isConstraintForStereotype_1 = Utils.isConstraintForStereotype(constraint);
      if ((_isConstraintForStereotype_1).booleanValue()) {
        _builder.append("\t");
        _builder.append("private boolean evaluateConstraint(Element self, Stereotype appliedStereotype) {");
        _builder.newLine();
        {
          ValueSpecification _specification = constraint.getSpecification();
          String _javaConstraintBody = Utils.getJavaConstraintBody(_specification);
          boolean _notEquals = (!Objects.equal(_javaConstraintBody, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("\t");
            ValueSpecification _specification_1 = constraint.getSpecification();
            String _javaConstraintBody_1 = Utils.getJavaConstraintBody(_specification_1);
            _builder.append(_javaConstraintBody_1, "\t\t");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return true;");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      Boolean _isConstraintForStereotype_2 = Utils.isConstraintForStereotype(constraint);
      boolean _not = (!(_isConstraintForStereotype_2).booleanValue());
      if (_not) {
        _builder.append("\t");
        _builder.append("private boolean evaluateConstraint(Element self) {");
        _builder.newLine();
        {
          ValueSpecification _specification_2 = constraint.getSpecification();
          String _javaConstraintBody_2 = Utils.getJavaConstraintBody(_specification_2);
          boolean _notEquals_1 = (!Objects.equal(_javaConstraintBody_2, null));
          if (_notEquals_1) {
            _builder.append("\t");
            _builder.append("\t");
            ValueSpecification _specification_3 = constraint.getSpecification();
            String _javaConstraintBody_3 = Utils.getJavaConstraintBody(_specification_3);
            _builder.append(_javaConstraintBody_3, "\t\t");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return true;");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * @see org.eclipse.xtext.generator.IGenerator#doGenerate(org.eclipse.emf.ecore.resource.Resource, org.eclipse.xtext.generator.IFileSystemAccess)
   * 
   * @param input
   * @param fsa
   */
  public static void generate(final Resource input, final IPFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    final Iterator<Constraint> contentIterator = Iterators.<Constraint>filter(_allContents, Constraint.class);
    while (contentIterator.hasNext()) {
      {
        final Constraint constraint = contentIterator.next();
        Boolean _hasSpecificationForJava = Utils.hasSpecificationForJava(constraint);
        if ((_hasSpecificationForJava).booleanValue()) {
          String _topPkg = Utils.getTopPkg();
          String _replaceAll = _topPkg.replaceAll("\\.", "/");
          String _plus = (_replaceAll + "/constraints/");
          String _name = constraint.getName();
          String _plus_1 = (_plus + _name);
          final String fileName = (_plus_1 + 
            "Constraint.java");
          CharSequence _generateConstraint = ConstraintGen.generateConstraint(constraint);
          String _string = _generateConstraint.toString();
          fsa.generateFile(fileName, _string);
        }
      }
    }
  }
}
