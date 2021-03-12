  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(13);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals(13, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(0, int0);
  }
