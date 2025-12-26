import java.util.ArrayList;

class test1{
    public static void main(String[] args) {
        ArrayList <String>enames = new ArrayList<String>();
        System.out.println(enames);
        enames.add("Rahul Gandhi");
        enames.add("Sonia Gandhi");
        enames.add("Priyanka Gandhi");
        enames.add("Modi");

        // using for loop
        for(int i=0; i<=enames.size()-1; i++){
            System.out.println(enames.get(i));
        }
        System.out.println("------------------------------------------------------------------");
        // using While looop
        int i = 0;
        while (i<=enames.size()-1){
            System.out.println(enames.get(i));
            i++;
        }
        System.out.println("------------------------------------------------------------------");

        // using for each

       for (String string : enames) {
            System.out.println(string);
       }


    }
}