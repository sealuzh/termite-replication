  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-633));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }
