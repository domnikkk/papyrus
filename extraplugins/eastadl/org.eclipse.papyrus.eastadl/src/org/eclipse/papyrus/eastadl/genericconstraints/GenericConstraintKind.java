/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.genericconstraints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generic Constraint Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration for different type of constraints.
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.genericconstraints.GenericconstraintsPackage#getGenericConstraintKind()
 * @model
 * @generated
 */
public enum GenericConstraintKind implements Enumerator {
	/**
	 * The '<em><b>Cable Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CABLE_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	CABLE_LENGTH(0, "cableLength", "cableLength"), /**
	 * The '<em><b>Current</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT(1, "current", "current"), /**
	 * The '<em><b>Development Cost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DEVELOPMENT_COST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_COST(2, "developmentCost", "developmentCost"), /**
	 * The '<em><b>Function Allocation Different HW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FUNCTION_ALLOCATION_DIFFERENT_HW_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_ALLOCATION_DIFFERENT_HW(3, "functionAllocationDifferentHW", "functionAllocationDifferentHW"), /**
	 * The '<em><b>Function Allocation Same HW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FUNCTION_ALLOCATION_SAME_HW_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_ALLOCATION_SAME_HW(4, "functionAllocationSameHW", "functionAllocationSameHW"), /**
	 * The '<em><b>Impedance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #IMPEDANCE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPEDANCE(5, "impedance", "impedance"), /**
	 * The '<em><b>Insulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #INSULATION_VALUE
	 * @generated
	 * @ordered
	 */
	INSULATION(6, "insulation", "insulation"), /**
	 * The '<em><b>Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY(7, "memory", "memory"), /**
	 * The '<em><b>Non Volatile Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #NON_VOLATILE_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	NON_VOLATILE_MEMORY(8, "nonVolatileMemory", "nonVolatileMemory"), /**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(9, "other", "other"), /**
	 * The '<em><b>Piece Cost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #PIECE_COST_VALUE
	 * @generated
	 * @ordered
	 */
	PIECE_COST(10, "pieceCost", "pieceCost"), /**
	 * The '<em><b>Power Consumption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #POWER_CONSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_CONSUMPTION(11, "powerConsumption", "powerConsumption"), /**
	 * The '<em><b>Power Supply Independent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #POWER_SUPPLY_INDEPENDENT_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_SUPPLY_INDEPENDENT(12, "powerSupplyIndependent", "powerSupplyIndependent"), /**
	 * The '<em><b>Realization Different</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #REALIZATION_DIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	REALIZATION_DIFFERENT(13, "realizationDifferent", "realizationDifferent"), /**
	 * The '<em><b>Realization Same</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #REALIZATION_SAME_VALUE
	 * @generated
	 * @ordered
	 */
	REALIZATION_SAME(14, "realizationSame", "realizationSame"), /**
	 * The '<em><b>Space Redundancy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SPACE_REDUNDANCY_VALUE
	 * @generated
	 * @ordered
	 */
	SPACE_REDUNDANCY(15, "spaceRedundancy", "spaceRedundancy"), /**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(16, "standard", "standard"), /**
	 * The '<em><b>Time Redundancy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #TIME_REDUNDANCY_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_REDUNDANCY(17, "timeRedundancy", "timeRedundancy"), /**
	 * The '<em><b>Utilization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #UTILIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	UTILIZATION(18, "utilization", "utilization"), /**
	 * The '<em><b>Voltage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #VOLTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE(19, "voltage", "voltage"), /**
	 * The '<em><b>Volatile Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #VOLATILE_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	VOLATILE_MEMORY(20, "volatileMemory", "volatileMemory"), /**
	 * The '<em><b>Weight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #WEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT(21, "weight", "weight");

	/**
	 * The '<em><b>Cable Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cable Length</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CABLE_LENGTH
	 * @model name="cableLength"
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_LENGTH_VALUE = 0;

	/**
	 * The '<em><b>Current</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Current</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CURRENT
	 * @model name="current"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_VALUE = 1;

	/**
	 * The '<em><b>Development Cost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Development Cost</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DEVELOPMENT_COST
	 * @model name="developmentCost"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_COST_VALUE = 2;

	/**
	 * The '<em><b>Function Allocation Different HW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Allocation Different HW</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FUNCTION_ALLOCATION_DIFFERENT_HW
	 * @model name="functionAllocationDifferentHW"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_ALLOCATION_DIFFERENT_HW_VALUE = 3;

	/**
	 * The '<em><b>Function Allocation Same HW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Allocation Same HW</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FUNCTION_ALLOCATION_SAME_HW
	 * @model name="functionAllocationSameHW"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_ALLOCATION_SAME_HW_VALUE = 4;

	/**
	 * The '<em><b>Impedance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Impedance</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #IMPEDANCE
	 * @model name="impedance"
	 * @generated
	 * @ordered
	 */
	public static final int IMPEDANCE_VALUE = 5;

	/**
	 * The '<em><b>Insulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insulation</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #INSULATION
	 * @model name="insulation"
	 * @generated
	 * @ordered
	 */
	public static final int INSULATION_VALUE = 6;

	/**
	 * The '<em><b>Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MEMORY
	 * @model name="memory"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VALUE = 7;

	/**
	 * The '<em><b>Non Volatile Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Volatile Memory</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NON_VOLATILE_MEMORY
	 * @model name="nonVolatileMemory"
	 * @generated
	 * @ordered
	 */
	public static final int NON_VOLATILE_MEMORY_VALUE = 8;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 9;

