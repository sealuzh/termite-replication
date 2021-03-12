  public void test02()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(7, 7);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }
