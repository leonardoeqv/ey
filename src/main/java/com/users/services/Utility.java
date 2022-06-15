package com.users.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	public static boolean validarEmail(String str) {
		String regxPass = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regxPass);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	public static boolean validarPass(String str) {
		String regx = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
		Pattern pattern = Pattern.compile(regx);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

}
