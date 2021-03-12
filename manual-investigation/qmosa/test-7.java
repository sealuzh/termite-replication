  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int0);
  }
