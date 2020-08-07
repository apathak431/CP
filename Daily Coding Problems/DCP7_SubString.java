/*
This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
* @author Aditya Pathak
 * @since 07.08.2020
*/


import java.util.*;
import java.lang.*;
import java.io.*;



class DCP7_SubString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Checker String:");
		String check=sc.next();
		
		System.out.println("Enter lenght of array:");
		int n=sc.nextInt();
		
		String[] arr=new String[n];
	
		
		System.out.println("Enter elements of array:");
	
		for(int i=0;i<n;i++){
		    arr[i]=sc.next();
		    if(check.equals(arr[i].substring( 0,check.length()))==true ){
		        
		        System.out.println(arr[i]);
		        
		    }
		    
		}
		
	}
}

