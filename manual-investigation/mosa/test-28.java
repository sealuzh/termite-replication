  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1487);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1487, "1", "1", "1", "1");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 1487;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