	/**
	 * The '<em><b>Piece Cost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Piece Cost</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #PIECE_COST
	 * @model name="pieceCost"
	 * @generated
	 * @ordered
	 */
	public static final int PIECE_COST_VALUE = 10;

	/**
	 * The '<em><b>Power Consumption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Consumption</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #POWER_CONSUMPTION
	 * @model name="powerConsumption"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CONSUMPTION_VALUE = 11;

	/**
	 * The '<em><b>Power Supply Independent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Supply Independent</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #POWER_SUPPLY_INDEPENDENT
	 * @model name="powerSupplyIndependent"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SUPPLY_INDEPENDENT_VALUE = 12;

	/**
	 * The '<em><b>Realization Different</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Realization Different</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #REALIZATION_DIFFERENT
	 * @model name="realizationDifferent"
	 * @generated
	 * @ordered
	 */
	public static final int REALIZATION_DIFFERENT_VALUE = 13;

	/**
	 * The '<em><b>Realization Same</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Realization Same</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #REALIZATION_SAME
	 * @model name="realizationSame"
	 * @generated
	 * @ordered
	 */
	public static final int REALIZATION_SAME_VALUE = 14;

	/**
	 * The '<em><b>Space Redundancy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Space Redundancy</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SPACE_REDUNDANCY
	 * @model name="spaceRedundancy"
	 * @generated
	 * @ordered
	 */
	public static final int SPACE_REDUNDANCY_VALUE = 15;

	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #STANDARD
	 * @model name="standard"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 16;

	/**
	 * The '<em><b>Time Redundancy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Redundancy</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TIME_REDUNDANCY
	 * @model name="timeRedundancy"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_REDUNDANCY_VALUE = 17;

	/**
	 * The '<em><b>Utilization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Utilization</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #UTILIZATION
	 * @model name="utilization"
	 * @generated
	 * @ordered
	 */
	public static final int UTILIZATION_VALUE = 18;

	/**
	 * The '<em><b>Voltage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voltage</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #VOLTAGE
	 * @model name="voltage"
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_VALUE = 19;

	/**
	 * The '<em><b>Volatile Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Volatile Memory</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #VOLATILE_MEMORY
	 * @model name="volatileMemory"
	 * @generated
	 * @ordered
	 */
	public static final int VOLATILE_MEMORY_VALUE = 20;

	/**
	 * The '<em><b>Weight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weight</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #WEIGHT
	 * @model name="weight"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_VALUE = 21;

	/**
	 * An array of all the '<em><b>Generic Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final GenericConstraintKind[] VALUES_ARRAY =
			new GenericConstraintKind[] {
					CABLE_LENGTH,
					CURRENT,
					DEVELOPMENT_COST,
					FUNCTION_ALLOCATION_DIFFERENT_HW,
					FUNCTION_ALLOCATION_SAME_HW,
					IMPEDANCE,
					INSULATION,
					MEMORY,
					NON_VOLATILE_MEMORY,
					OTHER,
					PIECE_COST,
					POWER_CONSUMPTION,
					POWER_SUPPLY_INDEPENDENT,
					REALIZATION_DIFFERENT,
					REALIZATION_SAME,
					SPACE_REDUNDANCY,
					STANDARD,
					TIME_REDUNDANCY,
					UTILIZATION,
					VOLTAGE,
					VOLATILE_MEMORY,
					WEIGHT,
			};

	/**
	 * A public read-only list of all the '<em><b>Generic Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<GenericConstraintKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generic Constraint Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GenericConstraintKind get(int value) {
		switch (value) {
		case CABLE_LENGTH_VALUE:
			return CABLE_LENGTH;
		case CURRENT_VALUE:
			return CURRENT;
		case DEVELOPMENT_COST_VALUE:
			return DEVELOPMENT_COST;
		case FUNCTION_ALLOCATION_DIFFERENT_HW_VALUE:
			return FUNCTION_ALLOCATION_DIFFERENT_HW;
		case FUNCTION_ALLOCATION_SAME_HW_VALUE:
			return FUNCTION_ALLOCATION_SAME_HW;
		case IMPEDANCE_VALUE:
			return IMPEDANCE;
		case INSULATION_VALUE:
			return INSULATION;
		case MEMORY_VALUE:
			return MEMORY;
		case NON_VOLATILE_MEMORY_VALUE:
			return NON_VOLATILE_MEMORY;
		case OTHER_VALUE:
			return OTHER;
		case PIECE_COST_VALUE:
			return PIECE_COST;
		case POWER_CONSUMPTION_VALUE:
			return POWER_CONSUMPTION;
		case POWER_SUPPLY_INDEPENDENT_VALUE:
			return POWER_SUPPLY_INDEPENDENT;
		case REALIZATION_DIFFERENT_VALUE:
			return REALIZATION_DIFFERENT;
		case REALIZATION_SAME_VALUE:
			return REALIZATION_SAME;
		case SPACE_REDUNDANCY_VALUE:
			return SPACE_REDUNDANCY;
		case STANDARD_VALUE:
			return STANDARD;
		case TIME_REDUNDANCY_VALUE:
			return TIME_REDUNDANCY;
		case UTILIZATION_VALUE:
			return UTILIZATION;
		case VOLTAGE_VALUE:
			return VOLTAGE;
		case VOLATILE_MEMORY_VALUE:
			return VOLATILE_MEMORY;
		case WEIGHT_VALUE:
			return WEIGHT;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generic Constraint Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GenericConstraintKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenericConstraintKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generic Constraint Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GenericConstraintKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenericConstraintKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private GenericConstraintKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // GenericConstraintKind
