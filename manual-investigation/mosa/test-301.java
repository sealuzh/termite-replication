  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile(" G!{", "", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
      assertTrue(file0.canExecute());
  }
