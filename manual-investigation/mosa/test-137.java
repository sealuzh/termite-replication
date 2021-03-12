  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1487);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1487, "", "", "", "");
      Attribute attribute0 = new Attribute("");
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
