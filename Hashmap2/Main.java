import java.util.*;

import static java.util.Collection.*;

public class Main {
    public static void main(String[] args){
        Map<Integer, String> attoriThai = new HashMap<>();
        attoriThai.put(26, "Saint Suppapong Udomkaekanjana");
        attoriThai.put(29, "Jam Ratchata");
        attoriThai.put(25, "Khaotung Thanawat Rattanakitpaisan ");
        attoriThai.put(24, "First Kanaphan Puitrakul");
        attoriThai.put(30, "Toptap Jirakit Kuariyakul");

        Collection<String> values = attoriThai.values();
        List<String> attoriThaivalues = new ArrayList<>(values);
        Collections.sort(attoriThaivalues);
        for(String value : attoriThaivalues){
            System.out.println(value);
        }
    }
}
