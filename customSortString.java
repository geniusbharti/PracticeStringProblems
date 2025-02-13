import java.util.*;

class Solution {
    public String customSortString(String order, String s) {
        // Convert String to Character array
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        // Custom comparator to sort based on 'order'
        Comparator<Character> sort = new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int i1 = order.indexOf(a);
                int i2 = order.indexOf(b);
                return Integer.compare(i1, i2);
            }
        };

        // Sort the character array
        Arrays.sort(arr, sort);

        // Convert back to String
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }

        return sb.toString();
    }
}
