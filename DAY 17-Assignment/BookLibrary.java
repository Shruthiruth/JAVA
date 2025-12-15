class Book
{
    int id;
    String title;
    String author;
    double price;

   public Book(int id, String title,String author,double price)
   {
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
   }

   public String gettitle()
   {
    return title;
   }
   public double getprice()
   {
    return price;
   }

}
class test{
    public static void main(String[] args) {
        Book Books[]=new Book[5];
        Books[0] = new Book(1, "Core Java", "Kathy Sierra", 599);
        Books[1] = new Book(2, "Clean Code", "Robert C. Martin", 999);
        Books[2] = new Book(3, "Head First Design Patterns", "Eric Freeman", 799);
        Books[3] = new Book(4, "Algorithms", "Sedgewick", 1299);
        Books[4] = new Book(5, "Effective Java", "Joshua Bloch", 699);

        for(Book b:Books)
        {
            System.out.println(b.gettitle());
        }

        for(Book b:Books)
        {
            if(b.getprice()>700)
            {
                System.out.println(b.getprice());
            }
        }



    }
}