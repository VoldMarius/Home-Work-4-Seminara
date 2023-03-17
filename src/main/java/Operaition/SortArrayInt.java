package Operaition;

import java.util.ArrayList;

public class SortArrayInt {
    public static ArrayList sortingArray(ArrayList<Integer> id, ArrayList<String[]> data, Integer args) {
        int k = 0;
        int l = id.size();
        while (k < id.size()) {
            for (int j = 0; j < l - 1; j++) {
                if (Integer.parseInt(data.get(id.get(j + 1))[args]) < Integer.parseInt(data.get(id.get(j))[args])) {
                    int temp = id.get(j);
                    id.set(j, id.get(j + 1));
                    id.set(j + 1, temp);
                    l--;
                }
            }
            k++;
        }
        return id;
    }
}