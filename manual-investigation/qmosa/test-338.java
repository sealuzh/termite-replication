  public void test42()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }
