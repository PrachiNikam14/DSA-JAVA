package Arrays;
import java.util.*;


// basically pascal traingle is formed by adding above two values to find the middle one
// there are 3 question that interviewer might ask.
// Q.1 : find the particular element at given row and column place 
// Ans: For that we will first compute nCr formule which is n!/r!*(n-r)! which is further simplified as
// n!/r!;

// Code: Optimized for all 3
// public class pascaltriangle{

//     public static long findPascalElement(int r, int c){
//         int n = r-1;
//         int k = c-1;

//         long result = 1;

//         for(int i = 0; i < k; i++){
//             result = result * (n-i);  // (row-col)
//             result = result / (i+1);

//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int r = 5, c = 3;
//         System.out.println(findPascalElement(r, c));
//     }
// }

// this is taking time complexity as O(R).

// Q.2 Print Nth row of pascal triangle. Here we will directly use optimized method with reduced time complexity.
// logic: rather than generating resultu everytime what we observe is that the previous ans is just 
// get added with the new (row-col)/col .
// So the formula becomes: ans+ (row-col)/col.

// code:
// public class pascaltriangle{

//     public static List<Long> getNthRow(int N){

//         List<Long> row  = new ArrayList<>();
//         long val = 1;
//         row.add(val);

//         for(int i = 1; i<N ; i++){
//             val = val * (N-i);
//             val = val / i;
//             row.add(val);

//         }

//         return row;
//     }

//     public static void main(String[] args) {
//         int N = 5;
//          List<Long> result = getNthRow(N);

//         // Print the row
//         for (long num : result) {
//             System.out.print(num + " ");
        
//     }
// }
// }


// Q.3 Print the entire pascal triangle
// LOGIC : we will just normally use the property of pascal's triangle that addition of previous two middle numbers
// is the next row's middle number.

// Code:
public class pascaltriangle{

    public static List<List<Integer>> generatePascal(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i < numRows ; i++){
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j = 1; j<i ; j++){
                row.set(j,triangle.get(i-1).get(j-1) + 
                            triangle.get(i-1).get(j));
            }

            triangle.add(row);
        }

        return triangle;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> result = generatePascal(n);
        for (List<Integer> row : result) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        
    }
}
}
