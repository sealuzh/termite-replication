  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(162);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(162, 1409);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      HL7SegmentImpl hL7SegmentImpl0 = new HL7SegmentImpl();
      HL7FieldList hL7FieldList0 = hL7SegmentImpl0.getFields();
      hL7SegmentImpl0.setID("");
      hL7SegmentImpl0.setFields(hL7FieldList0);
      hL7MessageSegmentImpl0.setSegment(hL7SegmentImpl0);
      hL7MessageSegmentImpl0.setSegment(hL7SegmentImpl0);
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.creatMatrix(1409);
      expressionMatrixImpl1.getValue(162, 162);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl2.setValue(0, 1, (-1288));
      expressionMatrixImpl2.getValue(1, 4);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(162, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl2.getNumberOfElements();
      int int0 = expressionMatrixImpl2.getValue(0, 65);
      assertEquals((-1), int0);
  }
