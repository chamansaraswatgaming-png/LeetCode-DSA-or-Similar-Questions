class Solution {
    public int firstUniqueFreq(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Number -> Frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Frequency -> Kitne numbers ki ye frequency hai
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int f : map.values()) {
            freq.put(f, freq.getOrDefault(f, 0) + 1);
        }

        // Left to right
        for (int n : nums) {
            int f = map.get(n);

            if (freq.get(f) == 1) {
                return n;
            }
        }

        return -1;
    }
}