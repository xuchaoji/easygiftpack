package com.xuchaoji.craft.easygiftpack;

import org.bukkit.plugin.java.JavaPlugin;

public class EasyGiftPack extends JavaPlugin {
	//enable
	@Override
	public void onEnable() {
		//register command
		this.getCommand("egp").setExecutor(new CommandOfEGP());
		//register listener
		getServer().getPluginManager().registerEvents(new ListenerOfEGP(), this);
	}
	//disable
	@Override
	public void onDisable() {
		
	}

}
