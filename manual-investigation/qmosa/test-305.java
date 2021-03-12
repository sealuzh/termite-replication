  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      boolean boolean0 = false;
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.addNewNode();
      int int0 = 776;
      expressionMatrixImpl0.creatMatrix(776);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      int int1 = (-1302);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(0, expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.getItem(1699);
      expressionElementMapperImpl0.setItem((-1302), (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.removeItem(1);
      expressionElementMapperImpl0.getItem(1);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
