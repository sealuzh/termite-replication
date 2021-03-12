  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[2] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }
