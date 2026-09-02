package Arrays;
// Kadane's algorithm :
// For logic refer your notebook;

// public class Kadane {

//     public static int Kadane(int []nums){

//         long maxi = Long.MIN_VALUE;
//         long sum = 0 ;

//         for(int i = 0 ; i< nums.length ; i++){
//             sum+=nums[i];
//             if(sum>maxi){
//                 maxi = sum;
//             }

//             if(sum < 0 ){
//                 sum = 0;
//             }
//         }
//         return (int) maxi;
//     }

//     public static void main(String[] args) {

//         int []arr = {-2,-3,4,-1,-2,1,5,-3};
//        int ans =  Kadane(arr);
//         System.err.println(ans);       
//     }
    
// }
