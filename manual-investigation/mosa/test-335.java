  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(20);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 17, 191);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(20, expressionMatrixImpl0.getNumberOfElements());
  }
