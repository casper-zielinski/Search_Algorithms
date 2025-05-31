package at.fhj.msd;


public class SearchAlgorithms {

      private static int index;
      private static int t;
      private static int from;
      private static int to;
      private static int Algorithm_Depth = 0;

      /**
       * Simple Linear Search Algorithm using a while loop
       * @param a the array to search
       * @param x the target to find
       * @return the index of where x is in the a array
       */
      public static int linearSearch(int a[], int x)
      {
            index = 0;
            while (a[index] != x)
            {
                  ++index;
                  if (index >= a.length)
                  {
                        return -1;
                  }

            }

            return index;
      }

      public static int binarySearch(int a[], int x)
      {
            return 0;
      }

      public static int interpolationSearch(int a[], int x)
      {
            return 0;
      }

      public static int quadraticBinarySearch(int a[], int x)
      {
                  t = Calculate_t(a, 0, a.length - 1, x);
            
            if (a[t] < x)
            {
               try
               {
                  while (!(a[t] >= x))
                  {
                        t += (int) Math.sqrt(a.length);
                  }
               }
               catch (IndexOutOfBoundsException e)
               {
                  t = a.length - 1;
               }
                  

                  from = t - (int)Math.sqrt(a.length);
                  to = (int) t;

              
                    while (from <= to)
                    {
                        if (a[from] == x)
                        {
                              return from;
                        }

                        from++;
                    }
                    return -1;
               
                  
                  

            }
            else if (a[t] > x)
            {
                  try {
                      while (!(a[t] <= x))
                        {
                              t -= (int) Math.sqrt(a.length);
                        }  
                  }
                  catch (IndexOutOfBoundsException e)
                  {
                        t = 0;
                  }
                  

                  from = t - (int) Math.sqrt(a.length);
                  to = (int) t;

                  try {

                      while (from <= to)
                        {
                              if (a[from] == x)
                              {
                                    return from;
                              }

                        from++;
                        }
                        return -1;

                  } catch (IndexOutOfBoundsException e) {
                        return -1;
                  }

            }

            return t;
      }

      private static int Calculate_t(int a[], int from, int to, int x)
      {
            double divison_calc = (double)(x-a[from]) / (double)(a[to]-a[from]);
            t = from + (int)((to - from) * divison_calc);
            return t;
      }
}
