

class AreaCalculator
{
    
    public int area(int side)
    {
        return side * side;
    }
    public int area(int length,int width)
    {
        return length * width;
    }
    public double  area(double radius)
    {
        return Math.PI* radius * radius;
    }
}
class areademo
{
    public static void main(String[] args) {
        AreaCalculator a=new AreaCalculator();
        System.out.println("square"+a.area(4));
        System.out.println("recatnge"+a.area(4, 5));
        System.out.println("circle"+a.area(3.0));
    }
}