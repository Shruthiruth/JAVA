class Student
{
    int student_id;
    String Student_name;
    int marks;

    public void displayDetails(){

        System.err.println("id:"+student_id);
        System.out.println("name:" + Student_name);
        System.out.println("marks:"+marks);
        System.out.println("grade:"+calculateGrate());
    };

    public String calculateGrate(){

        if(marks>=90)
        {
            return "A";
        }
        else if(marks>=75)
        {
            return "B";
        }
        else if(marks>=50)
        {
           return "C";
        }
        else
        {
            return "Fail";
        }

    };

    public static void main(String[] args) {
        
        Student a=new Student();
        a.student_id=101;
        a.Student_name="shruthi";
        a.marks=76;
        Student b=new Student();
        b.student_id=102;
        b.Student_name="ruth";
        b.marks=93;
        Student c=new Student();
        c.student_id=103;
        c.Student_name="ruthi";
        c.marks=71;

        a.displayDetails();;
        b.displayDetails();
        c.displayDetails();
    }
    
}