  public void test19()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("");
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
