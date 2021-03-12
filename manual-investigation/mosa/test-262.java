  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "CT", "CT", "CT", "CT");
      // Undeclared exception!
      try { 
        fieldWriter0.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }
