public class DataTypes {
    //IEEE norms 754 -----------use strictfp in void main()
    //float and double in machine dependent
    //java support unicode where c support ascii
    public static void main(String args[])
    {
        System.out.println("Main Method");
        //value type
        int x=100;
        byte a=10;
        short b=1;
        long e=1000;
        float w=(float)1000.2;
        float w2=100.2f;
        double q=1000.265858;
        char t='a';  //2 byte unicode
        boolean isatt=true;

        //reference type/Address
        String name="Keshav Sharma";
        //string store address of string value
        //String Literal
        String a="hi";   //String a="hi".intern();  //1 or 0 object created
        String b="hi";
        //both variable a & b share same address .......String Pool is responsible for that
        System.out.println(a==b);    //true
        String c=new String("hi");        //2 or 1 object created
        //different address is in c variable "hi" stores outside the String Pool
        System.out.println(a==c);    //false
        //intern() is responsible to store string inside pool ....prefer intern over new keyword

        StringBuffer sb= new StringBuffer();  //mutable  modify in the same memory
    }
}