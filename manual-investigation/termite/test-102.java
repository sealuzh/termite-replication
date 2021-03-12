  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.getNextFile();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      fileIterator0.next();
      File file0 = fileIterator0.next();
      assertNotSame(mockFile0, file0);
  }
