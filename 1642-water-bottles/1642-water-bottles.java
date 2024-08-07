class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles >= numExchange) {
            int rem = numBottles % numExchange;
            numBottles /= numExchange;
            sum += numBottles;
            numBottles += rem;
        }
        return sum;
    }
}