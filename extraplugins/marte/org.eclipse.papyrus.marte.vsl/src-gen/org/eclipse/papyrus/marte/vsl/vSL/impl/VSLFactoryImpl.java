/**
 */
package org.eclipse.papyrus.marte.vsl.vSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.marte.vsl.vSL.AdditiveExpression;
import org.eclipse.papyrus.marte.vsl.vSL.AndOrXorExpression;
import org.eclipse.papyrus.marte.vsl.vSL.BooleanLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.CollectionOrTuple;
import org.eclipse.papyrus.marte.vsl.vSL.ConditionalExpression;
import org.eclipse.papyrus.marte.vsl.vSL.DataTypeName;
import org.eclipse.papyrus.marte.vsl.vSL.DateTimeLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.DefaultLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.DurationObsExpression;
import org.eclipse.papyrus.marte.vsl.vSL.DurationObsName;
import org.eclipse.papyrus.marte.vsl.vSL.EqualityExpression;
import org.eclipse.papyrus.marte.vsl.vSL.Expression;
import org.eclipse.papyrus.marte.vsl.vSL.InstantObsExpression;
import org.eclipse.papyrus.marte.vsl.vSL.InstantObsName;
import org.eclipse.papyrus.marte.vsl.vSL.IntegerLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.Interval;
import org.eclipse.papyrus.marte.vsl.vSL.JitterExp;
import org.eclipse.papyrus.marte.vsl.vSL.ListOfValueNamePairs;
import org.eclipse.papyrus.marte.vsl.vSL.ListOfValues;
import org.eclipse.papyrus.marte.vsl.vSL.Literal;
import org.eclipse.papyrus.marte.vsl.vSL.MultiplicativeExpression;
import org.eclipse.papyrus.marte.vsl.vSL.NameOrChoiceOrBehaviorCall;
import org.eclipse.papyrus.marte.vsl.vSL.NullLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.NumberLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.OperationCallExpression;
import org.eclipse.papyrus.marte.vsl.vSL.PrimaryExpression;
import org.eclipse.papyrus.marte.vsl.vSL.PropertyCallExpression;
import org.eclipse.papyrus.marte.vsl.vSL.QualifiedName;
import org.eclipse.papyrus.marte.vsl.vSL.RealLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.RelationalExpression;
import org.eclipse.papyrus.marte.vsl.vSL.StringLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.SuffixExpression;
import org.eclipse.papyrus.marte.vsl.vSL.TimeExpression;
import org.eclipse.papyrus.marte.vsl.vSL.Tuple;
import org.eclipse.papyrus.marte.vsl.vSL.UnaryExpression;
import org.eclipse.papyrus.marte.vsl.vSL.UnlimitedLiteralRule;
import org.eclipse.papyrus.marte.vsl.vSL.VSLFactory;
import org.eclipse.papyrus.marte.vsl.vSL.VSLPackage;
import org.eclipse.papyrus.marte.vsl.vSL.ValueNamePair;
import org.eclipse.papyrus.marte.vsl.vSL.ValueSpecification;
import org.eclipse.papyrus.marte.vsl.vSL.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VSLFactoryImpl extends EFactoryImpl implements VSLFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static VSLFactory init()
	{
		try
		{
			VSLFactory theVSLFactory = (VSLFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/papyrus/marte/vsl/VSL");
			if (theVSLFactory != null)
			{
				return theVSLFactory;
			}
		} catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public VSLFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
		case VSLPackage.EXPRESSION:
			return createExpression();
		case VSLPackage.AND_OR_XOR_EXPRESSION:
			return createAndOrXorExpression();
		case VSLPackage.EQUALITY_EXPRESSION:
			return createEqualityExpression();
		case VSLPackage.RELATIONAL_EXPRESSION:
			return createRelationalExpression();
		case VSLPackage.CONDITIONAL_EXPRESSION:
			return createConditionalExpression();
		case VSLPackage.ADDITIVE_EXPRESSION:
			return createAdditiveExpression();
		case VSLPackage.MULTIPLICATIVE_EXPRESSION:
			return createMultiplicativeExpression();
		case VSLPackage.UNARY_EXPRESSION:
			return createUnaryExpression();
		case VSLPackage.PRIMARY_EXPRESSION:
			return createPrimaryExpression();
		case VSLPackage.VALUE_SPECIFICATION:
			return createValueSpecification();
		case VSLPackage.SUFFIX_EXPRESSION:
			return createSuffixExpression();
		case VSLPackage.PROPERTY_CALL_EXPRESSION:
			return createPropertyCallExpression();
		case VSLPackage.OPERATION_CALL_EXPRESSION:
			return createOperationCallExpression();
		case VSLPackage.LITERAL:
			return createLiteral();
		case VSLPackage.NAME_OR_CHOICE_OR_BEHAVIOR_CALL:
			return createNameOrChoiceOrBehaviorCall();
		case VSLPackage.QUALIFIED_NAME:
			return createQualifiedName();
		case VSLPackage.INTERVAL:
			return createInterval();
		case VSLPackage.COLLECTION_OR_TUPLE:
			return createCollectionOrTuple();
		case VSLPackage.TUPLE:
			return createTuple();
		case VSLPackage.LIST_OF_VALUES:
			return createListOfValues();
		case VSLPackage.LIST_OF_VALUE_NAME_PAIRS:
			return createListOfValueNamePairs();
		case VSLPackage.VALUE_NAME_PAIR:
			return createValueNamePair();
		case VSLPackage.TIME_EXPRESSION:
			return createTimeExpression();
		case VSLPackage.INSTANT_OBS_EXPRESSION:
			return createInstantObsExpression();
		case VSLPackage.INSTANT_OBS_NAME:
			return createInstantObsName();
		case VSLPackage.DURATION_OBS_EXPRESSION:
			return createDurationObsExpression();
		case VSLPackage.DURATION_OBS_NAME:
			return createDurationObsName();
		case VSLPackage.JITTER_EXP:
			return createJitterExp();
		case VSLPackage.VARIABLE_DECLARATION:
			return createVariableDeclaration();
		case VSLPackage.DATA_TYPE_NAME:
			return createDataTypeName();
		case VSLPackage.NUMBER_LITERAL_RULE:
			return createNumberLiteralRule();
		case VSLPackage.INTEGER_LITERAL_RULE:
			return createIntegerLiteralRule();
		case VSLPackage.UNLIMITED_LITERAL_RULE:
			return createUnlimitedLiteralRule();
		case VSLPackage.REAL_LITERAL_RULE:
			return createRealLiteralRule();
		case VSLPackage.DATE_TIME_LITERAL_RULE:
			return createDateTimeLiteralRule();
		case VSLPackage.BOOLEAN_LITERAL_RULE:
			return createBooleanLiteralRule();
		case VSLPackage.NULL_LITERAL_RULE:
			return createNullLiteralRule();
		case VSLPackage.DEFAULT_LITERAL_RULE:
			return createDefaultLiteralRule();
		case VSLPackage.STRING_LITERAL_RULE:
			return createStringLiteralRule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Expression createExpression()
	{
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AndOrXorExpression createAndOrXorExpression()
	{
		AndOrXorExpressionImpl andOrXorExpression = new AndOrXorExpressionImpl();
		return andOrXorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EqualityExpression createEqualityExpression()
	{
		EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
		return equalityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public RelationalExpression createRelationalExpression()
	{
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ConditionalExpression createConditionalExpression()
	{
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AdditiveExpression createAdditiveExpression()
	{
		AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
		return additiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public MultiplicativeExpression createMultiplicativeExpression()
	{
		MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
		return multiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UnaryExpression createUnaryExpression()
	{
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PrimaryExpression createPrimaryExpression()
	{
		PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
		return primaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ValueSpecification createValueSpecification()
	{
		ValueSpecificationImpl valueSpecification = new ValueSpecificationImpl();
		return valueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public SuffixExpression createSuffixExpression()
	{
		SuffixExpressionImpl suffixExpression = new SuffixExpressionImpl();
		return suffixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PropertyCallExpression createPropertyCallExpression()
	{
		PropertyCallExpressionImpl propertyCallExpression = new PropertyCallExpressionImpl();
		return propertyCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public OperationCallExpression createOperationCallExpression()
	{
		OperationCallExpressionImpl operationCallExpression = new OperationCallExpressionImpl();
		return operationCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Literal createLiteral()
	{
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NameOrChoiceOrBehaviorCall createNameOrChoiceOrBehaviorCall()
	{
		NameOrChoiceOrBehaviorCallImpl nameOrChoiceOrBehaviorCall = new NameOrChoiceOrBehaviorCallImpl();
		return nameOrChoiceOrBehaviorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public QualifiedName createQualifiedName()
	{
		QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Interval createInterval()
	{
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CollectionOrTuple createCollectionOrTuple()
	{
		CollectionOrTupleImpl collectionOrTuple = new CollectionOrTupleImpl();
		return collectionOrTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Tuple createTuple()
	{
		TupleImpl tuple = new TupleImpl();
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ListOfValues createListOfValues()
	{
		ListOfValuesImpl listOfValues = new ListOfValuesImpl();
		return listOfValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ListOfValueNamePairs createListOfValueNamePairs()
	{
		ListOfValueNamePairsImpl listOfValueNamePairs = new ListOfValueNamePairsImpl();
		return listOfValueNamePairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ValueNamePair createValueNamePair()
	{
		ValueNamePairImpl valueNamePair = new ValueNamePairImpl();
		return valueNamePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimeExpression createTimeExpression()
	{
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public InstantObsExpression createInstantObsExpression()
	{
		InstantObsExpressionImpl instantObsExpression = new InstantObsExpressionImpl();
		return instantObsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public InstantObsName createInstantObsName()
	{
		InstantObsNameImpl instantObsName = new InstantObsNameImpl();
		return instantObsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DurationObsExpression createDurationObsExpression()
	{
		DurationObsExpressionImpl durationObsExpression = new DurationObsExpressionImpl();
		return durationObsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DurationObsName createDurationObsName()
	{
		DurationObsNameImpl durationObsName = new DurationObsNameImpl();
		return durationObsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public JitterExp createJitterExp()
	{
		JitterExpImpl jitterExp = new JitterExpImpl();
		return jitterExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public VariableDeclaration createVariableDeclaration()
	{
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DataTypeName createDataTypeName()
	{
		DataTypeNameImpl dataTypeName = new DataTypeNameImpl();
		return dataTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NumberLiteralRule createNumberLiteralRule()
	{
		NumberLiteralRuleImpl numberLiteralRule = new NumberLiteralRuleImpl();
		return numberLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IntegerLiteralRule createIntegerLiteralRule()
	{
		IntegerLiteralRuleImpl integerLiteralRule = new IntegerLiteralRuleImpl();
		return integerLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UnlimitedLiteralRule createUnlimitedLiteralRule()
	{
		UnlimitedLiteralRuleImpl unlimitedLiteralRule = new UnlimitedLiteralRuleImpl();
		return unlimitedLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public RealLiteralRule createRealLiteralRule()
	{
		RealLiteralRuleImpl realLiteralRule = new RealLiteralRuleImpl();
		return realLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DateTimeLiteralRule createDateTimeLiteralRule()
	{
		DateTimeLiteralRuleImpl dateTimeLiteralRule = new DateTimeLiteralRuleImpl();
		return dateTimeLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BooleanLiteralRule createBooleanLiteralRule()
	{
		BooleanLiteralRuleImpl booleanLiteralRule = new BooleanLiteralRuleImpl();
		return booleanLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NullLiteralRule createNullLiteralRule()
	{
		NullLiteralRuleImpl nullLiteralRule = new NullLiteralRuleImpl();
		return nullLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DefaultLiteralRule createDefaultLiteralRule()
	{
		DefaultLiteralRuleImpl defaultLiteralRule = new DefaultLiteralRuleImpl();
		return defaultLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StringLiteralRule createStringLiteralRule()
	{
		StringLiteralRuleImpl stringLiteralRule = new StringLiteralRuleImpl();
		return stringLiteralRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public VSLPackage getVSLPackage()
	{
		return (VSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VSLPackage getPackage()
	{
		return VSLPackage.eINSTANCE;
	}

} // VSLFactoryImpl
