import java.util.HashMap;

public class HashMapRefresher {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 5);

        System.out.println(map.get("a"));
        System.out.println(map.containsKey("c"));
        System.out.println(map.getOrDefault("d", -1));
        System.out.println(map.size());

    }
}
