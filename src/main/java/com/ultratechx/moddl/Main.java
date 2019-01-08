package com.ultratechx.moddl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.ultratechx.moddl.proxy.CommonProxy;
import com.ultratechx.moddl.util.Reference;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS )
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		/*
		 //ModDL Update Checking, comment when my father blocks my server (gigabit internet isnt as useful when I cant use it :/)
		URL url;
		try {
			url = new URL("http://opifexdev.net/Util/CheckVersion.php");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String message = in.readLine();
			in.close();
			con.disconnect();
			if(!message.equals(Reference.VERSION)){
				//set update flag to start helper in update mode when in main menu
			}
		} catch (MalformedURLException e) {
			System.out.println("FAILED TO CONTACT MODDL FOR VERSION INFO, EITHER THE WEBSITE IS DOWN OR THE HOST HAS CHANGED, PLEASE CONFIRM YOU ARE USING THE LATEST UPDATE AND TRY AGAIN LATER");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("FAILED TO CONTACT MODDL FOR VERSION INFO, EITHER THE WEBSITE IS DOWN OR THE HOST HAS CHANGED, PLEASE CONFIRM YOU ARE USING THE LATEST UPDATE AND TRY AGAIN LATER");
			e.printStackTrace();
		}
		*/
		MinecraftForge.EVENT_BUS.register(new ModDLEventHandler());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
}
