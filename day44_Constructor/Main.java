package day44_Constructor;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Alla", 32, 'F');
        Student student2 = new Student("Denys", 32, 'M');
        Student student3 = new Student("Alex", 30, 'M');

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());


    }
}
