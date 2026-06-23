//Problem Statement: Given a matrix if an element 
// in the matrix is 0 then you will have to set its entire column 
// and row to 0 and then return the matrix..

// Brute Force
// Thought process: What we will do we will iterate over the matrix and first we will put-1 in the
// corrresponding row and column where we have got the zero.
// after doing this with all the zero we will run one more loop to just convert all the -1 to zeros.

// Code - Brute Force

// public class setmatrixzeroes{
//     public static void setZroes(int [][] arr,int n, int m){
//         for(int i = 0; i<n;i++){
//             for(int j = 0; j<m;j++){
//                 if(arr[i][j]==0){
//                     markZeroCol(i, arr, n);
//                     markZeroRow(j,arr,m);
//                 }
//             }
//         }

//         finalmatrix(arr, n, m);
//     }

//     private static void markZeroCol(int i,int [][] arr ,int n) {
//         for(int col = 0 ;col<n;col++){
//             if(arr[i][col]!=0){
//                 arr[i][col] = -1;
//             }
//         }
//     }

//     private static void markZeroRow(int j ,int [][]arr,int m) {
//             for(int row = 0 ;row<m;row++){
//             if(arr[row][j]!=0){
//                 arr[row][j] = -1;
//             }
//         }
//     }

//     public static void finalmatrix(int [][]arr, int n, int m){
//             for (int i = 0; i < m; i++) {
//                         for (int j = 0; j < n; j++) {
//                             if (arr[i][j] == -1)
//                                 arr[i][j] = 0;
//                         }
//                     }
//     }
//     public static void main(String args[]){

//         int [][]arr =  {{1,1,1},{1,0,1},{1,1,1}};
//             int m = arr.length;
//             int n = arr[0].length;

//             setZroes(arr, n, m);
//             for (int[] row : arr) {
//             for (int val : row) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Better One:
// here we will keep two more arrays for checking if that partucular colunm or row has zero or not
// if while traversing we got zero then we will mark that row and column into extra arrays as true
// then one last pass from converitng every instance in extrenal arrys to be zero in the main matrix or arr

// Code-BETTER
// public class setmatrixzeroes{

//     public static void setzeroes(int [][]arr){
//         int n = arr.length;
//         int m = arr[0].length;

//         boolean []row = new boolean[n];
//         boolean []col = new boolean[m];

//         for(int i = 0; i< n ; i++){
//             for(int j = 0; j<m ; j++){

//                 if(arr[i][j]==0){
//                     row[i]=true;
//                     col[j]=true;
//                 }
//             }
//         }

//         for(int i = 0; i<n;i++){
//             for(int j = 0; j<m ; j++){
//                 if(row[i]==true || col[j]==true){
//                     arr[i][j]=0;
//                 }
//             }
//         }

//     }

//     public static void main(String[] args) {

        
//         int [][]arr =  {{1,1,1},{1,0,1},{1,1,1}};
//                     setzeroes(arr);
//             for (int[] row : arr) {
//             for (int val : row) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//         }
        
//     }
// }


// Optimized:
// As by using method as better one's we are getting space complexity as O(m + n),
// We store two extra arrays one for m rows and one for n columns. No other extra space is used besides these arrays.
// That's why what we will do in optimized solution , rather than taking two extra arrays what we will do
// is mark the first row and first column as the arrays which will be used as markers for the solution.

// Code-Optimized

public class setmatrixzeroes{

    public static void setzeroes(int [][]arr){
        int n = arr.length;
        int m = arr[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // for checking zeroes in first col
        for(int i = 0 ; i< n; i++){
            if(arr[i][0]==0){
                firstColZero = true;
            }
        }
        // for checking zeroes in row
        for(int j = 0 ; j< m; j++){
            if(arr[0][j]==0){
                firstRowZero = true;
            }
        }

        // we will use markers to check the matrix where the zero is present, if yes then we will mark that into first 
        // row and column.
        for(int i=1;i<n;i++){
            for(int j = 1; j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        // set cells to zero based on markers
        for(int i=1;i<n;i++){
            for(int j = 1; j< m; j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }   

        // set first row to zero if needed
        for(int i = 0;i<m ; i++){
            if(firstRowZero){
                arr[0][i]=0;
            }
        }

        // set first col to zero if needed
        for(int j = 0 ;j <n;j++){
            if(firstColZero){
                arr[j][0]=0;
            }
        }
    }

    public static void main(String[] args) {

        int [][]arr =  {{0, 1, 2, 0},{3, 4, 5, 2},{1, 3, 1, 5}};
            setzeroes(arr);
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
        System.out.println();
        }
        
        

    }
}