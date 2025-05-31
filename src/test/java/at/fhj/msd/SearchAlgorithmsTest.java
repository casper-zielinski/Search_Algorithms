package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchAlgorithmsTest {

    
      int[] sorted_Array = {0,1,2,3,4,5,6,7,8,9,10};
      int[] unsorted_Array = {133,23,656,343,23,663,1};

      
      

      @Test
      @DisplayName("Linear Search Algorithm")
      void LinearSearchAlgorithm()
      {
            assertEquals(4, SearchAlgorithms.linearSearch(sorted_Array, 4)); 
            assertEquals(3, SearchAlgorithms.linearSearch(unsorted_Array, 343)); 
            assertEquals(-1, SearchAlgorithms.linearSearch(sorted_Array, 200));
      }


}
