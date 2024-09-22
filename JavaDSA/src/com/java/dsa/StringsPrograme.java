package com.java.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringsPrograme {
	static int sum(int n) {
	    if (n == 1) {
	        return 1; // Base case
	    }
	    System.out.println(n);
	    return sum(n - 1);
	    // Recursive case
	}

	public static void main(String[] args) {
		
		System.out.println(sum(6));
		List list =new ArrayList<>();
//        
        String str ="harshith";
        int n = str.length();
        char[] ch = str.toCharArray();
        
        for(int i=0; i<n ; i++) {
        	
        	list.add(ch[i]);
        }
        Collections.sort(list);
        
        

    	System.out.println(list);

        list.add('s');
        list.add('a');
        list.add('h');
        list.add('r');
        list.add('s');

        
        Iterator itr = list.iterator();
        Collections.sort(list);
        //System.out.println(list);
//        while(itr.hasNext()){
//        	
//        	
//                System.out.println(itr.next());
//
//            }
        
//        String na ="welcome";
//        String me ="Harsha";
//        
//        StringBuffer sb=new StringBuffer(na);
//        
//        sb.insert(5, me);
//        String s1 =sb.toString();
//        System.out.println(s1);
        
        String original ="welcome";
        String tobeadd ="Harsha";
        String res =new String();
         for(int i =0;i<original.length();i++) {
        	 res += original.charAt(i);
        	 
        	 if(i==2) {
        		 
        		 res +=tobeadd;
        	 }
        	 
             System.out.println(res);

         }
       //  ================================================================
         String pal="Malayala";
         String d =pal.toLowerCase();
         char[] c =d.toCharArray();
         int le=d.length();  
         char[] x = new char[le];
         for(int i=0;i<=le-1;i++) {
             int j=i;

        	 x[le-i-1]= d.charAt(i);
        	 x[le-i-1]= c[i];
        	 //j--;        	 
         }
         //boolean isPalindrome =true;
         String sd = new String(x);
         System.out.println("sd : "+sd.hashCode());
         System.out.println("d :"+d.hashCode());
         if(d.equals(sd)) {
        	// isPalindrome =true;
        	 System.out.println("it is palindrome");
        	 
         }
         else {
        	// isPalindrome =false;
        	 System.out.println("not a palidrome");

         }
         
        String h1 ="Hello";
        String toadding ="Hi,";
        
        
	}
}
