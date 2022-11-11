import java.lang.Math;
public class LuckyNo {
    public static void main(String args[])
    {
         int a=33665946,c=0,p=1;
         int b=a;
         while(a!=0)
         {
            a=a/10;
            c++;
         }
         while(c>1)
         {
            p=p*10;
            c--;
         }
         int i=1,sum=0;
         while(b>0)
         {
            if(i%2==0)
            {
                sum = sum + (int)Math.pow(b/p,2);
            }
            b=b%p;
            i++;
            p=p/10;

         }
         if(sum%9==0)
         {
            System.out.println("Lucky Number");
         }
         else{
            System.out.println("Not A Lucky Number");
         }
    }
}