  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("d", "fileFilter can not be null");
      MockFile mockFile1 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(mockFile0);
      assertFalse(mockFile0.exists());
  }
