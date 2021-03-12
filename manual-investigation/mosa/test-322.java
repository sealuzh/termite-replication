  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-3594));
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.addNewNode();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl", e);
      }
  }
