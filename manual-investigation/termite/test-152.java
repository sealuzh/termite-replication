  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      File file0 = fileIterator0.getNextFile();
      assertNotNull(file0);
      assertTrue(fileIterator0.hasNext());
  }
