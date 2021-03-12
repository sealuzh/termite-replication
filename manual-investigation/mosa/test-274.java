  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(20);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 18, (-2892));
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(20, expressionMatrixImpl0.getNumberOfElements());
  }
