package org.eclipse.papyrus.tests.framework.m2t.xtend.templates;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.ValueSpecification;

public class Queries {

	public static InstanceSpecification getDefaultValueInstanceSpecification(org.eclipse.uml2.uml.Class clazz, String propertyName) {
		EList<Property> attributes = clazz.getAttributes();
		for(Property attribute : attributes) {
			if(attribute.getName().equalsIgnoreCase(propertyName)) {
				return ((InstanceValue)attribute.getDefaultValue()).getInstance();
			}
		}
		throw new RuntimeException("Attribute _" + propertyName + "_ not found in class " + clazz.getName());
	}

	public static String getStringSlotValue(InstanceSpecification instanceSpecification, String slotName) {
		if(instanceSpecification == null)
			throw new RuntimeException("instance argument is null!");
		EList<Slot> slots = instanceSpecification.getSlots();
		for(Slot slot : slots) {
			StructuralFeature definingFeature = slot.getDefiningFeature();
			String name = definingFeature.getName();
			if(name.equalsIgnoreCase(slotName)) {
				EList<ValueSpecification> values = slot.getValues();
				ValueSpecification value = values.get(0);
				return ((LiteralString)value).getValue();
			}
		}
		throw new RuntimeException("Slot _" + slotName + "_ not found in instance " + instanceSpecification);
	}

	public static InstanceSpecification getInstanceSlotValue(InstanceSpecification instance, String slotName) {
		if(instance == null)
			throw new RuntimeException("instance argument is null!");
		if(instance.eIsProxy()) {
			EcoreUtil.resolve(instance, instance.eResource());
		}
		EList<Slot> slots = instance.getSlots();
		for(Slot slot : slots) {
			if(slot.getDefiningFeature().getName().equalsIgnoreCase(slotName)) {
				if(slot.getValues().isEmpty()) {
					throw new RuntimeException(slotName + " in " + instance + " has no values");
				}
				ValueSpecification value = slot.getValues().get(0);
				InstanceSpecification instanceSpec = ((InstanceValue)value).getInstance();
				if(instanceSpec.eIsProxy()) {
					EcoreUtil.resolve(instanceSpec, instance.eResource());
				}
				return instanceSpec;
			}
		}
		throw new RuntimeException("Slot _" + slotName + "_ not found in instance " + instance);
	}

	public static String getSlotValueDefaultInstanceSpecification(org.eclipse.uml2.uml.Class clazz, String propertyName, String slotName) {
		return getStringSlotValue(getDefaultValueInstanceSpecification(clazz, propertyName), slotName);
	}
}
