package by.devTech.secondStep.lessonEight;

public class Task2 {

    public static void InsertionSort(int[] nums){

        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = binarySearch(nums, key, 0, i - 1);
            for(int k = i; k > j; k--){
                nums[k] = nums[k-1];
            }
            nums[j] = key;
        }
    }

    public static int binarySearch(int[] nums, int key, int low, int high){
        while(low <= high){
            int mid = low +(high - low)/2;
            if(key < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {

        int[] nums = {15, 3, 7, 12, 9};
        InsertionSort(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}



