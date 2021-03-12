  public void test33()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("b`'r=,symP&m8%o@");
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }
