package tutorial_02;
import java.util.Map;
import java.util.HashMap;

public class ExerciseMaps {

    public static void main(String[] args) {

        String message = "hvoe  shihvoeshb hgvsihjgbiurht  dlhihohvrshvir";
        Map<Character, Integer> occurencies = new HashMap<>();
        char current_symbol;
        int new_value;

        for (int i = 0; i < message.length(); i++) { // better to use method message.toCharArray();
            current_symbol = message.charAt(i);
            if (current_symbol == ' ') {
                continue;
            } else if (occurencies.containsKey(current_symbol)) {
                new_value = occurencies.get(current_symbol) + 1;
                occurencies.put(current_symbol, new_value);
            } else {
                occurencies.put(current_symbol, 1);
            }
        }
        System.out.println(occurencies);

    }

}
