  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-50));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-50), "RfFSpqVY`>", "RfFSpqVY`>", "RfFSpqVY`>", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }
