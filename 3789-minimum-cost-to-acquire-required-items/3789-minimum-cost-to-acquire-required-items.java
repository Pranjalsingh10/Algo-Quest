class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1;
        long c2 = cost2;
        long cBoth = costBoth;
        long n1 = need1;
        long n2 = need2;
        
        long totalCost = 0;
        
        // 1. Cover the overlapping requirement using min(costBoth, cost1 + cost2)
        long commonNeed = Math.min(n1, n2);
        totalCost += commonNeed * Math.min(cBoth, c1 + c2);
        
        n1 -= commonNeed;
        n2 -= commonNeed;
        
        // 2. Cover the remaining requirement for type 1, if any
        if (n1 > 0) {
            totalCost += n1 * Math.min(cBoth, c1);
        }
        
        // 3. Cover the remaining requirement for type 2, if any
        if (n2 > 0) {
            totalCost += n2 * Math.min(cBoth, c2);
        }
        
        return totalCost;
    }
}