package com.xuchaoji.craft.easygiftpack;

import org.bukkit.plugin.java.JavaPlugin;

public class EasyGiftPack extends JavaPlugin {
	//enable
	@Override
	public void onEnable() {
		//register command
		this.getCommand("egp").setExecutor(new CommandOfEGP());
	}
	//disable
	@Override
	public void onDisable() {
		
	}

}
