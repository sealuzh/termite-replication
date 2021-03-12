  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(116);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(2, 1, 0);
      assertEquals(116, expressionMatrixImpl0.getNumberOfElements());
  }
