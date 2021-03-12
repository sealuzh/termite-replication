  public void test36()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("H=$j]g_;U");
      supportingDocument0.setFileName("^E,=*mgT;u");
      supportingDocument0.setDocumentCode("H=$j]g_;U");
      SupportingDocument.validateFields(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
