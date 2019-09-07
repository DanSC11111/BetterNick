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

public class PlayerCallRandomNickEvent extends Event implements Cancellable {

	public static HandlerList handlers = new HandlerList();
	private Player player;
	private boolean cancelled;
	
	/**
	 * constructor
	 * @param player The player
	 *
	 */
	public PlayerCallRandomNickEvent(Player player) {
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
	 * Call this method to set the player a random nickname, a nametag prefix and a nametag suffix.
	 * The nick name will be chosen from a list in the config.yml
	 * If NametagEdit or ColoredTags is NOT installed on your server,
	 * you can't set a nametag suffix and only a nametag prefix with the length of 2 chars.
	 *
	 * @param nametagprefix The nametag prefix
	 * @param nametagsuffix The nametag suffix
	 *
	 */
	public void setRandomNickName(String nametagprefix, String nametagsuffix) {
		BetterNickAPI.getApi().setRandomPlayerNickName(player, nametagprefix, nametagsuffix);
	}
	
	/**
	 * Call this method to set the player a chat nickname, a chatname prefix and a chatname suffix.
	 * If Vault is disabled in the config.yml or a Vault compatible chat plugin is NOT successfully
	 * hooked into BetterNick, you can't use this method.
	 *
	 * @param nickname The chat nickname
	 * @param chatprefix The chatname prefix
	 * @param chatsuffix The chatname suffix
	 *
	 */
	public void setPlayerChatName(String nickname, String chatprefix, String chatsuffix) {
		BetterNickAPI.getApi().setPlayerChatName(player, nickname, chatprefix, chatsuffix);
	}
	
	/**
	 * Call this method to set the player a display nickname, a displayname prefix and a displayname suffix.
	 *
	 * @param nickname The display nickname
	 * @param displaynameprefix The displayname prefix
	 * @param displaynamesuffix The displayname suffix
	 *
	 */
	public void setPlayerDisplayName(String nickname, String displaynameprefix, String displaynamesuffix) {
		BetterNickAPI.getApi().setPlayerDisplayName(player, nickname, displaynameprefix, displaynamesuffix);
	}
	
	/**
	 * Call this method to set the player a tablist nickname, a tablist prefix and a tablist suffix.
	 *
	 * @param nickname The tablist nickname
	 * @param tablistprefix The tablist name prefix
	 * @param tablistsuffix The tablist name suffix
	 *
	 */
	public void setPlayerTablistName(String nickname, String tablistprefix, String tablistsuffix) {
		BetterNickAPI.getApi().setPlayerTablistName(player, nickname, tablistprefix, tablistsuffix);
	}
	
	/**
	 * @return String The nickname of the player
	 *
	 */
	public String getNickName() {
		return BetterNickAPI.getApi().getNickName(player);
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
