  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.addNewNode();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.getValue((-962), (-640));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      int int0 = expressionMatrixImpl1.addNewNode();
      assertEquals(1, int0);
      
      expressionMatrixImpl1.setValue((-640), 2717, (-962));
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      int int1 = expressionMatrixImpl1.getValue(1, (-1));
      assertEquals((-1), int1);
  }
