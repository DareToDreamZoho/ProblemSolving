public class TargetSumOfArray_SK {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 8, 4, 1, 6 };
        int l = arr.length, target = 13, result = 0,flag=0;
        

        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                result = arr[i] + arr[j];
                if (result == target) {
                    flag=1;
                    System.out.println("The target sum is found at index " + i + " and " + j);
                    break;
                 }
            }
            if(flag==1) break;
           
        }

      
    }
}