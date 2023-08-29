package Practice2;

public class Practice2 {
    public static void main(String[] args) {
        String array[][] = {{"Mark Coleman", "85", "83", "77", "91", "76"},
            {"Maurice Smith", "80", "90", "95", "93", "48"},
            {"Randy Couture", "78", "81", "11", "90", "73"},
            {"Bas Rutten", "92", "83", "30", "69", "87"},
            {"Josh Barnett", "23", "45", "96", "38", "59"},
            {"Ricco Rodriguez", "60", "85", "45", "39", "67"},
            {"Tim Sylvia", "77", "31", "52", "74", "83"},
            {"Frank Mir", "93", "94", "89", "77", "97"},
            {"Shane Carwin", "79", "85", "28", "93", "82"},
            {"Cain Velasquez", "85", "72", "49", "75", "63"}};
        
        double sum = 0, allSum = 0;
        
        //Print categories
        System.out.println("Name\t\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage\tGrade");
        
        for (int i=0;i<array.length;i++){
            //Converts string numbers to double then get sum
            for (int k=1; k<array[0].length; k++){
                    double temp = Double.parseDouble(array[i][k]);
                    sum += temp;
            }
            //Print name and test grades 1-5
            for (int j=0; j<array[0].length; j++){
                System.out.print(array[i][j]+"\t"); 
            }
            
            //Print average of grades
            System.out.print(sum/5+"\t");
            
            //Prints Grade
            if ((sum/5)>=90){
                System.out.print("A");
            } else if ((sum/5)>=80) {
                System.out.print("B");
            } else if ((sum/5)>=70) {
                System.out.print("C");
            } else if ((sum/5)>=60) {
                System.out.print("D");
            } else {
                System.out.print("F");
            }
            System.out.println();

            //Sums all averages
            allSum += sum/5;

            //Resets sum
            sum = 0;
        }

        //Print class average
        System.out.print("\nClass average = "+(allSum/10));
    }
    
}
