  public void test38()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("-");
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
