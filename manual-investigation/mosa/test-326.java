  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges((User) null, (SupportingDocument) null, (SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }
