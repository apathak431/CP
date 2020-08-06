/*
This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array. The array can contain 
duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
* @author Aditya Pathak
 * @since 03.08.2020
*/

import java.util.*;
import java.lang.*;
import java.io.*;


class DCP3_SmallestPositiveInt
{
	public static void main (String[] args) throws java.lang.Exception
	{
	System.out.println("Enter the length of Array:- ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter the content of Array:- ");
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	int flag=0;
	int j=0;
	while(flag==0){
	    for(int i=0;i<n;i++){
	        if(arr[i]==j){
	           flag=1;
	        }
	    }
	    if(flag==1){
	        flag=0;
	        j++;
	    }
	    else break;
	}
	System.out.println("Smallest positive number missing is :"+j);
	
	}
}
