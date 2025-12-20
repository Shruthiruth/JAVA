class test4
{
    public static void main(String[] args) {
        System.out.println(10/2);
        try {
            
            throw new ArithmeticException("can't divide by zero");
            // System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        catch(NullPointerException f)
        {
            System.out.println(f);
            System.out.println(f.getMessage());
        }
        System.out.println("GM");
    }
}