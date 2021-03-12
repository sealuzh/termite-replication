  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      supportingDocument0.setDocumentCode("u");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals(0, arrayList0.size());
      assertFalse(supportingDocument0.isNewRecord());
  }
