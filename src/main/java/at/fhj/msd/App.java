package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] sorted_Array = {0,1,2,3,4,5,6,7,8,9,10,100,1000};
        System.out.println(SearchAlgorithms.quadraticBinarySearch(sorted_Array, 100));
    }
}
