public class SelectionSort {

    public static void main(String[] args){

        int[] a = {2,5,6,9,1,3,4,8,7,7};
        sort(a);
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }

    }
    public static int[] sort(int[] args){
        //首先不考虑数组长度以及类型的问题
        for(int i=0;i<args.length;i++){
             for(int j=i+1;j< args.length;j++){
                 if(args[i]>args[j]){
                     int temp = args[j];
                     args[j] = args[i];
                     args[i] = temp;
                 }

             }
        }
        return args;
    }
}
