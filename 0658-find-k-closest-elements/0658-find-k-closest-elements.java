class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (right - left >= k) {

            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);

            if (leftDiff > rightDiff) {
                left++;
            } else {
                right--;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}