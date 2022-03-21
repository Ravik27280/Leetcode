
class Solution7 {
    public int searchInsert(int[] nums, int target) {
        int sol=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>target){
                if(i>0 && nums[i-1]==target){
                    sol= i-1;
                }
                else if(i>0 && nums[i-1]<target){
                    sol= i;
                }

            }
            else if (nums[i]<target){
                sol=i+1;
            }
            else{
                return i;
            }

        }
        return sol;

    }
}
public class Search_Insert_Position_35 {
}
