/*
 * All rights by DomeDD (2019)
 * You are allowed to modify this code
 * You are allowed to use this code in your plugins for private projects
 * You are allowed to publish your plugin including this code as long as your plugin is for free and as long as you mention me (DomeDD) 
 * You are NOT allowed to claim this plugin (BetterNick) as your own
 * You are NOT allowed to publish this plugin (BetterNick) or your modified version of this plugin (BetterNick)
 * 
 */
package de.domedd.betternick.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import de.domedd.betternick.api.betternickapi.BetterNickAPI;

public class PlayerCallRandomSkinEvent extends Event implements Cancellable {

	public static HandlerList handlers = new HandlerList();
	private Player player;
	private boolean cancelled;
	
	/**
	 * constructor
	 * @param player The player
	 *
	 */
	public PlayerCallRandomSkinEvent(Player player) {
		this.player = player;
		cancelled = false;
	}
	
	/**
	 * @return Player The player
	 *
	 */
	public Player getPlayer() {
		return player;
	}
	
	/**
	 * Call this method to set a player a new random skin.
	 *
	 */
	public void setRandomSkin() {
		BetterNickAPI.getApi().setRandomPlayerSkin(player);
	}
	
	/**
	 * @return String The skin of the player
	 *
	 */
	public String getSkin() {
		return BetterNickAPI.getApi().getSkin(player);
	}
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	public static HandlerList getHandlerList() {
		return handlers;
	}
	@Override
	public boolean isCancelled() {
		return cancelled;
	}
	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}
