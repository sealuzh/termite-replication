  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 857, "RfFSpqVY`>", "RfFSpqVY`>", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(857);
      byte[] byteArray0 = new byte[0];
      byteVector1.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
