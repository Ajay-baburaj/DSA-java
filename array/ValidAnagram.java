import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        // TODO: 1. length check
        if (s.length() != t.length())
            return false;
        // TODO: 2. build HashMap<Character, Integer> counts from s
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // TODO: 3. walk t, decrementing counts (handle missing/zero case)
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.getOrDefault(ch, 0) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        // TODO: 4. final check — are all counts exactly 0?
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
