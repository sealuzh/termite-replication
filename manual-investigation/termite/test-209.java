  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1117);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-995), "wheel.asm.ClassReader", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }
