  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFilePath();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
