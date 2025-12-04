public class test1 {

        int eid;
        String ename ;
        String gender;
        double esal;

        test1(int id,String name,String gen,double sal)
        {
            this.eid=id;
            this.ename=name;
            this.gender=gen;
            this.esal=sal;

        }

        public void add_bonus(double amount)
        {
            this.esal=this.esal+amount;
            System.out.println(esal);
        }

        public double get_sal(){
            return this.esal;
        }
        public static void main(String[] args) {
            test1 t1=new  test1(101,"rahul","Male",45000.00);
            test1 t2=new  test1(102,"sonia","Female",55000.00);

            System.out.println(t1.eid);
            System.out.println(t1.ename);
            System.out.println(t1.esal);
            System.out.println(t1.gender);

            System.out.println(t2.eid);
            System.out.println(t2.ename);
            System.out.println(t2.esal);
            System.out.println(t2.gender);

            t1.add_bonus(5000);
            t2.add_bonus(11000);
            
           System.out.println( t1.get_sal());
           
           System.out.println( t2.get_sal());
        }
}
