public class duplicateInArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3};
        System.out.println("Duplicate elements in the array:");
        int duplicate = findDuplicates(arr);
        System.out.println(duplicate);
    }

    public static int findDuplicates(int[] arr) {
 
        int n = arr.length;
        int freq[] =new int[n+1];

        for(int i = 0 ;i <arr.length;i++){
            if(freq[arr[i]]==0){
                freq[arr[i]]+=1;
            }
            else{
                return arr[i];
            }
        }

        return 0;
    }
}