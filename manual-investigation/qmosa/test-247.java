  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(162);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl1 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl0.setRequired(false);
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-93), 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 144);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(2, (-1));
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(162, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(3, int0);
  }
