public class longestSubsequentSum {
    public static void main(String[] args) {

        int[] arr = {19,1,2,3,1,1,1};

        long k = 3;

        int ans = maxPoints(arr , k);
        System.out.println(ans);
    }

    private static int maxPoints(int[] arr , long k) {
        int left = 0;
        int right = 0;

        int sum = 0;

        int maxLength = 0;

        while (right < arr.length)
        {
            if (sum > k && left <= right)
            {
                sum -= arr[left];
                left++;
            }

            if (sum == k)
            {
                maxLength = Math.max(maxLength , right - left + 1);
            }
            if (right < arr.length)
            {
                sum+=arr[right];
            }
            right++;
        }
        return maxLength;
    }
}
