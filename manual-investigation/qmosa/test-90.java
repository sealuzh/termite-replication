  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      MockFile.createTempFile("gSj?KE4", "", (File) mockFile0);
      fileIterator0.forEach(consumer0);
      assertFalse(fileIterator0.hasNext());
  }
