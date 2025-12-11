class ProductDiscount
{
    int id;
    String name;
    double price;

    public ProductDiscount(int id,String name,
    double  price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public void applyDiscount(double percentage)
    {
        double discountAmount = price*(percentage/100);
        price=price-discountAmount;
        System.out.println("finalprice "+price);
    }

    public static void main(String[] args) {
        ProductDiscount product1=new ProductDiscount(101, "shruthi", 1000);
         ProductDiscount product2=new ProductDiscount(102, "ruthi", 5000);

         product1.applyDiscount(10.10);
         product2.applyDiscount(50.50);




    }
}