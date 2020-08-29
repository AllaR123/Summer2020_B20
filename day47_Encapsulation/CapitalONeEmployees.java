package day47_Encapsulation;

public class CapitalONeEmployees {

    String employeeName;
    int employeeAge;
    String jpbTitle;

    private int ID;
    private double salary;
    private String address;

    private static String companyName;
    static {

        companyName = "Capital One";
    }

    public CapitalONeEmployees(String employeeName, int employeeAge, String jpbTitle) {

        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jpbTitle = jpbTitle;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

}
