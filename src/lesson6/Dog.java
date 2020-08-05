package lesson6;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distRun) {
        if(distRun <= 500) {
            System.out.println(name + " run " + distRun + " meters");
        } else {
            System.out.println("Too much for " + name);
        }
    }

    @Override
    public void swim(int distSwim) {
        if(distSwim <= 10) {
            System.out.println(name + " is swam " + distSwim + " meters");
        } else {
            System.out.println("Too much distance for " + name);
        }
    }
}
