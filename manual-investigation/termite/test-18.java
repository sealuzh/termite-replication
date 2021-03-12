  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1117);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-995), "RfFSpqVY`>", "RfFSpqVY`>", "eRl0#g#M&/lm2&", "");
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
