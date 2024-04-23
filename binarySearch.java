import java.lang.reflect.Array;
import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        int[] nrs = {-11, 2, 4, 6, 8, 9, 10, 11, 12, 33, 55, 66, 77, 23456, 34567, 99999};
        int trgt = 2;

        System.out.println("Lista: " + Arrays.toString(nrs));
        System.out.println("Din lista data, numarul " + trgt + " se afla pe index: " + search(nrs, trgt));

    }
/*     ------- cu metoda de mai jos scade perf daca vorbim o lista fff mare si timpul de executie e mai mare
               pentru ca incepe de la primul item din lista si duce pana la capat pana nu gaseste target-ul
 */

//    public static int search(int[] nums, int target) {
//        int targetIndex = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                targetIndex = i;
//            }
//        }
//        return targetIndex;
//    }

/*
        ----- cu metoda de mai jos, facem un fel de 'divide de conquer', adica cautam punctul de mijloc,
        si dupa aia incepem sa cautam daca target-ul e mai mare sau mai mic de mijlocul, si in functie de asta
        cautam targetul in prima sau in a 2a jumatate din lista. Dupa ce stabilim daca targetul e mai mare sau
        mai mic ca mijlocul, se schimba 'granitele' de stanga sau dreapta, adica daca targetul e mai mare de
        mijlocul, atunci elementul imediat de dupa mijlocul devine noua granita de stanga, si recalculam noul mijloc
        si practic am redus lista (acelasi principiu cu granita dreapta dar cu minus) si tot asa
        pana cand mijlocul este egal cu target-ul
*/

    public static int search(int[] nums, int target) {
        int leftNum = 0;
        int rightNum = nums.length - 1;
        while (leftNum <= rightNum) {
            int midNum = (leftNum + rightNum) / 2;
            if (nums[midNum] == target) {
                return midNum;
            }
            if (nums[midNum] < target) {
                leftNum = midNum + 1;
            } else {
                rightNum = midNum - 1;
            }
        }
        return -1;
    }

}
