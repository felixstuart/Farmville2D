public class MyFarm {

    public Plot[][] grid;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        // declare a 2D grid of plots
        grid = new Plot[3][4];
        // construct a 2D grid of plots
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c] = new Plot();
            }
        }

        // methods to write together during class
        totalPlants();
        totalCarrots();

        /***
         * for each additional method you code, call it here
         */

        averageNumberOfPlants();
        everyOtherNeedsWater();
    }

    public void totalPlants() {
        // how many plants are there in total across all plots?
        int sum = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                sum += grid[r][c].numberOfPlants;
            }
        }
        System.out.printf("There are %s plants.\n", sum);
    }

    public void totalCarrots() {
        // how many total carrots are there across all plots?
        int sum = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c].plantName == "carrot") {
                    sum += grid[r][c].numberOfPlants;
                }
            }
        }
        System.out.println("There are "+sum+" carrot plants.");
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        double total = 0;
        for(Plot plot : grid[0]) {
            total += plot.numberOfPlants;
        }
        System.out.println("The average number of plants in the first row is "+total/grid[0].length+".");

    }

    public void numberOfTomatoPlots() {
        // how many plots have carrots on them?

    }

    public void numberOfEmptyPlots() {
        // how many plots are empty?
        int total = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c].plantName.equals("empty")) total++;
            }
        }
        System.out.println(total+" plots are empty.");
    }

    public void everyOtherNeedsWater() {
        // change the value of needsWater to be true for every other plot
        // print the value of needs water for all plots row by row
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
            }
        }
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?

    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?

    }

    public void greaterThan50() {
        // how many plots have more than 10 plants in the plot?

    }

    public void plantWithMaxNumberNeedsWater() {
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }


    /***
     * more challenging
     */


    public void averageRows() {
        // find the average number of plants for every row
        // place the average of every row into a new array

    }

    public void averageColumns() {
        // find the average number of plants for every col
        // place the average of every row into a new array

    }

    public void updateNeedsWater() {
        // if 2 or more of the adjacent plots need water (left, right, up, down),
        // make the current plot needs water to be true

    }


    /***
     * most challenging
     */


    public void greatestDifferenceNumberBetweenAnyAdjacentPlants() {
        // of every pair of adjacent plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right),
        // which two have the greatest difference in plant numbers?
        // what is that difference?

    }

    public void updateNumberOfPlants() {
        // change the value of number of plants so it is the average of the 8 surrounding plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right)
    }

    public void numberOfCarrotPlotsNextToCorn() {
        // how many carrot plots share a border with a corn plot?

    }

    public void printInfo() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c].printPlotInfo();
            }
        }
    }

}
