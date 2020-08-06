/* This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.
* @author Aditya Pathak
 * @since 04.08.2020
*/


import java.util.*;
import java.lang.*;
import java.io.*;


class DCP4_encodingProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
	System.out.println("Please enter Number only: ");
	Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int count=1;
    int test;
    String substr = "";
    for(int i=0;i+1<str.length();i++){
        substr=str.substring(i, i+1);
        test=Integer.parseInt(substr);
            if(test<26){
            count++;
            }
        }
        System.out.println(count);
	}
}
