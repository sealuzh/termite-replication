  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2783);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl0.setRequired(false);
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 161);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2, 1);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }
