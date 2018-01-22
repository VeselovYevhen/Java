package com.gmail.veselov;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String address = "https://prog.kiev.ua/forum/index.php";
		//String text = InetWork.getStringFromURL(address);
		//System.out.println(text);
		
		Map<String, List<String>> result = InetWork.getHeaderFromURL(address);
		
		result.forEach((key, value) -> System.out.println(key + " : " + value));

	}

}
