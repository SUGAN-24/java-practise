import java.util.Scanner;

class Missingnum {
    int missingNum(int nums[]) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        for (int i = 1; i <= nums.length + 1; i++) {
            sum2 += i;
        }
        return Math.abs(sum2 - sum1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array (n): ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers (from 1 to n+1, with one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int missing = sol.missingNum(nums);
        System.out.println("The missing number is: " + missing);
    }
}