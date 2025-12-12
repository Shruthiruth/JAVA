class test3
{
    public static void main(String[] args) {
        String s1="aneesh";
        String s2=new String("aneesh");
        String s3=new String("shruthi");
        String s4="aneesh";

        System.out.println(s4.equals(s1));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1==s4);//true
        System.out.println(s2==s4);//false
        System.out.println(s1==s3);//false
        System.out.println(s1==s2);//false
    }
}