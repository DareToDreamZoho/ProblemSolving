public class MajorityElement_SK {

    private int maj_ele(int[] a,int s,int c){
        
        for(int i=0;i<s;i++){
            for(int j=1;j<s;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c>=s/2){
                return a[i];
            }
            c=0;
           }
           return -1;
        }

    public static void main(String args[]){
        int[] n = {2,3,2,10,2,3,2,3,3,3};
        int size = n.length,count=0;
        MajorityElement_SK obj = new MajorityElement_SK();
        int res=obj.maj_ele(n,size,count);
        System.out.println(res);

    }
}
