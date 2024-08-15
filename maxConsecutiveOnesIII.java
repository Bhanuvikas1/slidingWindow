public class maxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,1,1,0,0,0,1};
        int k = 2;

        int ans = maxOnes(nums , k);

        System.out.println(ans);

    }

    public static int maxOnes(int[] nums , int k)
    {
        int left = 0;

        int right = 0;

        int zeroes = 0;

        int max = 0;

        while (right < nums.length)
        {
            if (nums[right] == 0)
            {
                zeroes++;
            }

            if (zeroes > k)
            {
                if (nums[left] == 0)

                {
                    zeroes--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
