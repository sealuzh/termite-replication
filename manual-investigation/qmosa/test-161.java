  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertFalse(int1 == int0);
  }
