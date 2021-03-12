  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, ":eL", "", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }
