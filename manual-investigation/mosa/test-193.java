  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1487);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 1487;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 6, "", (String) null, "", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
