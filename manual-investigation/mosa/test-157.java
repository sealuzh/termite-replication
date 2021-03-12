  public void test22()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("");
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
