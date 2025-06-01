package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int[] a = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                15, 20, 25, 30, 35, 40, 45, 50, 55, 60,
                65, 70, 75, 80, 85, 90, 95, 100, 110, 120,
                130, 140, 150, 160, 170, 180, 190, 200, 220, 240,
                260, 280, 300, 320, 340, 360, 380, 400, 420, 440
        };

        int index = SearchAlgorithms.interpolationSearch(a, 340);

        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.printf("Found Index: %d || Duration: %d", index, duration);
    }
}
