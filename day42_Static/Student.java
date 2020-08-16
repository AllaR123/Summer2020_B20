package day42_Static;

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
}
