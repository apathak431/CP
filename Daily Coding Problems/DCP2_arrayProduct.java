/* This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

* @author Aditya Pathak
 * @since 02.08.2020
*/
import java.util.*;
import java.lang.*;
import java.io.*;


class DCP2_arrayProduct
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array:-");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int product=1;
		int[] newarr=new int[n];
		System.out.println("enter elements of array: ");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    product=product*arr[i];
		}
		System.out.println("new array :- ");
		for(int i=0;i<n;i++){
		    newarr[i]=product/arr[i];
		    System.out.println(newarr[i]);
		}
	}
