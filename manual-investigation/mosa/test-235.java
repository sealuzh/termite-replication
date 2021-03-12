  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(13);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(13, expressionMatrixImpl0.getNumberOfElements());
  }
