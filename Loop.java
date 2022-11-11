public class Loop {
     public static void main(String agrs[])
     {
        //   int a = 7632, c=0;
        //   while(a!=0)
        //   {
        //       a=a/10;
        //       c++;
        //   }
        //   System.out.println(c);

        int num = 12345;
        int a=0;
        while(num!=0)
        {
            a=a*10+num%10;
            num=num/10;    
        }
        while(a!=0){
            System.out.println(a%10);
            a=a/10;
        }

        // also we can use power for 10 zeros and divide it 
     }
}
