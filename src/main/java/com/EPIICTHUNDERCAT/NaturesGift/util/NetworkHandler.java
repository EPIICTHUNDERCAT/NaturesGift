package com.EPIICTHUNDERCAT.NaturesGift.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkHandler {
	
	public static boolean networkAvailable(){
    	try {
    		final URL url = new URL("http://www.google.com");
    		final URLConnection con = url.openConnection();
    		con.connect();
    		return true;
    	} 
    	catch (MalformedURLException e) {
    		throw new RuntimeException(e);
    	}
    	catch (IOException e) {
    		return false;
    	}	    	
    }

}
