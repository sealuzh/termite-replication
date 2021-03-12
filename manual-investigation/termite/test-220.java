  public void test09()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 1, "", "", "wheel.asm.FieldWriter", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }
