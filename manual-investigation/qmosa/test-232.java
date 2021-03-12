  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile1 = new MockFile("", "org.jcvi.jillion.core.util.FileIterator$NonRecursiveFileIteratorBuilder");
      fileIterator0.setUpInitialState(mockFile1);
      assertFalse(fileIterator0.hasNext());
  }
