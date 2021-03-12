  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }
