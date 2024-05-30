package thietkevadanhgiathuattoan.ga;

import java.util.*;

public class TSP {
    private final int[][] costMatrix = new int[][]{
            {0, 3, 10, 25, 6, 18, 27, 22, 24},
            {18, 0, 11, 3, 14, 12, 7, 24, 22},
            {9, 19, 0, 8, 27, 13, 24, 17, 18},
            {10, 13, 15, 0, 24, 11, 9, 23, 16},
            {28, 28, 27, 9, 0, 9, 15, 10, 21},
            {13, 9, 7, 7, 18, 0, 14, 29, 30},
            {4, 25, 5, 11, 29, 8, 0, 6, 17},
            {18, 11, 9, 29, 16, 15, 23, 0, 19},
            {18, 24, 13, 25, 29, 29, 22, 17, 0}};

    private List<List<Integer>> list = new ArrayList<>();

    public List<Integer> generatePermutation() {
        List<Integer> permutation = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            permutation.add(i);
        }
        Collections.shuffle(permutation);
        return permutation;
    }

    public int assessFitness(List<Integer> listAssess) {
        int cost = 0;
        for (int i = 0; i < list.size(); i++) {
            cost += costMatrix[listAssess.get(i)][listAssess.get(i+1)];
        }
        return cost * -1;
    }


    // Sinh quần thể con
    public void subpopulation() {
        Random random = new Random();
        List<List<Integer>> individual = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());
            individual.add(list.get(index));
            list.remove(index); // Loại bỏ bộ đã chọn để không lặp lại
        }
        // 2 cặp cá thể bố mẹ
        List<List<Integer>> mom = new ArrayList<>();
        mom.add(individual.get(0));
        mom.add(individual.get(1));

        List<List<Integer>> dad = new ArrayList<>();
        dad.add(individual.get(2));
        dad.add(individual.get(3));

        List<Integer> monChosen;
        List<Integer> dadChosen;

        // giao đấu:
        if (assessFitness(mom.get(0)) > assessFitness(mom.get(0))) {
            monChosen = mom.getFirst();
        } else monChosen = mom.getLast();
        if (assessFitness(dad.get(0)) > assessFitness(dad.get(0))) {
            monChosen = dad.getFirst();
        } else monChosen = dad.getLast();
    }

//    public static void getPermutation(){
//        List<List> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            List<Integer> individual = generatePermutation();
//            list.add(individual);
//            System.out.println("Permutation " + (i + 1) + ": " + list.get(i));
//        }
//    }

    public static void main(String[] args) {

    }
}

/*
Số 1 -> 6 lần
Số 2 -> 3 lần
Số 3 -> 2 lần
Số 4 -> 1 lần
Số 5 -> 1 lần
Số 6 -> 2 lần
Số 7 -> 1 lần
Số 8 -> 1 lần
Số 9 -> 1 lần
 */