public class subStringWithoutRepeatingChars {
    public static void main(String[] args) {

        String s = "abcdea";

        int ans = findLength(s);

        System.out.print(ans);
    }

    public static int findLength(String word)
    {
        int maxLen = 0;
        int left = 0;
        int right = 0;

        int[] charArray = new int[256];

        for(int index = 0; index < charArray.length; index++)
        {
            charArray[index] = -1;
        }

        while(right < word.length())
        {
            if (charArray[word.charAt(right)]!= -1)
            {
                if (charArray[word.charAt(right)] >= left)
                {
                    left = charArray[word.charAt(right)] + 1;
                }
            }

            maxLen = Math.max(maxLen , right - left + 1);

            charArray[word.charAt(right)] = right;
            right++;
        }

        return maxLen;
    }
}
