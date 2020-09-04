/*
https://www.hackerrank.com/challenges/between-two-sets/problem
 */
 public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int count=0;
       int m=a.size();
       int n=b.size();
       int f=a.get(m-1);
       int l=b.get(0);
       boolean boolval=false;
       boolean boolval2=false;
       for(int i=f;i<=l;i+=f){
           boolval=checklcm(i,a);
           boolval2=checkhcf(i,b);
           if(boolval==true && boolval2 == true){
               count++;
           }
       }
        return count;
    }
     public static boolean checklcm(int n,List<Integer> a) {
         int flag=0;
         for(int i=0;i<a.size();i++){
             if(n%a.get(i)!=0){
                   flag=1;
                   return false; 
             }  
         }
         return true;
    }
    public static boolean checkhcf(int n,List<Integer> b) {
        int flag=0;
         for(int i=0;i<b.size();i++){
             if(b.get(i)%n!=0){
                   flag=1;
                   return false; 
             }  
         }
         return true;
    }
