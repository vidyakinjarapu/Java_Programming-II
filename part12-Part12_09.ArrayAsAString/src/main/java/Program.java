
public class Program {

    public static void main(String[] args) {
        // Test your method here
//        int rows = 2;
//        int columns = 3;
//        int[][] matrix = new int[rows][columns];
//        matrix[0][1] = 5;
//        matrix[1][0] = 3;
//        matrix[1][2] = 7;
//        System.out.println(arrayAsString(matrix));
        
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));      
    }
    
    public static String arrayAsString(int[][] array){
        String finalformed = "";
        for(int row = 0; row < array.length; row++){
            String formed = "";
            for(int column = 0; column < array[row].length; column++){
                formed = formed + array[row][column];
            }
            finalformed = finalformed + formed + "\n";
        }
        return finalformed;
    }

}
