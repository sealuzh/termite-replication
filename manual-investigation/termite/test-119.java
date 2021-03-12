  public void test31()  throws Throwable  {
      User user0 = new User();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, (SupportingDocument) null, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }
