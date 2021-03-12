  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1117);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-995), "RfFSpqVY`>", "RfFSpqVY`>", "eRl0#g#M&/lm2&", "");
      Attribute attribute0 = new Attribute("eRl0#g#M&/lm2&");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
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
