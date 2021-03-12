  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(176);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2462), "ssFKP%-x=R.w", "LocalVariableTypeTable", (String) null, "ssFKP%-x=R.w");
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
