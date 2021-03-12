  public void test44()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("-", string0);
  }
