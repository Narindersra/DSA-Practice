import java.util.ArrayList;

public class Spiral_matrix {
    void spiralMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0; 
        int right= m-1;
        int top = 0; 
        int bottom = n-1;
        ArrayList<Integer> list = new ArrayList<>();

        while(left<=right && top<=bottom){
            for(int i = left; i<=right; i++){
            list.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        
        }

        System.out.println(list);
        
    }

    public static void main(String[] args) {
        Spiral_matrix sm = new Spiral_matrix();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        sm.spiralMatrix(matrix);
    }
}
