import Operaition.SortArrayInt;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> data = new ArrayList<>();
        System.out.println("Введите id ФИО, возраст, пол: ");
        while (sc.hasNext()) {
            List id = new ArrayList();
            String name = sc.nextLine();
            data.add(name.split(" "));
        }
        for (String[] elem : data) {
            for (int i = 0; i < elem.length; i++) {
                if (i == 2 || i == 3) {
                    System.out.print(elem[i].charAt(0) + ". ");
                } else System.out.print(elem[i] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        List<Integer> id = new ArrayList();
        for (int i = 0; i < data.size(); i++) {
            id.add(i);
        }
        long start1 = System.currentTimeMillis();

        List<Integer> idw = new ArrayList();
        List<Integer> idm = new ArrayList();
        for (int i = 0; i < data.size(); i++) {

            if (data.get(i)[5].contains("ж")) {

                idw.add(id.get(i));
            } else {
                idm.add(id.get(i));
            }

            SortArrayInt.sortingArray((ArrayList<Integer>) idm,data,4);
            SortArrayInt.sortingArray((ArrayList<Integer>) idw,data,4);


        }  idw.addAll(idm);
        long finish1 = System.currentTimeMillis();
        long rez1 = finish1 - start1;
        System.out.println(" Время выполнения  " +  rez1);
        for (int i = 0; i < idw.size(); i++) {
            System.out.println(Arrays.toString(data.get(idw.get(i))));
        }
        System.out.println();

    }
}