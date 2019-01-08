package com.ultratechx.moddl;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class ModDLEventHandler {
	@SubscribeEvent
	public void onJoin(PlayerEvent.PlayerLoggedInEvent event){
		
	}
	
	@SubscribeEvent
	public void onDisconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent event){
		
	}
	
	@SubscribeEvent
	public void onConnect(FMLNetworkEvent.ClientConnectedToServerEvent event){
		
	}
}
