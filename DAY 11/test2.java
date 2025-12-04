class Login
{
        private String uname;
        private String upassword;
      

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

        

}

class Demo{
    public static void main(String[] args) {
        Login l=new Login();
        l.setUname("aneesh");
        l.setUpassword("Anu@1145");

        System.out.println(l.getUname());
        System.out.println(l.getUpassword());
    }
}

