  public void test31()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }
