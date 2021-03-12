  public void test32()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges((User) null, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }
