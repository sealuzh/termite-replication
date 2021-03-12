  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(20);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 1);
      expressionMatrixImpl0.toString();
      assertEquals(20, expressionMatrixImpl0.getNumberOfElements());
  }
