String binary=Integer.toBinaryString(n);
      
        int count=0;
        int max=0;
        for(int j=0;j<binary.length();j++){
            if(binary.charAt(j)=='0'){
                count=0;
            }
            else
            {
                count++;
                max=Math.max(max,count);
            }

        }
        System.out.println(max);
