  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-153));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", (String) null, "");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-259);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("%L/+aRR:", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -259
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }
