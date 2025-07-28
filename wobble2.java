import java.util.*;

public class wobble2 {
    public static String getStart(HashMap<String, String> tickets) {
        HashSet<String> dest = new HashSet<>();

        for (String city : tickets.values()) {
            dest.add(city);
        }

        for (String city : tickets.keySet()) {
            if (!dest.contains(city)) {
                return city;
            }
        }

        return null; // No start found
    }

    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Bangalore", "Delhi");
        tickets.put("Delhi", "Chennai");

        String start = getStart(tickets);

        if (start == null) {
            System.out.println("No starting point found!");
            return;
        }

        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }

        System.out.println(start); // print last city
    }
}
