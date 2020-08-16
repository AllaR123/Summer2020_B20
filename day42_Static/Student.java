package day42_Static;

import javax.imageio.stream.ImageInputStreamImpl;

public class Student {

    String name;
    int age;
    int groupName;
    char gender;

    static String schoolNme = "Cybertek School";
    static String favoriteTeacher = "Nadir";

    public void setInfo(String name, int age, int groupName, char gender) {

        this.name = name;
        this.age = age;
        this.groupName = groupName;
        this.gender = gender;

    }

    public String toString() {

        return "School name: " + schoolNme + "\nStudent Name: " + name;
    }

    public static void test1() {

        Student student = new Student();
        System.out.println(schoolNme + " " + favoriteTeacher + " " + student.name + " " + student.age + " "
                + student.groupName + " " + student.gender);
    }
}
