  public void test15()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.getTitle();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
