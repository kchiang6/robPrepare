import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        String[] stationA = new String[]{"GP", "HB"};
        String[] stationB = new String[]{"ME", "BR"};
        String[] stationC = new String[]{"FH", "BH"};
        
        String res = solution(stationA, stationB, stationC, "ME", "BR");
        System.out.println(res);
     }
     
     // AB is the cheapest; BC can travel to C; ABC can travel anywhere
     
     public static String solution(String[] stationA, String[] stationB, String[] stationC, String start, String end) {
         
         Map<String, String> map = new HashMap<>();
         for (int i = 0; i < stationA.length; i++) {
             map.put(stationA[i], "A");
         }
         for (int i = 0; i < stationB.length; i++) {
             map.put(stationB[i], "B");
         }
         for (int i = 0; i < stationB.length; i++) {
             map.put(stationC[i], "C");
         }
         
         Set<String> set = new HashSet<>();
         set.add(map.get(start));
         set.add(map.get(end));
         
         if (set.contains("A") && set.contains("C")) {
             return "ABC";
         } else if (set.contains("B") && set.contains("C")) {
             return "BC";
         } else if (set.contains("A") && set.contains("B")) {
             return "AB";
         } else {
             return "No ticket available";
         }
     }
}
