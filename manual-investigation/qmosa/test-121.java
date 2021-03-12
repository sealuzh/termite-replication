  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      assertTrue(fileIterator0.hasNext());
  }
