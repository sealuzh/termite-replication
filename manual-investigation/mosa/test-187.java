  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("J}]-@7du;H #jVF:<j/J}]-@7du;H #jVF:<j0J}]-@7du;H #jVF:<j");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertEquals("J}]-@7du;H #jVF:<j0J}]-@7du;H #jVF:<j", file0.getName());
      assertNotNull(file0);
  }
