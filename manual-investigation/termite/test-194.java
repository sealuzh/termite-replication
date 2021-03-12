  public void test03()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      mockFile0.mkdir();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
  }
