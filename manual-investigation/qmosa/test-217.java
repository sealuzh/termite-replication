  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl1.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.setValue(2951, (-1705), 66);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }
