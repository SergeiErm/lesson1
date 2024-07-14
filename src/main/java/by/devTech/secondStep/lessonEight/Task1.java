package by.devTech.secondStep.lessonEight;

public class Task1 {

    public static void SelectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int max_i = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[max_i]) {
                    max_i = j;
                }
            }
            int temp = nums[max_i];
            nums[max_i] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        SelectionSort(nums);

        System.out.println("");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

