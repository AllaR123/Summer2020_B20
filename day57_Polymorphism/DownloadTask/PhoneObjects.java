package day57_Polymorphism.DownloadTask;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone iPhone = new iPhone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20", "7.5", 800);
        Huawei huawei = new Huawei("Robery", "5.3", 25);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(huawei);
        System.out.println("===============================================");


        // Polymorphism

        Phone phone1 = new iPhone("12", "5.3", 1000);
        Phone phone2 = new Samsung("S20", "7.5", 800);
        Phone phone3 = new Huawei("Robery", "5.3", 25);

        // Polymorphism --> can store in data structure

        Phone[] phones = {phone1, phone2, phone3};

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
