class test1{
    public static void main(String[] args)
    {
        Integer a= Integer.valueOf(100);//Integer a=100--autoboxing
        int b=a.intValue();  //int b=a --unboxing 
        System.out.println(a);
        System.out.println(b);

        Double c=Double.valueOf(200);
        double d=c.doubleValue();
        System.out.println(c);
        System.out.println(d);

        int e=Integer.parseInt(args[0]);
        int f=Integer.parseInt(args[1]);
        System.out.println(e+f);

        
    }
}