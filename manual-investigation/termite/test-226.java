  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode("u");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }
