  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(162);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(162, 1409);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      HL7SegmentImpl hL7SegmentImpl0 = new HL7SegmentImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl1.creatMatrix(1409);
      expressionMatrixImpl1.getValue(162, 162);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, (-1288));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl1.toString();
  }
