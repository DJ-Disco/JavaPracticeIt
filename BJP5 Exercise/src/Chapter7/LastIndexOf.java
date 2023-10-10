public class LastIndexOf {
    public static void main(String[] args) {
        int[] intArray = {74, 85, 102, 99, 101, 85, 56};

        System.out.println(lastIndexOf(intArray, 85));
    }

    public static int lastIndexOf (int[] intArray, int intValue) {
    
        int index = -1;
        
        for (int i=0; i<intArray.length; i++) {
            if (intArray[i] == intValue) {
                index = i;
            }
        }
        
        return index;
    }

}