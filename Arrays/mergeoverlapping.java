package Arrays;
// Brute Force: 

// import java.util.*;

// public class mergeoverlapping {

//     public static List<List<Integer>> merge(int [][]intervals){
//         int n = intervals.length;
//         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//         List<List<Integer>> ans = new ArrayList<>();
        
//         int i = 0;
//         while(i<n){
//             int start = intervals[i][0];
//             int end = intervals[i][1];

//             int j = i+1;
//             if(j<n && intervals[j][0]<=end){
//                 end=Math.max(end, intervals[j][1]);
//                 j++;
//             }
//             ans.add(Arrays.asList(start,end));
//             i=j;
//         }
//         return ans;
//     }
    


//     public static void main(String[] args) {

//          int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//         List<List<Integer>> result = merge(intervals);
//         for (List<Integer> interval : result) {
//             System.out.print(interval + " ");
//         }
        
//     }
// }

// Optimized:
// Logic:Rather than iterating over and over again go with single iteration and assign values:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeoverlapping{

    public static List<List<Integer>> merge(int [][]intervals){
        
        Arrays.sort(intervals,
            (a,b)-> Integer.compare(a[0], b[0])
        );
        List<List<Integer>> merged = new ArrayList<>();
        

        for(int []interval : intervals){
            if(merged.isEmpty() || merged.get(merged.size()-1).get(1)<interval[0]){
                merged.add(Arrays.asList(interval[0],interval[1]));
            }

            else{
                int last = merged.size()-1;
                int maxEnd = Math.max(merged.get(last).get(1),interval[1]);
                merged.get(last).set(1,maxEnd);
            }
            
        }

        return merged;
    }


    public static void main(String[] args) {

                 int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> result = merge(intervals);
        for (List<Integer> interval : result) {
            System.out.print(interval + " ");
        }
        
    }
}
