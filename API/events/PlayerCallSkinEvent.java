/*
 * All rights by DomeDD (2018)
 * You are allowed to modify this code
 * You are allowed to use this code in your plugins for private projects
 * You are allowed to publish your plugin including this code as long as your plugin is for free and as long as you mention me (DomeDD) 
 * You are NOT allowed to claim this plugin (BetterNick) as your own
 * You are NOT allowed to publish this plugin (BetterNick) or your modified version of this plugin (BetterNick)
 * 
 */
package de.domedd.betternick.api.events;

class PlayerCallSkinEvent extends Event implements Cancellable {
	
	/**
	 * constructor
	 * Call this when a player should get a new skin.
	 * @param player The player
	 *
	 */
	PlayerCallSkinEvent(Player player, String skin);
	
	/**
	 * @return Player The player
	 *
	 */
	Player getPlayer();
	
	/**
	 * Call this method to set a player a new skin.
	 *
	 * @param skin The new skin
	 *
	 */
	void setSkin(String skin);
	
	/**
	 * @return String The skin of the player
	 *
	 */
	String getSkin();
}
