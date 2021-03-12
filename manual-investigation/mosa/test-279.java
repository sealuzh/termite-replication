  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "!Gb$\"N)jQRK9", "vQSoy`\"?GD");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[5];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("){;:c>-Ofc1+", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
