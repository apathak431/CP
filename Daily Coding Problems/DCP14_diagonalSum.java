/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
*/

 public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int sum1=0;
        int sum2=0;
        int n = arr.get(0).size();

        
            for(int i = 0; i < n; i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get((n-1)-i).get(i);

        }
        return Math.abs(sum1-sum2);

}
}
