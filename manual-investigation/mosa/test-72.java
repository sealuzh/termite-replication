  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }
