  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 45);
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }
