class Test1 extends Object
{

    
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1.toString());
        System.out.println(t1.equals(t2));
        
    }
}