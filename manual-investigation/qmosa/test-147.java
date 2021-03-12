  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "ConstantValue", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(0);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
