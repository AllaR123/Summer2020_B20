package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();


        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

//            System.out.println(AccessModifiers.privateVariable);      PRIVATE IS NOT VISIBLE OUTSIDE OF THE CLASS
//            AccessModifiers.privateMethod();

        System.out.println("==============================================");

        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.ssn);                WRONG

        System.out.println(obj.getSsn());
        obj.setSsn(123456);

        System.out.println(obj.getSsn());


        System.out.println("==============================================");

        Credentials obj2 = new Credentials("Alla", 32);

        obj2.setUsername("AllaR123");
        obj2.setPassword("asdfghjkl");

        System.out.println(obj2.getUsername());
        System.out.println(obj2.getPassword());


        System.out.println("==============================================");

        CapitalONeEmployees obj3 = new CapitalONeEmployees("Alla", 32, "SDET");

        obj3.setAddress("124 Ellington Blvd, Arlington, VA");
        obj3.setSalary(130000);
        obj3.setID(12345);

        System.out.println(obj3.getAddress());
        System.out.println(obj3.getSalary());
        System.out.println(obj3.getID());



    }
}
