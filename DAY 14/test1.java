class test1
{
    int acc_id;
    String acc_name;
    double acc_bal;

    test1(int id,String name,double bal)
    {
        System.out.println("Acc");
        this.acc_id=id;
        this.acc_name=name;
        this.acc_bal=bal;
    }

    public void open_acc()
    {
        System.out.println("Acc opened");
    }

    public static void main(String[] args) {
        
        test1 t1= new test1(101,"shruthi",10000);
        test1 t2=new test1(102,"saakshi",30000);
        test1 t3=new  test1(103,"babu",85687);

        System.out.println(t1.acc_id);
        System.out.println(t2.acc_name);
        System.out.println(t3.acc_name);

    }
}