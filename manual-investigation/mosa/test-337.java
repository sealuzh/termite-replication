  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("or.jcvi.jilli{\".cRre.util.LIF;7ueuL", "or.jcvi.jilli{\".cRre.util.LIF;7ueuL");
      File file0 = MockFile.createTempFile("or.jcvi.jilli{\".cRre.util.LIF;7ueuL", "or.jcvi.jilli{\".cRre.util.LIF;7ueuL", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      file0.setReadOnly();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      File file1 = fileIterator0.getNextFile();
      assertNotNull(file1);
      assertTrue(fileIterator0.hasNext());
  }
