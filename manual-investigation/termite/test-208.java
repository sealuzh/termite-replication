  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
  }
