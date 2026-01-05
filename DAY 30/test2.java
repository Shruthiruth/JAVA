
class test2 {

    public static void main(String[] args) {
        //    String s=null;
        //    System.out.println(s.length());--throw null pointer

        String f = "shruthII";
        System.out.println(f.toLowerCase());

        String fb = null;
        System.out.println(fb.toLowerCase());

        try {
            String s = null;
            System.out.println(s.length());

        } catch (Exception e) {
            System.out.println("Null pointer exception");
            System.out.println(e.getMessage());
        }
    }
}
