public class Loop1 {
    public static void main(String[] args) {
        int[] a = new int[300];
        int count = 0;

        for(int n=0,i=0,j=0,k= 0;n<100;n++,i++,j+=2,k+=3){
            a[i] = 1;
            a[j] = 1;
            a[k] = 1;
        }

        for (int l:
             a) {
            if(l == 1)
            count ++;
        }
        System.out.println(count);
    }
}
