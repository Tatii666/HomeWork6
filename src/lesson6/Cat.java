package lesson6;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distRun) {
        if(distRun <= 200) {
            System.out.println(name + " run " + distRun + " meters");
        } else {
            System.out.println("Too much for " + name);
        }
    }

    @Override
    public void swim(int distSwim) {
        System.out.println("Cats don't swim");
    }
}
