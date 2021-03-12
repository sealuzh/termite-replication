  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(22, 22);
      double[] doubleArray0 = new double[12];
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.core.Optimization", e);
      }
  }
