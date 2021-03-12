  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("eP3w#L`X![j_*!");
      MockFile.createTempFile("eP3w#L`X![j_*!", "eP3w#L`X![j_*!", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      File file0 = fileIterator0.getNextFile();
      assertNotNull(file0);
      assertTrue(fileIterator0.hasNext());
  }
