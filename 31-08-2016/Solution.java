import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	System.out.println(longestSubString(s));
    }
    static String longestSubString(String s){
        int sLength = s.length();
        String longestSubString="";
        if(sLength == 1){
            longestSubString = s;
        }
        else if(s.substring(0,sLength/2).equals(s.substring(sLength/2, sLength))){
            longestSubString = s.substring(0,sLength/2);
        }
        else{
            for(int i = 1;i < sLength; i++){
                if(s.substring(0, i).equals(s.substring(sLength-i, sLength)) && i <= sLength/2){
                    longestSubString = s.substring(0,i);
                }
            }
        }
        return longestSubString;
    }
}
