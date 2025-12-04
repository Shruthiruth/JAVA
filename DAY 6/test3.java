class test3{
    public static void main(String[] args) {
        test1 parent=new test1();
        parent.m1();
        parent.m2();

        test2 child=new test2();
        child.m3();
        child.m1();
        child.m2();

        test1 parenttochild=new test2(); // parent can hold child obj
        parent.m1();
        parent.m2();
      //  parent.m3();

       // test2 childtoparent=new test1();--not possible child can't hold parent object
    }
}