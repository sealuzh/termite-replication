  public void test20()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertFalse(supportingDocument0.isNewRecord());
      
      supportingDocument0.setIsNewRecord(true);
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertTrue(boolean0);
  }
