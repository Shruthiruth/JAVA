class test3
{
    public static void main(String[] args) {
        test2 t=new test2();
        t.setEid(101);
        t.setEloc("street");
        t.setEname("shruthi");
        System.out.println(t.getEid());
        System.out.println(t.getEloc());
        System.out.println(t.getEname());
    }
}