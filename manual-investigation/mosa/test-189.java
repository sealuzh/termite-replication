  public void test43()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User("xf$&H0T{M,`#?'", (String) null);
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, supportingDocument0.getIdentifier());
  }
