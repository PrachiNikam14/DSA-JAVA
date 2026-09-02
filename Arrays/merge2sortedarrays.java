package Arrays;
import java.util.Arrays;

public class merge2sortedarrays {
    
    public static void merge(int []arr1, int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        for(int i = n-1; i>=0;i--){
            for(int j = 0 ; j < m ; j++){
                if(arr1[i]>arr2[j]){
                    swap(arr1, i, arr2, j);
                }

            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }

    public static void swap(int []arr1, int i, int []arr2, int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

     public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        merge(arr1, arr2);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }

}
