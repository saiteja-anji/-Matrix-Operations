import java.util.Scanner;

public class MatrixOperations {

    
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB, int rows, int cols) {
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

   
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB, int rows, int cols) {
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

   
    public static void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
       
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        
     
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element A[" + (i+1) + "][" + (j+1) + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element B[" + (i+1) + "][" + (j+1) + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

       
        int[][] additionResult = addMatrices(matrixA, matrixB, rows, cols);
        int[][] subtractionResult = subtractMatrices(matrixA, matrixB, rows, cols);

       
        System.out.println("\nMatrix A:");
        displayMatrix(matrixA, rows, cols);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB, rows, cols);

        System.out.println("\nMatrix A + Matrix B (Addition Result):");
        displayMatrix(additionResult, rows, cols);

        System.out.println("\nMatrix A - Matrix B (Subtraction Result):");
        displayMatrix(subtractionResult, rows, cols);
       
        scanner.close();
    }
}