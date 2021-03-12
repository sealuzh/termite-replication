  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("eP3w#L`X![j_*!");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }
