  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-50));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-50), "RfFSpqVY`>", "RfFSpqVY`>", "RfFSpqVY`>", "RfFSpqVY`>");
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
