  public void test14()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }
