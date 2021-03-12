  public void test41()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("o");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }
