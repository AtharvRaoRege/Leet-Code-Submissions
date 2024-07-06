class Solution {
    public int passThePillow(int n, int time) {
        int currTime = 0;
        int position = 1;
        boolean revDirection = false;
        while(currTime < time) {
            if(!revDirection) {
                position++;
            }else{
                position--;
            }
            if(position == 1 || position == n) {
                revDirection = !revDirection;
            }
            currTime++;
        }
        return position;
    }
}