class Order
{
    //encapulation--binding var and method as 1 entity 
    //for security prupose - using private;
    //---use setters and getters to revoke private variables
    private String order_Declas;

    boolean order_id;

    private Boolean order_yes;

    public void set_order(String id)
    {
        this.order_Declas=id;
    }

    public String get_order()
    {
        return this.order_Declas;
    }

    public Boolean getOrder_yes() {
        return order_yes;
    }

    public void setOrder_yes(Boolean order_yes) {
        this.order_yes = order_yes;
    }
}
class Demo
{
    public static void main(String[] args) {
        Order o=new Order();
        o.set_order("aneesh");
        o.get_order();
        System.out.println(o.get_order());
        System.out.println(o.order_id);//default value

        o.setOrder_yes(true);
        System.out.println(o.getOrder_yes());
    }

}