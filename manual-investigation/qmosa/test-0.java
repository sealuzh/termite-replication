  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 8, (-24));
      double[] doubleArray1 = new double[0];
      boolean[] booleanArray0 = new boolean[0];
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }
