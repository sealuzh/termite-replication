  public void test38()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("i.ZpyC^uNNt*");
      supportingDocument0.setFileName("RMl_Dk+QrN");
      supportingDocument0.setDocumentCode("u");
      SupportingDocument.validateFields(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(0, supportingDocument0.getIdentifier());
  }
