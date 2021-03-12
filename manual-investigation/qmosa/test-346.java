  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("1X[");
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
