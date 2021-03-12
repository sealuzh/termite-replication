  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "ConstantValue", "", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[2];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
