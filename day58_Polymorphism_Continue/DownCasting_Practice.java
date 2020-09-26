package day58_Polymorphism_Continue;

import day57_Polymorphism.DownloadTask.Huawei;
import day57_Polymorphism.DownloadTask.Phone;
import day57_Polymorphism.DownloadTask.Samsung;
import day57_Polymorphism.DownloadTask.iPhone;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new iPhone("11", "6", 1000);
        iPhone iphone = (iPhone)phone1;

        System.out.println(phone1);
        System.out.println(iphone);


        // 1
        iphone.faceTiming(65668768);        // OR we can call it this way
        // 2
        ((iPhone) phone1).faceTiming(3253535);


        System.out.println("==============================================");


        Phone phone2 = new Samsung("S20", "7", 1000);
        Samsung samsung = (Samsung)phone2;

        ((Samsung) phone2).freezing();

       // ((iPhone) phone1).faceTiming(3253535);      // HAS a relation, cannot cast sub to sub


        System.out.println("==============================================");


        Phone phone3 = new Huawei("spy", "7", 10);
        Huawei huawei = (Huawei)phone3;

        ((Huawei) phone3).stealInfo();

       // ((iPhone) phone3).faceTiming(3253535);      // HAS a relation, cannot cast sub to sub

    }
}
