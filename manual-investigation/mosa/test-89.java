  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-833));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }
