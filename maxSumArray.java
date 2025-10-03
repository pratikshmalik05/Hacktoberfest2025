public class maxSubarray {
    public static void maxSubarray( int number[]) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i< number.length; i++){
            int start = i ;
            for (int j=i; j<number.length;j++){
                int end = j;
                currSum = 0;
                for (int k = start; k<=end;k++){
                    currSum += number[k];
                }
                System.out.println(currSum);
                if ( currSum>maxSum){
                    maxSum = currSum;
                    
                }

                
            }
        }
        System.out.println("maximum sum of array is:"+maxSum);
        
    } 
    public static void main(String[] args) {
        int number[] = {2,3,4,-4,7,-6,8};
        maxSubarray(number);
    }
    
    
}
