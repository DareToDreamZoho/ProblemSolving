public class PeakElement_SK {
    public static void main(String args[])
    {
        int[] a={2,1,5,6,7,3};
        for(int i=0;i<a.length;i++){
            if(i==0 && a[i]>a[i+1]){
                System.out.println(i);
            }
            else{
                if(a[i]>a[i-1] && a[i]>a[i+1]){
                    System.out.println(i);
                }
            }

        }


    }
}
