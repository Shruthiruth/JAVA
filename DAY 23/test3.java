class test3{
    public static void main(String[] args) {
        System.out.println("GM");
       // Class.forName("Alia"); //class not found exeception
       try {
           Class.forName("Alia");
       } catch (ClassNotFoundException e) {
        System.out.println(e);
       }
        System.out.println("GA");
    }
}