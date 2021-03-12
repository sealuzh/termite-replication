  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("y");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      MockFile.createTempFile("org.jcvi.jillion.coreutil.iter.IteratorUtil", "org.jcvi.jillion.coreutil.iter.IteratorUtil", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        fileIterator0.setUpInitialState((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator", e);
      }
  }
