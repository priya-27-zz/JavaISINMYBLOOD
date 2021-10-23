package codee;

public class Binary {




  /*  [2, 1, 3, 4, 6, 5] and target = 5, we cannot find 5. Because when the pivot is 4, we get element 6, then the right pointer will move left, so we'll lose the opportunity to find target 5.
            [2, 1, 3, 4, 5, 6] and target = 5, we can find 5. Because wherever we choose the pivots, we'll find the target at last.
*/


    public static void main(String[] args) {
        int[] ar = {};
        // int[] ar = {2,1,3,4,6,5};
        int n = ar.length;
        int ctr = 0;

        while (n > 0) {
            int[] minArray = new int[n];


            minArray[0] = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                minArray[i] = Math.max(minArray[i - 1], ar[i - 1]);
            }

            int[] maxArray = new int[n];


            maxArray[n - 1] = Integer.MAX_VALUE;
            for (int i = n - 2; i >= 0; i--) //6
            {
                maxArray[i] = Math.min(maxArray[i + 1], ar[i + 1]);
            }


            for (int i = 0; i < n; i++) {
                if (minArray[i] < ar[i] && ar[i] < maxArray[i])
                    ctr++;

            }
        }
        System.out.println(ctr);


    }
}
