  public void test39()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      assertFalse(supportingDocument0.isNewRecord());
  }
