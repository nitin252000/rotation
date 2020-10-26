import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class rotation {
    public static void reorder(int []ar)
    {
        int k=0;
        for(int i:ar)
        {
            if(i!=0)
            {
                ar[k++]=i;
            }
        }
        for(int i=k;i<ar.length;i++) {
            ar[i] = 0;
        }
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int [] ar=new int[m];
            for(int i=0;i<ar.length;i++)
            {
                ar[i]=sc.nextInt();
            }
            reorder(ar);
            System.out.println(Arrays.toString(ar));

}}
