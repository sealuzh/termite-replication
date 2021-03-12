  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      MockFile.createTempFile("gSj?KE4", (String) null);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.next();
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
  }
