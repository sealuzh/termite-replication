  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(0);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getNumberOfElements();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
