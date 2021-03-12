  public void test19()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(45);
      int int0 = supportingDocument0.getIdentifier();
      assertEquals("45", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(45, int0);
  }
