package com.EPIICTHUNDERCAT.NaturesGift.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;
import com.EPIICTHUNDERCAT.NaturesGift.Reference;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class VersionCheck implements Runnable{
	
	 private static String latestRev;
	    
	    public static void check(FMLPreInitializationEvent preEvent) {
	    	if (NaturesGift.getUpdates == true){
	    		NaturesGift.versionChecker = new VersionCheck();
	        	Thread versionCheckThread = new Thread(NaturesGift.versionChecker);
	        	versionCheckThread.start();
	        }
	    }

	    @Override
	    public void run() {
	    	InputStream versionFile = null;
	    	try{
	    		versionFile = new URL("https://raw.githubusercontent.com/EPIICTHUNDERCAT/NaturesGift/master/latest-1.10.2").openStream();
	    	} 
	    	catch (MalformedURLException e) {
	    		e.printStackTrace();
	    	} 
	    	catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    	try {
	    		latestRev = IOUtils.readLines(versionFile).get(0);
	    	} 
	    	catch (IOException e) {
	    			e.printStackTrace();
	    	} 
	    	finally {
	    		IOUtils.closeQuietly(versionFile);
	    	}
	    	NaturesGift.latest = latestRev;
	    	NaturesGift.isLatest = Reference.VER.equals(latestRev);
	    	String output = NaturesGift.isLatest == true ? "Recommended " + Reference.NAME + " version:" + latestRev : "Recommended " + Reference.NAME + " version:" + latestRev + " You are running a different version!";
	    	System.out.println(output);        
	    }
	    
	    public boolean isLatestVersion() {
	     return NaturesGift.isLatest;
	    }
	    
	    public String getLatestVersion() {
	     return latestRev;
	    }
	    
	    public static boolean getWarning(PlayerTickEvent event) {
	    	boolean warned = NaturesGift.warned;
	    	if (!warned && event.player.worldObj.isRemote && NaturesGift.isLatest == false && NaturesGift.getUpdates != false){
	            TextComponentString update = new TextComponentString("[Update to " + latestRev + "]");
	            Style link = new Style();
	            link.setBold(true);
	           	link.setUnderlined(true);
	           	link.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString("Click here to visit the Curse page.")));
	           	/*
	           	 * Need to set the URL to project page once it  is created
	           	 * 
	           	link.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "http://mods.curse.com/mc-mods/minecraft/CHANGE_THIS"));
	            */
	            update.setStyle(link);
	            event.player.addChatMessage(new TextComponentString("NaturesGift is not the recommended version!"));
	            event.player.addChatMessage(update);
	            NaturesGift.warned = true;
	    	}
	    	return warned;
	    }

}
