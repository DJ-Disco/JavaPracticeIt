

public class App {
    public static void main(String[] args) throws Exception {
        //1st method of writing an array
        String[] cars = {"Camaro","Tesla","Camry"};

        cars[0] = "Mustang";

        for (int i=0;i<3;i++){
            System.out.println(cars[i]);
        }

        //2nd method of wrting an array (assigning the size)
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i=0;i<3;i++){
            System.out.println(numbers[i]);
        }

        //2d arrays 1st method
        String[][] colours = new String[3][3];

        colours[0][0] = "red";
        colours[0][1] = "yellow";
        colours[0][2] = "blue";
        colours[1][0] = "green";
        colours[1][1] = "violet";
        colours[1][2] = "orange";
        colours[2][0] = "indigo";
        colours[2][1] = "cyan";
        colours[2][2] = "skyblue";

        for (int i=0;i<colours.length;i++) {
            System.out.println();
            for (int j=0;j<colours[i].length;j++) {
                System.out.print(colours[i][j] + " ");
            }
        }

        //2d arrays 2nd method

        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i<nums.length;i++) {
            System.out.println();
            for (int j=0;j<nums[i].length;j++) {
                System.out.print(nums[i][j] + " ");
            }
        }

            
    }
}
