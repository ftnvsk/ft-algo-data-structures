public class binarySearch {
    public static void main(String[] args) {

        int[] nrs = {-1, 2, 4, 6, 8, 11};
        int trgt = 8;

        System.out.println(search(nrs, trgt));

    }

    public static int search(int[] nums, int target) {
        int targetIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetIndex = i;
            }
        }
        return targetIndex;
    }
}
