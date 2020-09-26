package day58_Polymorphism_Continue;

import day57_Polymorphism.DownloadTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {

    public static void main(String[] args) {

        Phone[] phone = {
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100)
        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));

        int countIphone = 0;
        int countSamSung = 0;
        int countHuaWei = 0;

        for(Phone each : phoneShop) {
            if (each instanceof iPhone) {           // checks if the obj is iPhone
                countIphone++;
            } else if (each instanceof Samsung) {   // checks if the obj is SauSung
                countSamSung++;
            } else {
                countHuaWei++;
            }
        }

        /*
        for(int i = 0; i <= phoneShop.size()-1; i++) {
            Phone each = phoneShop.get(i);          // gets each obj form the array

            if (each instanceof iPhone) {           // checks if the obj is iPhone
                countIphone++;
            } else if (each instanceof Samsung) {   // checks if the obj is SauSung
                countSamSung++;
            } else {
                countHuaWei++;
            }
        }

         */

        System.out.println("iPhone: " + countIphone);
        System.out.println("SauSung: " + countSamSung);
        System.out.println("Huawei: " + countHuaWei);
    }
}
