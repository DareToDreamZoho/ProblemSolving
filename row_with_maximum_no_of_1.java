public class row_with_maximum_no_of_1 {
    public static void main(String args[]) {
        int arr[][]={{0,1,1,1},{0,0,1,1},{1,0,0,1},{0,0,0,0}},maxRow=0,maxOne=-1,l=arr.length,c=0;
        for(int i=0;i<l;i++){
          for(int j=0;j<l;j++){
            if(arr[i][j]==1)
                c++;
          }
         
          if(c>maxOne){
            maxOne=c;
            maxRow=i;
            
          }
          c=0;
        }
        System.out.println("\n row:"+maxRow+" (index)");

    }
}
        
