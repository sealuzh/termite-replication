  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      supportingDocument0.setTitle("i.ZpyC^uNNt*");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDocumentCode("c");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(2, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }
