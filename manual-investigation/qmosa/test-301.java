  public void test28()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("");
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }
