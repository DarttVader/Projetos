import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSumBruteForce(int[] nums, int alvo) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == alvo) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("Sem solução");
    }
    public int[] twoSum(int[] nums, int alvo) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = alvo - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Sem solução");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int alvo = 6;

        int[] resultBruteForce = twoSum.twoSumBruteForce(nums, alvo);
        System.out.println("Output Brute Force: [" + resultBruteForce[0] + ", " + resultBruteForce[1] + "]");

        int[] resultEfficient = twoSum.twoSum(nums, alvo);
        System.out.println("Output eficiente: [" + resultEfficient[0] + ", " + resultEfficient[1] + "]");
    }
}
