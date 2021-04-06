package finger;

public class Thirty_Nine {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) {
                x = num;
            }
            if (num == x) {
                votes += 1;
            } else {
                votes += -1;
            }
        }
        return x;
    }
}
