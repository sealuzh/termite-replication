  public void test33()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("H=$j]g_;U");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
  }
