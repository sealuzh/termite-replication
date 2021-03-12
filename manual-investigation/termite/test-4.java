  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[0];
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }
