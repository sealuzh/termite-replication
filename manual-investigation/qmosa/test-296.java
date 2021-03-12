  public void test34()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFileName("YE11oAXp)1A4;");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }
