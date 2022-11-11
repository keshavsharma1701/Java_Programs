import java.util.Scanner;
public class ArmstrongNo {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        
        //          First Method


        // int i=0;
        // int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474};
        // while(x[i]<a)
        // {
        //     System.out.println(x[i]);
        //     i++;
        // }


        //         Second Method

        
        int j,c1,i;
        for(i=1;i<=a;i++)
        {   
            j=i;
            c1=0;
            int sum= 0;
            while(j!=0)
            {
                c1++;
                j=j/10;
            }
            j = i;
            while(j>0)
            {
                sum=sum+(int)Math.pow(j%10,c1);
                j=j/10;
            }
            if(sum==i)
            {
                System.out.println(sum);
            }
        }
    }
}
