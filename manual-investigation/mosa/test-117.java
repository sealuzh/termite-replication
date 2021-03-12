  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("?|I2H[}[ZkLF~zmfZ`B");
      supportingDocument0.getFileName();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
