/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/

 static void miniMaxSum(int[] arr) {
       long max=0;
        long min=0;
        long sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        min=sum-arr[0];
        max=sum-arr[0];
        for(int i=1;i<n;i++){
            if(sum-arr[i]<min){
                min=sum-arr[i];
            }
            else if(sum-arr[i]>max){
                max=sum-arr[i];
            }
        }
        System.out.println(min+" "+max);

    }
