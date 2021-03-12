  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[0];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }
