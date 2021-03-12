  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      assertFalse(fileIterator0.hasNext());
  }
