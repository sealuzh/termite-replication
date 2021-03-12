  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("t");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertTrue(arrayList0.isEmpty());
  }
