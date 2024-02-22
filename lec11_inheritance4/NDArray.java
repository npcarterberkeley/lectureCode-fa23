package lec11_inheritance4;

import java.util.List;

public class NDArray {
    public int value;
    public int rows;
    public NDArray[] arr;

    public NDArray(int D, int W) {
        rows = D;
        if (rows == 0) {
            return;
        }
        arr = new NDArray[W];
        for (int i = 0; i < W; i++) {
            arr[i] = new NDArray(D-1, W);

        }
    }

    public int get(List<Integer> coords) {
        if (coords.size() != rows) {
            throw new IllegalArgumentException();
        }
        if (coords.isEmpty()) {
            return this.value;
        }
        int index = coords.get(0);

        return this.arr[index].get(coords.subList(1, coords.size()));
    }



    public static void main(String[] args) {
        NDArray test = new NDArray(2, 3);

//        NDArray nda = new NDArray(2,2);



        //NDArray test2 = new NDArray(2,2){1, 2, 3, 4};



        System.out.println(test.get(List.of(0, 1)));

        //System.out.println(nda);


    }
}
