import java.util.HashMap;

public class Main {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Main romanToInteger = new Main();

        String s1 = "III";
        System.out.println("Output para o exemplo 1: " + romanToInteger.romanToInt(s1));

        String s2 = "LVIII";
        System.out.println("Output para o exemplo 2: " + romanToInteger.romanToInt(s2));

        String s3 = "MCMXCIV";
        System.out.println("Output para o exemplo 3: " + romanToInteger.romanToInt(s3));
    }
}
