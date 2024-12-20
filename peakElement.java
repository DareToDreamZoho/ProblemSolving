public class peakElement {
    public static void main(String args[]){
        int arr[]={1,2,4,5,7,8,3};
        int n=arr.length;
        int peak=arr[0];
        if(n==1){
            System.out.print("peak is"+arr[0]);
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i+1]>arr[i])
                peak=arr[i+1];
            }
            else if(i==(n-1)){
                if(arr[i-1]<arr[i])
                peak=arr[i];
            }
            else{
                if(arr[i+1]<arr[i]&&arr[i-1]<arr[i])
                peak=arr[i];
            }
        }
        System.out.print("peak element is "+peak);
    }
}
