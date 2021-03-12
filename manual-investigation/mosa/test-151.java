  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(20);
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      expressionMatrixImpl0.setValue(1, 0, 15);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }
