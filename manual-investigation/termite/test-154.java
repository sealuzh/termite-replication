  public void test03()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(29, 29);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 29;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {29.0, 0.0}, doubleArray1, 0.01);
  }
