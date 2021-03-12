  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(4, 4, 4);
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }
