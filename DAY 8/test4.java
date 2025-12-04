class test4
{
    public double cal_Interest(); //declaration only possible in abstract method
}

class test5 extends test4{
    public double cal_Interest()
    {
        return 0.0;
    }
    public static void main(String[] args) {
        test4 parent = new test4();
        test5 child = new test5();
        test4 parent1 = new test5();

        
        System.out.println(child.cal_Interest());
        

    }
}