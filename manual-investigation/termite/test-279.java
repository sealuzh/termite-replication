  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-50));
      byte[] byteArray0 = new byte[3];
      String[] stringArray0 = new String[0];
      classWriter0.visit((-625), 79, "5\"l C", "5\"l C", "5\"l C", stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.data = byteArray0;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-50), "5% :oHQ", "", "org.apache.commons.io.filefilter.NotFileFilter", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
