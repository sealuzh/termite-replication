  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      MockFile.createTempFile(".slj", ".slj", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }
