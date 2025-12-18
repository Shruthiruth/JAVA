class test4
{
    public static void main(String[] args) {
        String ename=null;
        //System.out.println(ename.length()); //null pointer exeception
        try {
            System.out.println(ename.length()); 
        } catch (NullPointerException e) {
            System.out.println();
        }
        System.out.println("GM");
    }
}