package day53_Final_Keyword.Device_Task;

public class iPhoneShop {

    /*
    create a class called phone objects:
                         create three objects of each phone and test everything out
     */

    public static void main(String[] args) {

        iPhone  iphone = new iPhone("11 Pro", 1000);

        iphone.call(911);
        iphone.text(123456);

        System.out.println(iphone);

        System.out.println("========================================");

        Sumsung samsung = new Sumsung("Galaxy Note20", 799.99);

        System.out.println(samsung);
        samsung.call(1234);
        samsung.text(123556);

        System.out.println("====================================");

        Nokia nokia = new Nokia("Brick", 25);

        System.out.println(nokia);
        nokia.call(34567);
        nokia.text(987654);

    }

}
