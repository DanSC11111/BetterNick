/*
 * All rights by DomeDD (2019)
 * You are allowed to modify this code
 * You are allowed to use this code in your plugins for private projects
 * You are allowed to publish your plugin including this code as long as your plugin is for free and as long as you mention me (DomeDD) 
 * You are NOT allowed to claim this plugin (BetterNick) as your own
 * You are NOT allowed to publish this plugin (BetterNick) or your modified version of this plugin (BetterNick)
 * 
 */
package de.domedd.betternick.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.domedd.betternick.BetterNick;
import de.domedd.betternick.api.betternickapi.BetterNickAPI;

public class SeeNickCommand implements CommandExecutor {

	private BetterNick pl;
	
	public SeeNickCommand(BetterNick main) {
		this.pl = main;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdlable, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(args.length == 0) {
				if(p.hasPermission("BetterNick.SeeNick")) {
					p.sendMessage(pl.prefix + pl.getConfig().getString("Messages.See Nick Name").replace("[NAME]", BetterNickAPI.getApi().getNickName(p)).replace("&", "�"));
				} else {
					if(pl.getConfig().getBoolean("Messages.Enabled")) {
						p.sendMessage(pl.prefix + pl.getConfig().getString("Messages.No Permissions").replace("&", "�"));
					}
				}
			}
		}
		return true;
	}
}
