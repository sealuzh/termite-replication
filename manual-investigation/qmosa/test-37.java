  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("YE11oAXp)1A4;");
      supportingDocument0.setDocumentCode("t");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(2, arrayList0.size());
  }
