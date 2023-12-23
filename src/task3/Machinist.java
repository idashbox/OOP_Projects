package task3;

public class Machinist extends PersonAbstract{
    private String number;

    public Machinist(String number) {
        this.number = number;
    }

    @Override
    public void getNumber() {
        System.out.println("My number is " + number);
    }

    @Override
    public void getJob() {
        System.out.println("My job is machinist!!!");
    }
    public void iLove(){
        System.out.println("I love machine!!!");
    }
}
