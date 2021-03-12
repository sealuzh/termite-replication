  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(2, 1, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }
