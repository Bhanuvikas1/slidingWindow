public class longestSubsetEqualsSum {
    public static void main(String[] args) {
        int[] nums = {2,4,1,3,2,2,1};
        int k = 9;
        int ans = longest(nums , k);

        System.out.println(ans);
    }

    public static int longest(int[] nums , int target)
    {
        int left = 0;
        int right = 0;
        int sum =0;
        int length = 0;

        while(right < nums.length)
        {
            sum += nums[right];

            while(sum > target)
            {
                sum -= nums[right];
                left++;
            }
            if (sum == target)
            {
                length = Math.max(length , right-left+1);
            }
            right++;
        }

        return length;
    }
}
