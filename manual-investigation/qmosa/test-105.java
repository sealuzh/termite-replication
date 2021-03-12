  public void test28()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.getItem(3);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.setItem(3, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-962), (-962));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue((-962), 0, 574);
      expressionMatrixImpl0.getValue((-2776), 20480);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }
