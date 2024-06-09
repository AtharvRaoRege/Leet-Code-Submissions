class Solution {
    public static boolean isTrue(int n){
        if(n % 3 == 0 || n % 5 == 0 || n % 7 == 0) return true;
        return false;
    }
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 1; i < n+1; i++){
            if(isTrue(i)) sum += i;
        }
        return sum;
    }
}