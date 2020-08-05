import lesson6.*;


public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Maruska");
        Animals cat2 = new Cat("Murka");
        Animals dog = new Dog("Rand");
        Animals dog2 = new Dog("Graf");

        cat.run(100);
        cat.swim(5);
        cat2.run(200);
        cat2.swim(2);
        dog.run(200);
        dog.swim(7);
        dog2.run(500);
        dog2.swim(10);


    }
}
