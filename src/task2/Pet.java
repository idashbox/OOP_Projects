package task2;

public class Pet {

    static {
        System.out.println("Pet static initializer");
    }

    {
        System.out.println("Pet instance initializer");
    }
    public Pet() {
        System.out.println("Pet instance public");
    }


}
