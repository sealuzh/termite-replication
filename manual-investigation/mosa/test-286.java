  public void test39()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDocumentCode("E");
      User user0 = new User("E", "E");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
  }
