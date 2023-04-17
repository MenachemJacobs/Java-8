import java.util.Scanner;

public class App {
    public class Item {
        private String name;
        private int value;

        public Item(String itemName, int itemValue) {
            name = itemName;
            value = itemValue;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }
    }

    public class ItemGrid {
        private Item[][] grid;

        // Constructor not shown
        ItemGrid(int numOfColumns, int numOfRows) {
            Item[][] grid = new Item[numOfRows][numOfColumns];
            String name = "";
            int value = 0;

            for (int i = 0; i < numOfRows; i++) {
                for (int j = 0; j < numOfColumns; j++) {
                    System.out.println("Please Provide a name and value.");
                    try (Scanner keyb = new Scanner(System.in)) {
                        name = keyb.nextLine();
                        value = keyb.nextInt();
                        keyb.nextLine();
                    }
                    grid[i][j] = new Item(name, value);
                }
            }
        }

        /**
         * Returns true if xPos is a valid row index and yPos is a valid
         * column index and returns false otherwise.
         */
        // public boolean isValid(int xPos, int yPos){
        // /* implementation not shown */
        // }

        // /** Compares the item in row r and column c to the items to its
        // * left and to its right. Returns the name of the item with
        // * the greatest value, as described in part (a).
        // * Precondition: r and c are valid indices
        // */
        // public String mostValuableNeighbor(int r, int c){
        // /* to be implemented in part (a) */
        // }

        // /** Returns the average value of all the items in grid,
        // * as described in part (b).
        // */
        // public double findAverage(){
        // /* to be implemented in part (b) */
        // }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ItemGrid ig(3,4) = new ItemGrid();
    }
}
