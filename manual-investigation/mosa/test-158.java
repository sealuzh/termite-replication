  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(43);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
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
