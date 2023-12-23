package task3;

public class Student extends Person{
    private int age;
    private String city;
    private String hobby;

    public Student(int age, String city, String hobby) {
        super(age, city, hobby);
        this.age = age;
        this.city = city;
        this.hobby = hobby;
    }

    @Override
    public void whereLives(){
        System.out.println("Я живу в городе " + city);
    }
    @Override
    public void howOld(){
        System.out.println("Мне всего-то " + age + " лет");
    }
    @Override
    public void whatIsHobby(){
        System.out.println("У меня нет хобби, я только учусь!!");
    }
}
