  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 8, (-24));
      double[] doubleArray1 = new double[1];
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      assertEquals(1, doubleArray2.length);
  }
