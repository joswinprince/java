package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<>();
        Map<String,Integer> markslessthan50;
        Map<String,Integer> marksgreaterthan80;
        marks.put("Physics", 85);
        marks.put("Chemistry", 90);      
        marks.put("Biology", 45);

        markslessthan50 = marks.entrySet()
        .stream()
        .filter(e -> e.getValue() < 50)
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue
            ));
        markslessthan50.forEach((k, v) -> System.out.println("Failed in " + k + " with marks: " + v));
        marksgreaterthan80 = marks.entrySet()
        .stream()
        .filter(e -> e.getValue() >= 80)
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue
            ));

        marksgreaterthan80.forEach((k,v) -> System.out.println("Passed with distinction in " + k + " with marks: " + v));
    
    
    }
}
