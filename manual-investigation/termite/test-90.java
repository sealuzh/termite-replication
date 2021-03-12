  public void test12()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      mockFile0.mkdir();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      mockFile0.delete();
      // Undeclared exception!
      try { 
        fileIterator0.iterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }
