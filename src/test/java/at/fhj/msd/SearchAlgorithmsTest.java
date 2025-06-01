package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchAlgorithmsTest {

      int[] sorted_Array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1000 };
      int[] unsorted_Array = { 133, 23, 656, 343, 23, 663, 1 };

      @Test
      @DisplayName("Linear Search Algorithm")
      void LinearSearchAlgorithm() {
            assertEquals(4, SearchAlgorithms.linearSearch(sorted_Array, 4)); 
            assertEquals(3, SearchAlgorithms.linearSearch(unsorted_Array, 343));
            assertEquals(-1, SearchAlgorithms.linearSearch(sorted_Array, 200)); //Element not found
      }

      @Test
      @DisplayName("Quadratic Binary Search Algorithm")
      void QuadraticBinarySearchAlgorithm() {
            int[] sorted_Array_2 = { 11, 12, 13, 14, 15 };
            assertEquals(4, SearchAlgorithms.quadraticBinarySearch(sorted_Array, 4));
            assertEquals(2, SearchAlgorithms.quadraticBinarySearch(sorted_Array, 2));
            assertEquals(0, SearchAlgorithms.quadraticBinarySearch(sorted_Array_2, 11));
            assertEquals(-1, SearchAlgorithms.quadraticBinarySearch(sorted_Array, 200)); //Element not found
      }

      @Test
      @DisplayName("Binary Search")
      void BinarySearch() {

            int[] sorted_Array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1000 };

            assertEquals(11, SearchAlgorithms.binarySearch(sorted_Array, 100));

            // Check mid

            assertEquals(6, SearchAlgorithms.binarySearch(sorted_Array, 6));

            // check first

            assertEquals(0, SearchAlgorithms.binarySearch(sorted_Array, 0));

            // check random
            assertEquals(3, SearchAlgorithms.binarySearch(sorted_Array, 3));
      }

      @Test
      @DisplayName("Interpolations Search")
      void InterpolationsSearch() {
            int[] a = { 1, 2, 3, 4, 5, 10, 20, 50, 100, 1000 };

            // direct
            assertEquals(6, SearchAlgorithms.interpolationSearch(a, 20));

            // Search left
            assertEquals(3, SearchAlgorithms.interpolationSearch(a, 4));

            // Search right
            assertEquals(9, SearchAlgorithms.interpolationSearch(a, 1000));

            // not found
            assertEquals(-1, SearchAlgorithms.interpolationSearch(a, 7));

      }

}
