  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.FileIterator$NonRecursiveFileIteratorBuilder", "org.jcvi.jillion.core.util.FileIterator");
      MockFile.createTempFile("w+bWF#On%+0Q|", "", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertEquals(0L, file0.getUsableSpace());
  }
