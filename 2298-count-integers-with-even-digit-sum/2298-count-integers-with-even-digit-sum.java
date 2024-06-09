class Solution {
     public static boolean isEven(int n){
        int sum = 0;
        int cnt = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        if(sum%2==0) return true;
        return false;
    }

    public static int countEven(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            if(isEven(i)) sum ++;
            continue;
        }
        return sum;
    }
}