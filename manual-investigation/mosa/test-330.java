  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("-");
      supportingDocument0.getDescription();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
