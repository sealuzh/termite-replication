  public void test17()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile.createTempFile(".K5*h_Cm&|{", (String) null, (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }
