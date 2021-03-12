  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(2, 2);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }
