package aspects.xpt.expressions

import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import com.google.inject.Inject
import aspects.xpt.Common
import com.google.inject.Singleton

@Singleton class AbstractExpression extends xpt.expressions.AbstractExpression {
	
	@Inject extension Common
	
	override performCast(GenDiagram it) '''
		«generatedMemberComment(
			'Expression may return number value which is not directly compatible with feature type (e.g. Double when Integer is expected), or EEnumLiteral meta-object when literal instance is expected')»
		public static Object performCast(Object value, org.eclipse.emf.ecore.EDataType targetType) {
			if (targetType instanceof org.eclipse.emf.ecore.EEnum) {
				if (value instanceof org.eclipse.emf.ecore.EEnumLiteral) {
					org.eclipse.emf.ecore.EEnumLiteral literal = (org.eclipse.emf.ecore.EEnumLiteral) value;
					return (literal.getInstance() != null) ? literal.getInstance() : literal;
				}
			}
			if (false == value instanceof Number || targetType == null || targetType.getInstanceClass() == null) {
				return value;
			}
			Class<?> targetClass = targetType.getInstanceClass();
			Number num = (Number) value;
			Class<?> valClass = value.getClass();
			Class<?> targetWrapperClass = targetClass;
			if (targetClass.isPrimitive()) {
				targetWrapperClass = org.eclipse.emf.ecore.util.EcoreUtil.wrapperClassFor(targetClass);
			}
			if (valClass.equals(targetWrapperClass)) {
				return value;
			}
			if (Number.class.isAssignableFrom(targetWrapperClass)) {
				if (targetWrapperClass.equals(Byte.class)) {
					return new Byte(num.byteValue());
				}
				if (targetWrapperClass.equals(Integer.class)) {
					return new Integer(num.intValue());
				}
				if (targetWrapperClass.equals(Short.class)) {
					return new Short(num.shortValue());
				}
				if (targetWrapperClass.equals(Long.class)) {
					return new Long(num.longValue());
				}
				if (targetWrapperClass.equals(BigInteger.class)) {
					return BigInteger.valueOf(num.longValue());
				}
				if (targetWrapperClass.equals(Float.class)) {
					return new Float(num.floatValue());
				}
				if (targetWrapperClass.equals(Double.class)) {
					return new Double(num.doubleValue());
				}
				if (targetWrapperClass.equals(BigDecimal.class)) {
					return new BigDecimal(num.doubleValue());
				}
			}
			return value;
		}
	'''
}