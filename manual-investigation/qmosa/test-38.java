  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 8, (-24));
      double[] doubleArray1 = new double[12];
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[3] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("weka.core.Optimization", e);
      }
  }
