public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Bella";
        myCat.age = 3;

        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCatCount());

    }
}