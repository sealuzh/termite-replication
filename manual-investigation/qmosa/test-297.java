  public void test29()  throws Throwable  {
      User user0 = new User("^E,=*mgT;u", "supportingDocument.fileName.label");
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, (SupportingDocument) null, (SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }
