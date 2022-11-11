public class Strings {
    public static void main(String [] agrs)
    {
        /*String - it is a collection of chars
         string is a predefine class in java

         */
        //string is immutable because that no of variables share same address .

        String a1= "Keshav";
        String a2= new String("Keshav");
        String a3= new String("Keshav").intern();
        System.out.println(a1==a2);  //false
        System.out.println(a2==a3);  //false
        System.out.println(a3==a1);  //true




    // StringBuffer       
    //all stringbuffer method are synchronised

    String sql1 = "select * from products";
    sql1 = sql1 + "where price>50000";

    StringBuffer a = new StringBuffer("hello");
    System.out.println(a.length());
    //capacity= length + 16(default)
    System.out.println(a.capacity());
    a.append("world !");
    System.out.println(a.length());
    System.out.println(a.capacity());

    //new capacity = old capacity*2 +2   new memory created old deleted
    a.append("onvdoudbvbiewubvdsbvubwebweb");
    System.out.println(a.length());
    System.out.println(a.capacity());

    
        //change capacity

        StringBuffer a4 = new StringBuffer(1000);
        a4.append("keshav sharma");
        System.out.println(a4.length());
        System.out.println(a4.capacity());
         a4.ensureCapacity(2000);
         System.out.println(a4.length());
        System.out.println(a4.capacity());

    //stringbuilder
    //stringbuilder are unsynchronised....but we can synchronised any method externally

    StringBuilder a5 = new StringBuilder("niebfeiuwbfvi");
    synchronized(a)     // means multiple methods at same time
    {
        a5.append("iuvdsbcfowbs");
    }
     System.out.println(a5);
     System.out.println(a5.length());
     System.out.println(a5.capacity());
    }
}
