  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(122);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "n", "n", "n", "n");
      Attribute attribute0 = new Attribute("n");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(1);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }
