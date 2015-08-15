package com.java.first;

public class StringQues {

	public static void main(String[] args) {
		
		        String str = "Welcome to assessment of string";
		        char c = 'o';
		        String res=str.replaceAll("o", " ");
		        System.out.println(res);
		        System.out.println(remChar(str,c));
		       
		        }

		    public static String remChar(String s, char c){
		        
		        StringBuilder str = new StringBuilder();
		        char[] carr = s.toCharArray();
		        for(int i=0; i<carr.length; i++)
		        {
		            if(carr[i] ==c)
		            {

		            } 
		            else {
		            	 str.append(carr[i]);
		            }
		        }
		        return str.toString();
		    }
		        
		     
		

	}


