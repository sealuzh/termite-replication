  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-932));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-932), "Kj%%y", "Kj%%y", "Kj%%y", "Kj%%y");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }
