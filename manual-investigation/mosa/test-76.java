  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(25);
      assertEquals(25, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 0);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("0 --- B ---> 0\n", string0);
  }
