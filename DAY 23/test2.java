class test2
{
    public static void main(String[] args) {
        int eids[]={101,102,103,104};
        System.out.println(eids[1]);
        //System.out.println(eids[8]); //array index out of bond exeception
        try {
            System.out.println(eids[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println(eids[3]);
        System.out.println("GM");

    }
}