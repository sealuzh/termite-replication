  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(109, 13, 109);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }
