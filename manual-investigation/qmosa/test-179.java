  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 8, (-24));
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0[4], false, booleanArray0);
      assertEquals(7, doubleArray1.length);
  }
