package task3;

public class Person {
    private int age;
    private String city;
    private String hobby;

    public Person(int age, String city, String hobby) {
        this.age = age;
        this.city = city;
        this.hobby = hobby;
    }
    public void whereLives(){
        System.out.println("My city is " + city);
    }
    public void howOld(){
        System.out.println("I'm " + age);
    }
    public void whatIsHobby(){
        System.out.println("My hobby is" + hobby);
    }

}
