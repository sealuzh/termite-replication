  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(59, 59);
      double[] doubleArray0 = new double[8];
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[2] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, 0.0, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }
