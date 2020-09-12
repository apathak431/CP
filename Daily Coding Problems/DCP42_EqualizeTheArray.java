/*
https://www.hackerrank.com/challenges/equality-in-a-array/problem
*/
static int equalizeArray(int[] arr) {
        
        int [] fr = new int [arr.length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        int max=fr[0];
        for(int j=1;j<fr.length;j++){
            if(fr[j]>max){
                max=fr[j];
            }
        }

        return arr.length-max;
    }
