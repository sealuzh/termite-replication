  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.LIFOQueue", "org.jcvi.jillion.core.util.LIFOQueue");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.jcvi.jillion.core.util.LIFOQueue/org.jcvi.jillion.core.util.LIFOQueue/org.jcvi.jillion.core.util.LIFOQueue0org.jcvi.jillion.core.util.LIFOQueue");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "fB>");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertEquals("org.jcvi.jillion.core.util.LIFOQueue0org.jcvi.jillion.core.util.LIFOQueue", file0.getName());
  }
