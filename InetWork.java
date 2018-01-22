package com.gmail.veselov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class InetWork {
	
	public static String getStringFromURL (String address) {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(address);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			InputStream is = con.getInputStream();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is));
			String text = "";
			for (;(text = br.readLine()) != null;) {
				sb.append(text).append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
		
	}
	
	public static Map<String, List<String>> getHeaderFromURL (String address){
		Map<String, List<String>> result = null;
		try {
			URL url = new URL(address);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			result = con.getHeaderFields();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	

}
