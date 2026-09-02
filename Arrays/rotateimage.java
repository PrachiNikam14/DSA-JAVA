package Arrays;

// Rotate matrix by 90 degree .
// Bruete Force : 
// public class rotateimage {

//     public static int [][] rotateImage(int [][]arr){
//         int n = arr.length;
        

//         int [][] rotated = new int[n][n];

//         for(int i = 0 ; i<n;i++){
//             for(int j = 0 ;j<n;j++){
//                 rotated[j][n-i-1]=arr[i][j];
//             }
//         }

//         return rotated;
//     }
    



//     public static void main(String[] args) {
//         int[][] mat = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int [][] rotated = rotateImage(mat);
//       for(int[] row : rotated){
//     for(int val : row){
//         System.out.print(val + " "); // same line
//     }
//     System.out.println(); // new line after each row
// }

        
//     }
// }

// Optimized:

class Solution {
    // Function to rotate matrix 90 degrees clockwise in-place
    public void rotateClockwise(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

// Driver class
class rotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Solution obj = new Solution();
        obj.rotateClockwise(matrix);

        // Print rotated matrix
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

