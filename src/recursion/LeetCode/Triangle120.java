package recursion.LeetCode;

import java.util.*;

public class Triangle120 {
    static int solve(List<List<Integer>> triangle,int rowInex,int colIndex) {
        if (rowInex == triangle.size() - 1) {
            return triangle.get(rowInex).get(colIndex);
        }

        int downAns = solve(triangle, rowInex + 1, colIndex);
        int digonalAns = solve(triangle, rowInex + 1, colIndex + 1);
        return triangle.get(rowInex).get(colIndex) + Math.min(downAns, digonalAns);
    }
    static int minimumTotal(List<List<Integer>> triangle) {
        int rowIndex = 0;
        int colIndex = 0;
        return solve(triangle, rowIndex, colIndex);
    }
    public static void main(String[] args) {
//        int[][] triangle = {
//                {2},
//               {3,4},
//              {6,5,7},
//             {4,1,8,3}
//        };
        List<Integer> list = List.of(2);
        List<Integer> list1 = List.of(3, 4);
        List<Integer> list2 = List.of(6, 5, 7);
        List<Integer> list3 = List.of(4, 1, 8, 3);

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(list);
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);

        int ans = minimumTotal(triangle);
        System.out.println("ans = " + ans);
    }
}
