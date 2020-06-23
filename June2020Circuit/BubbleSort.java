

import java.util.Scanner;


class TestClass {
    public static void main(String args[] ) throws Exception {
      
       
    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int count=0;
      boolean swapped=true;
       do{ swapped=false;
       count++;
           for (int j = 0; j < n-1; j++)
                if (arr[j] > arr[j+1]) 
                {    swapped=true;
                    
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
                 
                 } while(swapped!=false);
            
    System.out.println(count);

    }
}
