  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(22);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 22);
      expressionMatrixImpl0.toString();
      assertEquals(22, expressionMatrixImpl0.getNumberOfElements());
  }
