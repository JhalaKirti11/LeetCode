// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
// Then return the number of elements in nums which are not equal to val.

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i = 0; i<nums.length;i++){
            for(int j = 0; j<nums.length;j++){
                if(nums[i]!=val){
                    int temp= nums[i];
                    nums[i] = nums[j];
                    nums[j]= temp;
                    
                }
            }
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!= val){
                k++;
            }
        }
        return k;
    }
}
