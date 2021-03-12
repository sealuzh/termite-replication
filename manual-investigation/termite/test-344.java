  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setTitle("u");
      supportingDocument0.setDocumentCode("c");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals(2, arrayList0.size());
      assertFalse(supportingDocument1.isNewRecord());
  }
