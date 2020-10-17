package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMap2 {

    public static void main(String[] args) {


        String[] friends ={"Juliana", "Ivanna", "Ruslana"};
        LocalDate[] DOBfriends = {LocalDate.of(1987, 04,17),
        LocalDate.of(1995, 04,06),
        LocalDate.of(1988, 11,20)};

        String[] classMates = {"Adam", "Rumi", "Stani"};
        LocalDate[] DOBclassmates = {LocalDate.of(1987, 04,17),
                LocalDate.of(1995, 04,06),
                LocalDate.of(1988, 11,20)};

        String[] familyMember = {"Husband", "Mom", "Dad", "Brother"};
        LocalDate[] DOBfamely = {LocalDate.of(1987, 04,17),
                LocalDate.of(1995, 04,06),
                LocalDate.of(1988, 11,20),
                LocalDate.of(1985, 03,06)};


        List<Map<String, LocalDate>> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));

        for(int i = 0; i < friends.length; i++) {
            list.get(0).put(friends[i], DOBfriends[i]);
        }

        for(int i = 0; i < classMates.length; i++) {
            list.get(1).put(classMates[i], DOBclassmates[i]);
        }

        for(int i = 0; i < familyMember.length; i++) {
            list.get(2).put(familyMember[i], DOBfamely[i]);
        }

        System.out.println(list);
    }
}
