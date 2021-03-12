  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }
