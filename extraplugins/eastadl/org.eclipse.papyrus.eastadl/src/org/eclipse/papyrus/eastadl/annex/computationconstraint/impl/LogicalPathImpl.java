/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.timing.EventChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getStrand <em>Strand</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getSegment <em>Segment</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getTransformationOccurrence <em>Transformation Occurrence</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getPrecedingExecutionEventChain <em>Preceding Execution Event Chain</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getSucceedingExecutionEventChain <em>Succeeding Execution Event Chain</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getCorrespondingExecutionEventChain <em>Corresponding Execution Event Chain</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getLogicalResponse <em>Logical Response</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl#getLogicalStimulus <em>Logical Stimulus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalPathImpl extends EAElementImpl implements LogicalPath {
	/**
	 * The cached value of the '{@link #getStrand() <em>Strand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStrand()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalPath> strand;

	/**
	 * The cached value of the '{@link #getSegment() <em>Segment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalPath> segment;

	/**
	 * The cached value of the '{@link #getTransformationOccurrence() <em>Transformation Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTransformationOccurrence()
	 * @generated
	 * @ordered
	 */
	protected TransformationOccurrence transformationOccurrence;

	/**
	 * The cached value of the '{@link #getPrecedingExecutionEventChain() <em>Preceding Execution Event Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPrecedingExecutionEventChain()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> precedingExecutionEventChain;

	/**
	 * The cached value of the '{@link #getSucceedingExecutionEventChain() <em>Succeeding Execution Event Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSucceedingExecutionEventChain()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> succeedingExecutionEventChain;

	/**
	 * The cached value of the '{@link #getCorrespondingExecutionEventChain() <em>Corresponding Execution Event Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCorrespondingExecutionEventChain()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> correspondingExecutionEventChain;

	/**
	 * The cached value of the '{@link #getLogicalResponse() <em>Logical Response</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLogicalResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalEvent> logicalResponse;

	/**
	 * The cached value of the '{@link #getLogicalStimulus() <em>Logical Stimulus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLogicalStimulus()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalEvent> logicalStimulus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected LogicalPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputationconstraintPackage.Literals.LOGICAL_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<LogicalPath> getStrand() {
		if (strand == null) {
			strand = new EObjectResolvingEList<LogicalPath>(LogicalPath.class, this, ComputationconstraintPackage.LOGICAL_PATH__STRAND);
		}
		return strand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<LogicalPath> getSegment() {
		if (segment == null) {
			segment = new EObjectResolvingEList<LogicalPath>(LogicalPath.class, this, ComputationconstraintPackage.LOGICAL_PATH__SEGMENT);
		}
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TransformationOccurrence getTransformationOccurrence() {
		if (transformationOccurrence != null && transformationOccurrence.eIsProxy()) {
			InternalEObject oldTransformationOccurrence = (InternalEObject) transformationOccurrence;
			transformationOccurrence = (TransformationOccurrence) eResolveProxy(oldTransformationOccurrence);
			if (transformationOccurrence != oldTransformationOccurrence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComputationconstraintPackage.LOGICAL_PATH__TRANSFORMATION_OCCURRENCE, oldTransformationOccurrence, transformationOccurrence));
			}
		}
		return transformationOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TransformationOccurrence basicGetTransformationOccurrence() {
		return transformationOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTransformationOccurrence(TransformationOccurrence newTransformationOccurrence) {
		TransformationOccurrence oldTransformationOccurrence = transformationOccurrence;
		transformationOccurrence = newTransformationOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputationconstraintPackage.LOGICAL_PATH__TRANSFORMATION_OCCURRENCE, oldTransformationOccurrence, transformationOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EventChain> getPrecedingExecutionEventChain() {
		if (precedingExecutionEventChain == null) {
			precedingExecutionEventChain = new EObjectResolvingEList<EventChain>(EventChain.class, this, ComputationconstraintPackage.LOGICAL_PATH__PRECEDING_EXECUTION_EVENT_CHAIN);
		}
		return precedingExecutionEventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EventChain> getSucceedingExecutionEventChain() {
		if (succeedingExecutionEventChain == null) {
			succeedingExecutionEventChain = new EObjectResolvingEList<EventChain>(EventChain.class, this, ComputationconstraintPackage.LOGICAL_PATH__SUCCEEDING_EXECUTION_EVENT_CHAIN);
		}
		return succeedingExecutionEventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EventChain> getCorrespondingExecutionEventChain() {
		if (correspondingExecutionEventChain == null) {
			correspondingExecutionEventChain = new EObjectResolvingEList<EventChain>(EventChain.class, this, ComputationconstraintPackage.LOGICAL_PATH__CORRESPONDING_EXECUTION_EVENT_CHAIN);
		}
		return correspondingExecutionEventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<LogicalEvent> getLogicalResponse() {
		if (logicalResponse == null) {
			logicalResponse = new EObjectResolvingEList<LogicalEvent>(LogicalEvent.class, this, ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_RESPONSE);
		}
		return logicalResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<LogicalEvent> getLogicalStimulus() {
		if (logicalStimulus == null) {
			logicalStimulus = new EObjectResolvingEList<LogicalEvent>(LogicalEvent.class, this, ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_STIMULUS);
		}
		return logicalStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComputationconstraintPackage.LOGICAL_PATH__STRAND:
			return getStrand();
		case ComputationconstraintPackage.LOGICAL_PATH__SEGMENT:
			return getSegment();
		case ComputationconstraintPackage.LOGICAL_PATH__TRANSFORMATION_OCCURRENCE:
			if (resolve)
				return getTransformationOccurrence();
			return basicGetTransformationOccurrence();
		case ComputationconstraintPackage.LOGICAL_PATH__PRECEDING_EXECUTION_EVENT_CHAIN:
			return getPrecedingExecutionEventChain();
		case ComputationconstraintPackage.LOGICAL_PATH__SUCCEEDING_EXECUTION_EVENT_CHAIN:
			return getSucceedingExecutionEventChain();
		case ComputationconstraintPackage.LOGICAL_PATH__CORRESPONDING_EXECUTION_EVENT_CHAIN:
			return getCorrespondingExecutionEventChain();
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_RESPONSE:
			return getLogicalResponse();
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_STIMULUS:
			return getLogicalStimulus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComputationconstraintPackage.LOGICAL_PATH__STRAND:
			getStrand().clear();
			getStrand().addAll((Collection<? extends LogicalPath>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__SEGMENT:
			getSegment().clear();
			getSegment().addAll((Collection<? extends LogicalPath>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__TRANSFORMATION_OCCURRENCE:
			setTransformationOccurrence((TransformationOccurrence) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__PRECEDING_EXECUTION_EVENT_CHAIN:
			getPrecedingExecutionEventChain().clear();
			getPrecedingExecutionEventChain().addAll((Collection<? extends EventChain>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__SUCCEEDING_EXECUTION_EVENT_CHAIN:
			getSucceedingExecutionEventChain().clear();
			getSucceedingExecutionEventChain().addAll((Collection<? extends EventChain>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__CORRESPONDING_EXECUTION_EVENT_CHAIN:
			getCorrespondingExecutionEventChain().clear();
			getCorrespondingExecutionEventChain().addAll((Collection<? extends EventChain>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_RESPONSE:
			getLogicalResponse().clear();
			getLogicalResponse().addAll((Collection<? extends LogicalEvent>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_STIMULUS:
			getLogicalStimulus().clear();
			getLogicalStimulus().addAll((Collection<? extends LogicalEvent>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComputationconstraintPackage.LOGICAL_PATH__STRAND:
			getStrand().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__SEGMENT:
			getSegment().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__TRANSFORMATION_OCCURRENCE:
			setTransformationOccurrence((TransformationOccurrence) null);
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__PRECEDING_EXECUTION_EVENT_CHAIN:
			getPrecedingExecutionEventChain().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__SUCCEEDING_EXECUTION_EVENT_CHAIN:
			getSucceedingExecutionEventChain().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__CORRESPONDING_EXECUTION_EVENT_CHAIN:
			getCorrespondingExecutionEventChain().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_RESPONSE:
			getLogicalResponse().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_STIMULUS:
			getLogicalStimulus().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComputationconstraintPackage.LOGICAL_PATH__STRAND:
			return strand != null && !strand.isEmpty();
		case ComputationconstraintPackage.LOGICAL_PATH__SEGMENT:
			return segment != null && !segment.isEmpty();
		case ComputationconstraintPackage.LOGICAL_PATH__TRANSFORMATION_OCCURRENCE:
			return transformationOccurrence != null;
		case ComputationconstraintPackage.LOGICAL_PATH__PRECEDING_EXECUTION_EVENT_CHAIN:
			return precedingExecutionEventChain != null && !precedingExecutionEventChain.isEmpty();
		case ComputationconstraintPackage.LOGICAL_PATH__SUCCEEDING_EXECUTION_EVENT_CHAIN:
			return succeedingExecutionEventChain != null && !succeedingExecutionEventChain.isEmpty();
		case ComputationconstraintPackage.LOGICAL_PATH__CORRESPONDING_EXECUTION_EVENT_CHAIN:
			return correspondingExecutionEventChain != null && !correspondingExecutionEventChain.isEmpty();
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_RESPONSE:
			return logicalResponse != null && !logicalResponse.isEmpty();
		case ComputationconstraintPackage.LOGICAL_PATH__LOGICAL_STIMULUS:
			return logicalStimulus != null && !logicalStimulus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // LogicalPathImpl
