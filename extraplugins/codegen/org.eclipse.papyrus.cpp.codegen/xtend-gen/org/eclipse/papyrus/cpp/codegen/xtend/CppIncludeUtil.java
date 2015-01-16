package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import org.eclipse.papyrus.C_Cpp.Include;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppIncludeUtil {
  public static String includeDirective(final String path) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(path, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _length = path.length();
      boolean _greaterThan = (_length > 0);
      _and = _greaterThan;
    }
    if (_and) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include ");
      String _plus = (_builder.toString() + "\"");
      String _plus_1 = (_plus + path);
      return (_plus_1 + "\"");
    }
    return null;
  }
  
  public static String CppIncludeHeader(final NamedElement ne) {
    boolean _hasStereotype = GenUtils.hasStereotype(ne, Include.class);
    if (_hasStereotype) {
      UMLUtil.<Include>getStereotypeApplication(ne, Include.class);
      Include _stereotypeApplication = UMLUtil.<Include>getStereotypeApplication(ne, Include.class);
      String header = _stereotypeApplication.getHeader();
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(header, null));
      if (!_notEquals) {
        _and = false;
      } else {
        int _length = header.length();
        boolean _greaterThan = (_length > 0);
        _and = _greaterThan;
      }
      if (_and) {
        CharSequence _constIncludeHeaderStart = CppIncludeUtil.constIncludeHeaderStart();
        String _cleanCR = GenUtils.cleanCR(header);
        String _plus = (_constIncludeHeaderStart + _cleanCR);
        String _plus_1 = (_plus + "\n");
        CharSequence _constIncludeHeaderEnd = CppIncludeUtil.constIncludeHeaderEnd();
        String includeHeader = (_plus_1 + _constIncludeHeaderEnd);
        return includeHeader;
      }
    }
    return null;
  }
  
  public static CharSequence constIncludeHeaderStart() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Include from Include stereotype (header)");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence constIncludeHeaderEnd() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// End of Include stereotype (header)");
    _builder.newLine();
    return _builder;
  }
  
  public static String CppIncludePreBody(final NamedElement ne) {
    boolean _hasStereotype = GenUtils.hasStereotype(ne, Include.class);
    if (_hasStereotype) {
      Include _stereotypeApplication = UMLUtil.<Include>getStereotypeApplication(ne, Include.class);
      String preBody = _stereotypeApplication.getPreBody();
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(preBody, null));
      if (!_notEquals) {
        _and = false;
      } else {
        int _length = preBody.length();
        boolean _greaterThan = (_length > 0);
        _and = _greaterThan;
      }
      if (_and) {
        CharSequence _constIncludePreBodyStart = CppIncludeUtil.constIncludePreBodyStart();
        String _cleanCR = GenUtils.cleanCR(preBody);
        String _plus = (_constIncludePreBodyStart + _cleanCR);
        String _plus_1 = (_plus + "\n");
        CharSequence _constIncludePreBodyEnd = CppIncludeUtil.constIncludePreBodyEnd();
        String includePreBody = (_plus_1 + _constIncludePreBodyEnd);
        return includePreBody;
      }
    }
    return null;
  }
  
  public static CharSequence constIncludePreBodyStart() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Include from Include stereotype (pre-body)");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence constIncludePreBodyEnd() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// End of Include stereotype (pre-body)");
    _builder.newLine();
    return _builder;
  }
  
  public static String CppIncludeBody(final NamedElement ne) {
    boolean _hasStereotype = GenUtils.hasStereotype(ne, Include.class);
    if (_hasStereotype) {
      Include _stereotypeApplication = UMLUtil.<Include>getStereotypeApplication(ne, Include.class);
      String body = _stereotypeApplication.getBody();
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(body, null));
      if (!_notEquals) {
        _and = false;
      } else {
        int _length = body.length();
        boolean _greaterThan = (_length > 0);
        _and = _greaterThan;
      }
      if (_and) {
        CharSequence _constIncludeBodyStart = CppIncludeUtil.constIncludeBodyStart();
        String _cleanCR = GenUtils.cleanCR(body);
        String _plus = (_constIncludeBodyStart + _cleanCR);
        String _plus_1 = (_plus + "\n");
        CharSequence _constIncludeBodyEnd = CppIncludeUtil.constIncludeBodyEnd();
        String includeBody = (_plus_1 + _constIncludeBodyEnd);
        return includeBody;
      }
    }
    return null;
  }
  
  public static CharSequence constIncludeBodyStart() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Include from Include declaration (body)");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence constIncludeBodyEnd() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// End of Include declaration (body)");
    _builder.newLine();
    return _builder;
  }
}
