  public void test32()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      supportingDocument0.setDescription((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
