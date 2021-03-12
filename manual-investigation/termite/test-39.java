  public void test05()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(10, 10);
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }
