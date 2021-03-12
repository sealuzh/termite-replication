  public void test12()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      HL7SegmentImpl hL7SegmentImpl0 = new HL7SegmentImpl();
      HL7FieldList hL7FieldList0 = hL7SegmentImpl0.getFields();
      hL7SegmentImpl0.setID("");
      hL7SegmentImpl0.setFields(hL7FieldList0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl0.setSegment(hL7SegmentImpl0);
      hL7MessageSegmentImpl0.setSegment(hL7SegmentImpl0);
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      MessageTracerImpl messageTracerImpl2 = new MessageTracerImpl();
      messageTracerImpl2.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = 2349;
      expressionMatrixImpl0.creatMatrix(2349);
      expressionMatrixImpl0.getValue(2854, 526);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue((-1), 2277, 2349);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue(2349, 558, (-3306));
      expressionMatrixImpl0.getValue(2854, 2277);
      expressionMatrixImpl1.toString();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }
