class test5
{
    public static void main(String[] args) {
        //Thread.sleep(500); //interrupted exeception
        Thread t=new Thread();
        t.setPriority(100); //illegal argument exeception
        System.out.println("GM");
    }
}