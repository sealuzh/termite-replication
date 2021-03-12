  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(29, 29);
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }
