class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(String i : operations){
            if(i.equals("--X") || i.equals("X--")) sum -= 1;
            else sum += 1;
        }
        return sum;
    }
}