  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2036);
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
