  public void test41()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", string0);
  }
