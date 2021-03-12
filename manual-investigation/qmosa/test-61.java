  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(162);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(162, 1409);
      expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doEndItem(expressionImpl0, hL7MessageSegmentImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl1 = new HL7MessageSegmentImpl();
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      HL7SegmentImpl hL7SegmentImpl0 = new HL7SegmentImpl();
      HL7FieldList hL7FieldList0 = hL7SegmentImpl0.getFields();
      hL7SegmentImpl0.setFields(hL7FieldList0);
      hL7MessageSegmentImpl1.setSegment(hL7SegmentImpl0);
      hL7MessageSegmentImpl1.setSegment(hL7SegmentImpl0);
      ExpressionImpl expressionImpl2 = new ExpressionImpl();
      messageTracerImpl0.doBeginItem(expressionImpl2, hL7MessageSegmentImpl1);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.creatMatrix(1409);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue(0, (-1), (-1));
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl2.setValue(0, 0, (-1288));
      expressionMatrixImpl2.getValue(1, 4);
      expressionMatrixImpl0.toString();
      assertEquals(162, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl2.getNumberOfElements();
      int int0 = expressionMatrixImpl2.getValue((-1288), 1807);
      assertEquals((-1), int0);
  }
