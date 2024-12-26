public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Get the dimensions of the matrix
        System.out.println("Enter row size:");
        int r = obj.nextInt();
        System.out.println("Enter column size:");
        int c = obj.nextInt();

        // Initialize the 2D array
        int[][] arr = new int[r][c];

        // Input the matrix elements
        System.out.println("Enter the elements of the matrix (only 0s and 1s, sorted rows):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        // Print the matrix in matrix format
        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Find the row with the maximum number of 1s
        int maxRowIndex = -1;
        int maxCount = 0;

        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }

        // Output the result
        if (maxRowIndex != -1) {
            System.out.println("Row with maximum number of 1s: " + maxRowIndex);
            System.out.println("Number of 1s: " + maxCount);
        } else {
            System.out.println("No 1s found in the matrix.");
        }
    }
}
