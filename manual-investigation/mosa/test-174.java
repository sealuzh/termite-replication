  public void test40()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertNotSame(supportingDocument1, supportingDocument0);
  }
