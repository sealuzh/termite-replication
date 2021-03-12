  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("?eP3w#LK`X![j_*!", "");
      MockFile.createTempFile("?eP3w#LK`X![j_*!", "?eP3w#LK`X![j_*!", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }
