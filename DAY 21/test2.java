public class test2
{
    public static void main(String[] args) {
        int a=100;
        //Integer b=Integer.valueOf(a); // primitive DT to object
        Integer b=a;//autoboxing
        System.out.println(b.equals(a));
        System.out.println(a);
        System.out.println(b);

    }
}