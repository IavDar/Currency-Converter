package l35;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainBeaver {
    public static void main(String[] args) {
        List <Beaver> beavers = new ArrayList<>();
        beavers.add(new Beaver("Bob", 3, 5));
        beavers.add(new Beaver("Sam", 2, 6));
        beavers.add(new Beaver("Bill", 4, 3));

        Collections.sort(beavers);
        System.out.println("Отсортировано по возрасту: " + beavers);

        Collections.sort(beavers, new NameComparator());
        System.out.println("Отсортировано по имени: " + beavers);

        Collections.sort(beavers, new RelativesCountComparator());
        System.out.println("Отсортировано по количеству родственников: " + beavers);

        Collections.sort(beavers, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("Отсортировано по имени: " + beavers);

        Collections.sort(beavers, (o1, o2) -> Integer.compare(o1.getRelativesCount(), o2.getRelativesCount()));
        System.out.println("Отсортировано по количеству родственников: " + beavers);


        Map<String, Integer> beaverRelatives = new HashMap<>();
        beaverRelatives.put("Bob", 5);
        beaverRelatives.put("Sam", 6);
        beaverRelatives.put("Bill", 3);

        System.out.println(beaverRelatives);

    }
}
