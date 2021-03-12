  public void test29()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }
