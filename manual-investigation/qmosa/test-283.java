  public void test35()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      supportingDocument0.setDescription("t");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals(1, arrayList0.size());
      assertFalse(supportingDocument1.isNewRecord());
  }
