import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascalRow = new ArrayList<Integer>();

        pascalRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            long prev = pascalRow.get(pascalRow.size() - 1);
            long prod = (rowIndex - (i - 1)) * prev;
            long qou = prod / (long) i;
            pascalRow.add((int) qou);
        }

        return pascalRow;
    }
}
