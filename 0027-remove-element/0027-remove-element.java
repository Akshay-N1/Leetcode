class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        // int[] arr=new int[]{};
        // ArrayList<Integer> arr= new ArrayList<>();
        int k = 0;
        for (int i=0;i<n;i++){
        if(nums[i]!=val){
           nums[k]=nums[i];
           k++;
        }
        }
    //   return arr.length; 
    return k;
    }
}