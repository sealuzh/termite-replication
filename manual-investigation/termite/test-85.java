  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "RfFSpqVY`>", "RfFSpqVY`>", "wheel.asm.ClassReader", (Object) null);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
