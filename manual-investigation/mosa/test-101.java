  public void test03()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(22, 22);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[0];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }
