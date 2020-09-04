/*
https://www.hackerrank.com/challenges/breaking-best-and-worst-records
*/

static int[] breakingRecords(int[] scores) {
        int[] output=new int[2];
        output[0]=0;
        output[1]=0;
        int min=scores[0];
        int max=scores[0];
        for(int i=1;i<scores.length;i++){
            if(scores[i]<min){
                min=scores[i];
                output[1]+=1;
            }
            else if(scores[i]>max){
                max=scores[i];
                output[0]+=1;
            }
        }
    return output;
    }
