package day44_Constructor;

public class Student {

    String name;
    int age;
    char gender;
    static String university = "Cybertek";

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


        public String toString() {

        return name + " " + age + " " + gender + " " + university;
        }

}


