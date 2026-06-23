// Yeh maine khudse likha hai bhale yeh brute force ho phir bhi yeh maine likha hai khudse!!
// Code: Brute Force

// public class sortarrof012{


//     public static int[] sortarr(int []arr){
//         int cnt0 = 0;
//         int cnt1 = 0;
//         int cnt2 = 0;

//         for(int i = 0; i<arr.length;i++){
//             if(arr[i]==0){
//                 cnt0++;
//             }

//             if(arr[i]==1){
//                 cnt1++;
//             }

//             if(arr[i]==2){
//                 cnt2++;
//             }
//         }

//         int index = 0;

//         while(cnt0-->0){
//             arr[index++]=0;
//         }

//            while(cnt1-->0){
//             arr[index++]=1;
//         }

//            while(cnt2-->0){
//             arr[index++]=2;
//         }

//         return arr;
//     }



//     public static void main(String[] args) {
//         int[] nums = {1, 0, 2, 1, 0};

//         sortarr(nums);

//         for(int num : nums) {
//             System.out.print(num + " ");
//         }
        
//     }
// }


// Optimized
public class sortarrof012{

    public static int[] sort(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid<=high) {

        if(arr[mid]==0){
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++; 
        }
        else if(arr[mid]==1){
            mid++;
        }
        else { // arr[mid]==2
            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;
            high--;
        }

            
        }


        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}