class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        int ans = 0;

        // Iterate through all 3-digit even numbers
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            int[] needed = new int[10];
            needed[d1]++;
            needed[d2]++;
            needed[d3]++;

            if (needed[d1] <= count[d1] && 
                needed[d2] <= count[d2] && 
                needed[d3] <= count[d3]) {
                ans++;
            }
        }

        return ans;
    }
}