package FCM.util;

import FCM.Connector;

/**
 * Interface used by extension point for embedding rules
 */
public interface IEmbeddingRule {
	/**
	 * Return a role binding table for a given connector
	 * @param connector the connector
	 * @return role binding table
	 */
	public FCMUtil.RoleBindingTable getRoleBindings (Connector connector);

}