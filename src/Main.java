import task3.Student;
import task5.Pasport;
import task5.StudentChange;
import task5.StudentSimple;
import task5.StudentWithPasport;
import task6.FixedQueue;
import task6.LinkedList;
import task7_5.Education;

import java.util.List;


public class Main {
    public static void main(String[] args) {
//        MainWindow mw = new MainWindow(1);
//        Player pl = new Player(2, "ch6", "ch3","ch10","ch4","pi3","piTuz",true);
//        mw.displayPlayerInfo(pl);
//        Kid k = new Kid();
//        Student std = new Student(18, "Vorohezh", "drawing");
//        Person std1 = new Person(19, "Vorohezh", "programming");
//        Machinist mh  = new Machinist("8905553535");
//        std.howOld();
//        std.whatIsHobby();
//        std.whereLives();
//        std1.howOld();
//        std1.whatIsHobby();
//        std1.whereLives();
//        mh.getJob();
//        mh.getNumber();
//        mh.iLove();
//        Subject.getSubject();
//        Subject.getNumber();
//        Human.getNumber();

//        Pasport p1 = new Pasport(34214, 1456);
//        Pasport p2 = new Pasport(34214, 1456);
//        Pasport p3 = new Pasport(34214, 1446);
//        Pasport p4 = new Pasport(3, 1456);
//        Pasport p5 = p1;
//        System.out.println(p1==p2);
//        System.out.println(p1==p3);
//        System.out.println(p1==p5);
//        System.out.println(p1.equals(p5));
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals(p3));
//        System.out.println(p1.equals(p4));
//        System.out.println("__________");
//        System.out.println(p1.hashCode()==p2.hashCode());
//        System.out.println(p1.hashCode()==p3.hashCode());
//        System.out.println("__________");
//        StudentChange vasya = new StudentChange(1, "Vasya", List.of(2, 3, 3, 4));
//        StudentChange vasya2 = new StudentChange(1, "Vasya", List.of(2, 3, 3, 4));
//        System.out.println(vasya2.equals(vasya));
//        System.out.println(vasya2 == vasya);
//        System.out.println(vasya2.hashCode() == vasya.hashCode());
//        System.out.println("__________");
//        StudentWithPasport vasya1 = new StudentWithPasport(new Pasport(34214, 1456), 1);
//        StudentWithPasport vasya12 = new StudentWithPasport(new Pasport(34214, 1456), 1);
//        System.out.println(vasya12.equals(vasya1));
//        System.out.println(vasya12 == vasya1);
//        System.out.println(vasya12.hashCode() == vasya2.hashCode());
//        System.out.println("__________");
//        StudentSimple stud1 = new StudentSimple(1, "stud1");
//        StudentSimple stud2 = new StudentSimple(2, "stud1");
//        System.out.println(stud1.equals(stud2));
//        System.out.println(stud1 == stud2);
//        System.out.println(stud1.hashCode() == stud2.hashCode());
//        List<Integer> list = new LinkedList<Integer>();
//        FixedQueue<Integer> queue = new FixedQueue<>(5);
//
//        System.out.println(list.isEmpty());
//        list.add(2);
//        list.add(4);
//        System.out.println(list.isEmpty());
//        list.set(1, 40);
//        System.out.println(list.get(1));
//        list.clear();
//        System.out.println(list.isEmpty());
//        System.out.println("------");
//
//        queue.add(4);
//        queue.add(77);
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.peek());
//        System.out.println(queue.pool());


        for (Education ed: Education.values()){
            System.out.println("Enum:" + ed.name());
            System.out.println("Name:" + ed.getName());
            System.out.println("Address:" + ed.getAddress());
            System.out.println("Number of Students:" + ed.getNumberOfStudents());
            System.out.println("--------");
        }
    }
}
