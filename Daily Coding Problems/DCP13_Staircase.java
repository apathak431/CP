/*
Consider a staircase of size :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.apache.commons.lang3.StringUtils;
public class Solution {

    // Main logic !!
    static void staircase(int n) {
        String str=new String();            
        String str2=new String();
        String space=" ";
        String hash="#";
             for(int i=1;i<=n;i++){
                str=StringUtils.repeat(space,n-i);
                str2=StringUtils.repeat(hash,i);
                 System.out.println(str+str2);
             }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
