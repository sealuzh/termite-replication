  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }
