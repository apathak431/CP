/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/
import java.util.*;
import java.lang.*;
import java.io.*;


class DCP1_arrayproblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		int n=sc.nextInt();
		int flag=0;
		System.out.println("enter array:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter k:");
		int k=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        if(k==(arr[i]+arr[j])){
		            flag=1;
		            System.out.println(arr[i]+" "+arr[j]);
		            break;
		        }
		    }
		    if(flag ==1) {break;}
		    else continue;
		    
		}
		if(flag==0){System.out.println("not found");}
	}
}
