  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1117);
      Attribute attribute0 = new Attribute("wheel.asm.ClassReader");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-995), "wheel.asm.ClassReader", "", "", "");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }
