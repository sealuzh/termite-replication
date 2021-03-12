  public void test07()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, (-2898), (String) null, "", (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }
