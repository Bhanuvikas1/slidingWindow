import java.util.HashMap;


public class fruitsIntoBasket {

    public static void main(String[] args) {
        int[] fruits = {1,1,2,2,2,3,3,2,3,1};

        int ans = maxFruits(fruits);
        System.out.println(ans);
    }


    public static int maxFruits(int[] fruits)
    {
        HashMap<Integer , Integer> myMap = new HashMap<>();
        int right = 0;

        int left = 0;

        int maxLen = 0;

        while(right < fruits.length)
        {
            myMap.put(fruits[right] , myMap.getOrDefault(fruits[right], 0 )+1);

            while(myMap.size() > 2)
            {
                myMap.put(fruits[left] , myMap.get(fruits[left])-1);
                if (myMap.get(fruits[left])== 0)
                {
                    myMap.remove(fruits[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen , right - left + 1);
            right++;
        }
        return maxLen;
    }
}
