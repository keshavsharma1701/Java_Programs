import java.util.Scanner;
public class PrimeNo {
    
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int i=2,c=0;
        while((i*i)<b)
        {
            if(b%i==0)
            {
                c++;
            }
            i++;
        }
        if(c>0)
        {
            System.out.println("Not a Prime No.");
        }
        else{
            System.out.println("Prime No.");
        }
        a.close();
    }
}
