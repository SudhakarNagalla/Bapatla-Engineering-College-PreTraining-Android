import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {
		
		String s = "abcdefabcd",longSubString="";
		System.out.println("The Longest Substring that appears at both the beginning and end of the string is:"+longSubString(s));
    }
	
	static String longSubString(String s){
		String ls="";
		int strLength = s.length();
		if (s.substring(0, strLength/2).equals(s.substring(strLength/2, strLength))) {
			ls = s.substring(0, strLength/2);
		}
		else{
			for (int i = 1; i < strLength; i++) {
				if (s.substring(0, i).equals(s.substring(strLength-i, strLength) )) {
					ls = s.substring(0, i);
				}
			}
		}
		return ls;
	}
	
}