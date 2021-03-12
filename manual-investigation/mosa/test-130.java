  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(75);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, (-422));
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(75, expressionMatrixImpl0.getNumberOfElements());
  }
