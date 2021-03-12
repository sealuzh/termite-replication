  public void test43()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertNotSame(supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument1.isNewRecord());
  }
