  public void test11()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(22, 22);
      double[] doubleArray0 = new double[20];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertEquals(20, doubleArray1.length);
  }
