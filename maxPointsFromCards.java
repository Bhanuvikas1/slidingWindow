public class maxPointsFromCards {
    public static void main(String[] args) {

        int[] nums = {3,4,2,8,10,2,1};
        int k =3;
        int ans = maxPoints(nums , k);
        System.out.println(ans);
    }

    public static int maxPoints(int[] cards , int k)
    {
        int leftPoints = 0;

        int rightPoints = 0;

        int sum = 0;

        for (int index =0; index < k; index++)
        {
            leftPoints += cards[index];
            sum = leftPoints;
        }

        int lastIndex = cards.length - 1;

        for (int index = k-1 ; index >= 0; index--)
        {
            leftPoints -= cards[index];

            rightPoints += cards[lastIndex];

            lastIndex--;

            sum = Math.max(sum , leftPoints + rightPoints);


        }

        return sum;
    }
}
