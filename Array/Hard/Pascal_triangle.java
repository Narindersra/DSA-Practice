import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle {
    public List<Integer> pascalTriangle(int row) {
        List<Integer> res = new ArrayList<>();

        int ans = 1;
        res.add(ans);

        for (int i = 1; i <= row; i++) {
            ans = ans * (row - i + 1) / i;
            res.add(ans);
        }

        return res;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ans.add(pascalTriangle(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        Pascal_triangle pt = new Pascal_triangle();
        List<List<Integer>> result = pt.generate(5);
        System.out.println(result);
    }
}
