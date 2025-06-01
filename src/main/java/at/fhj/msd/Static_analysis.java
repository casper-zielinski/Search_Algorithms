package at.fhj.msd;

public class Static_analysis {


     public String TimeMeasureLinearSearch(int x, String Case, int[] a)
     {
            long current_time = System.currentTimeMillis();
            int index = SearchAlgorithms.linearSearch(a, x);
            return String.format("Linear Search Time: %d, finding x Value: %d at index: %d, which is the %s", current_time, x ,index, Case);
     }

      public String TimeMeasureBinarySearch(int x, String Case, int[] a)
     {
            long current_time = System.currentTimeMillis();
            int index = SearchAlgorithms.binarySearch(a, x);
            return String.format("Binary Search Time: %d, finding x Value: %d at index: %d, which is the %s", current_time, x, index, Case);
     }

      public String TimeMeasureInterpolationSearch(int x, String Case, int[] a)
     {
            long current_time = System.currentTimeMillis();
            int index = SearchAlgorithms.interpolationSearch(a, x);
            return String.format("Interpolation Search Time: %d, finding x Value: %d at index: %d, which is the %s", current_time, x, index, Case);
     }

      public String TimeMeasureQuadraticBinarySearch(int x, String Case, int[] a)
     {
            long current_time = System.currentTimeMillis();
            int index = SearchAlgorithms.quadraticBinarySearch(a, x);
            return String.format("Quadratic Binary Search Time: %d, finding x Value: %d at index: %d, which is the %s", current_time, x, index, Case);
     }
}
