  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[12][7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 8, (-24));
      double[] doubleArray1 = new double[6];
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, (boolean[]) null);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray2, 0.01);
  }
