  public void test43()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      assertEquals(0, supportingDocument0.getIdentifier());
  }
