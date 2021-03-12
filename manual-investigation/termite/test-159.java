  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(12, 12, 29.187125);
      double[] doubleArray0 = new double[4];
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("weka.core.Optimization", e);
      }
  }
