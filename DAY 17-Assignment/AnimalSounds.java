class Animal
{
    public void makesound()
    {

    }
}
class Dog extends Animal
{
    public void makesound()
    {
        System.out.println("Dog-Bark");
    }
}
class Cat extends Animal
{
    public void makesound()
    {
        System.out.println("Cat-Meow");
    }
}
class Cow extends Animal
{
    public void makesound()
    {
        System.out.println("Cow-Moo");
    }
}
class test{
    public static void main(String[] args) {
        Animal d=new Dog();
          d.makesound();
        Animal c=new Cat();

        Animal ac=new Cow();

        makeitsound(ac);
        makeitsound(c);
        makeitsound(d);

        

      

    }
    static void makeitsound(Animal a)
        {
            a.makesound();
        }
}