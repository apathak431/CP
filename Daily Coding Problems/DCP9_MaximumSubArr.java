/*
This problem was asked by Google.

Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class DCP9_MaximumSubArr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//length of array
		int k=sc.nextInt();//subarray length
		int[] arr=new int[n];
	
		int max;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
			for(int i=0;i<=n-k;i++){
		       max = arr[i]; 
  
            for (int j = 1; j < k; j++) { 
                if (arr[i + j] >= max) 
                    max = arr[i + j]; 
            } 
             System.out.print(max + " ");
		    }
		}
	}

