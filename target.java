import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int[] nums = {2, 15, 11, 7};
        System.out.print("Enter target: ");
        int target = obj.nextInt();
       
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No such pair found.");
        }
    }
}
