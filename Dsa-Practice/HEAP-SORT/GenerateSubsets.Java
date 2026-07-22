import java.util.ArrayList;
import java.util.List;

class GenerateSubsets {
    public static List<List<Integer>> generate(int[] values) {
        List<List<Integer>> result = new ArrayList<>();
        build(values, 0, new ArrayList<>(), result);
        return result;
    }
    private static void build(int[] values, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == values.length) { result.add(new ArrayList<>(current)); return; }
        build(values, index + 1, current, result);
        current.add(values[index]); build(values, index + 1, current, result); current.remove(current.size() - 1);
    }
}
