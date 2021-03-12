  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "RfFSpqVY`>", "RfFSpqVY`>", "wheel.asm.ClassReader", (Object) null);
      fieldWriter0.visitAnnotation("ConstantValue", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }
