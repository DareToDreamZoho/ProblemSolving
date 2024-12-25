public class WaveArray_SK {
    public static void main(String args[]) {
        int[] a = {10, 5, 6, 3, 2, 20, 100, 80};
        int temp = 0;
        int l = a.length;

        for (int i = 0; i < l - 1; i += 2) {
           
             if(i<l-1 && a[i] < a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            if(i>0 && a[i] < a[i - 1]){
                temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
    }
}