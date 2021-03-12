  public void test29()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 1);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }
