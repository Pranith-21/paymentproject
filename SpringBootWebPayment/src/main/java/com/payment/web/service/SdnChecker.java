package com.payment.web.service;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.IOException;
public class SdnChecker{
public boolean checker(String phrase) throws IOException{
      Scanner fileScanner = new Scanner(new File("C:\\Users\\Administrator\\Downloads\\sdnlist.txt"));
      boolean f=true;
//      String phrase="GRUPO MBS LIMITADA";
      Pattern pattern =  Pattern.compile(phrase);
      Matcher matcher = null;
      while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
//            int k=0;
//            for (int i=0;i<line.length();i++)
//            {
//            	if(line.charAt(i)==')')
//            		k=1;
//            	if (k==1 && (line.charAt(i)==',' || line.charAt(i)==';'))
//            	{
//            		break;}
//            	else
//            		k=0;
//            	linetest+=line.charAt(i);
//            }
//            int iend = line.indexOf("),"); 
//            String subString="";
//            if (iend != -1) 
//            {
//                subString= line.substring(0 , iend); //this will give abc
//            }
            matcher = pattern.matcher(line);
            if(matcher.find()){
                f=false;
            
            }      
        }
        return f;
    }
}