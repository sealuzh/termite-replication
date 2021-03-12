  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(139);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      assertEquals(139, expressionMatrixImpl0.getNumberOfElements());
  }
