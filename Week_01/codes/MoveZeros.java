public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int firstzero = 0;
        int firstnonzero = 1;
        while (firstnonzero < nums.length) {
            if (nums[firstzero] == 0) {
                if (nums[firstnonzero] == 0) {
                    firstnonzero++;
                    continue;
                } else {
                    nums[firstzero] = nums[firstnonzero];
                    nums[firstnonzero] = 0;
                    firstzero++;
                }

            } else {
                firstzero++;
                firstnonzero = firstzero + 1;
            }
        }
    }
}
