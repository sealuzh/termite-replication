  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields((SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }
