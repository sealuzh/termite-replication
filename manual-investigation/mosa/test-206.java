  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-338));
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals((-338), expressionMatrixImpl0.getNumberOfElements());
  }
