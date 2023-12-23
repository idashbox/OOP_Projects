package task2;

public class Kid extends Parent{
    static {
        System.out.println("Kid static initializer");
    }

    {
        System.out.println("Kid instance initializer");
    }

    public Kid() {
        System.out.println("Kid instance public");
    }
}
