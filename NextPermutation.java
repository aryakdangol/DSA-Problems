class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1)
            return;
        int i = nums.length-2;
        while(i>=0 && nums[i+1] <= nums[i])
            i--;
        if (i >=0)
        {
            int end = nums.length-1;
            while(nums[end] <= nums[i])
                end--;
            swap(nums, i, end);
        }
        reverse(nums,i+1);
    }
    
    private static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private static void reverse(int[] nums, int pos)
    {
        int end = nums.length-1;
        while(pos < end)
        {
            swap(nums, pos, end);
            pos++;
            end--;
        }
    }
}