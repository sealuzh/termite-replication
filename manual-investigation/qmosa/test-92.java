  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("YE11oXp)1A4;");
      supportingDocument0.setDocumentCode("-");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(2, arrayList0.size());
  }
