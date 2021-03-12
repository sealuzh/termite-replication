  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(763);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 76, "[S?F*k>b;oBxL,", "", "[S?F*k>b;oBxL,", "");
      Attribute attribute0 = new Attribute("RuntimeVisibleAnnotations");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
