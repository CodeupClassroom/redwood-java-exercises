public class Matrix {

    public static int[][] create(int rows, int cols){
        int[][] matrix = new int[rows][cols];

        int x = 1,y = 1;

        for(int i = 0; i < rows; i++){
            for(int c = 0; c < cols; c++){
                matrix[i][c] = x * y;
                y++;
            }
            y = 1;
            x++;
        }

        return matrix;
    }

    public static void print(int[][] matrix){
        for (int[] row : matrix){
            for(int col : row){
                if(col < 10){
                    System.out.print(" " + col + " ");
                }else{
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] usersMatrix = Matrix.create(10,10);
        Matrix.print(usersMatrix);
    }

}
