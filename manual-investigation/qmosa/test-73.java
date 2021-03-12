  public void test17()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDescription();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
