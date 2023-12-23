package task2;

public class Parent {
    static {
        System.out.println("Parent static initializer");
    }

    {
        System.out.println("Parent instance initializer");
    }

    public Parent() {
        System.out.println("Parent instance public");
    }
    Pet pet = new Pet();

}
