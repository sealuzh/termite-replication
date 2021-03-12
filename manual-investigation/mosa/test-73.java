  public void test30()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("o");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals(1, arrayList0.size());
      assertFalse(supportingDocument1.isNewRecord());
  }
