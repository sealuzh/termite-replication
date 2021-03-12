  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("UNABLE_TO_UPDATE_ONTOLOGY_TERM");
      supportingDocument0.getTitle();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }
