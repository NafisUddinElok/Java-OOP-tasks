class car{
    String owner;
    String brand;
    int serialnumber;
    car(String o, String b, int s){
        owner = o;
        brand = b;
        serialnumber = s;
    }
    void start(){
        System.out.println("Car is starting...");
    }
    void stop(){
        System.out.println("Car is stopping...");
    }
    void checkfuel(){
        System.out.println("Checking fuel level...");
    }
}

class dog{
    String name;
    String breed;
    int age;
    dog(String n, String b, int a){
        name = n;
        breed = b;
        age = a;
    }
    void bark(){
        System.out.println("Dog is barking...");
    }
    void spin(){
        System.out.println("Dog is spinning...");
    }
    void run(){
        System.out.println("Dog is running...");
    }
}

class library{
    String title;
    String author;
    library(String t, String a){
        title = t;
        author = a;
    }
    // constructor overloading
    library(String t){
        title = t;
        author = "Unknown";
    }
}
public class a{
    public static void main(String[] args){
        car myCar = new car("Alice", "Toyota", 12345);
        myCar.start();
        myCar.checkfuel();
        myCar.stop();

        dog myDog = new dog("Buddy", "Golden Retriever", 3);
        myDog.bark();
        myDog.spin();
        myDog.run();

        library book1 = new library("The Great Gatsby", "F. Scott Fitzgerald");
        library book2 = new library("To Kill a Mockingbird");
        System.out.println("Book 1: " + book1.title + " by " + book1.author);
        System.out.println("Book 2: " + book2.title + " by " + book2.author);
    }
}