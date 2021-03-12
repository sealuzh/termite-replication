  public void test25()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("");
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
