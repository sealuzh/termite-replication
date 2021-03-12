  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.toString();
      expressionElementMapperImpl0.getItem(0);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.removeItem(318);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.creatMatrix(0);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
      
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.removeItem(5484);
      expressionElementMapperImpl1.getItem(5484);
      expressionElementMapperImpl1.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl1.addItem((ExpressionElementMapperItem) null);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.setValue(0, 1, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue((-1458), 0, 2);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(5, int0);
      
      expressionMatrixImpl0.getValue(318, 670);
      int int1 = expressionMatrixImpl0.getValue(0, (-426));
      assertEquals((-1), int1);
      
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }
