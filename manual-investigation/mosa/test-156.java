  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(26, 26);
      double[] doubleArray0 = new double[29];
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.core.Optimization", e);
      }
  }
