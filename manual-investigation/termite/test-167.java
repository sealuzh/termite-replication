  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("u");
      supportingDocument0.getTitle();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
