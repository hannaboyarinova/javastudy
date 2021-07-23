public class Cat {
    public static int catCounter = 1000;

    private String description = "Before starting constructor";

    public Cat() {
        System.out.println(catCounter);
        System.out.println(description);
        description = "Abstract cat";
        System.out.println(description);
        System.out.println("Hi from Cat class");
    }

    public String getDescription() {
        return description;
    }
}

class StreetCat extends Cat{

    private static int streetCatCounter = 100;

    String name, color;
    int age = 5;

    {
        System.out.println("Hi from init block");
        name = "Tishka";
        color = "Black";
        age = 3;
    }
    {
        System.out.println("Hi from 2nd init block");
        color = "Dotted";
    }

    StreetCat (String name, String color, int age){
        System.out.println(streetCatCounter);
        System.out.println("Hi from StreetCat class");
        System.out.println(this.age);
        this.name = name;
        this.color = color;
        this.age = age;

        Cat.catCounter++;
        streetCatCounter++;
    }
}
class Main {
    public static void main(String[] args) {
        StreetCat cat1 = new StreetCat("Pushok", "White", 4);
    }
}