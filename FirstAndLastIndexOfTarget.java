public class FirstAndLastIndexOfTarget {
    public int[] searchRange(int[] nums, int target) {
       boolean found = false;
        int[] indices = new int[2];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]== target){
                indices[1]= i;
                found = true;
            }
            if(nums[nums.length-1- i] == target){
                indices[0]= nums.length-1-i;
            }
        }
        if(!found){
            indices[0] = -1;
            indices[1] = -1;
        }
        return indices;
    }
}
