  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1305));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\",k", "\",k", "\",k", "\",k");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-1305);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
