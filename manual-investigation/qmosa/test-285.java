  public void test40()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }
