  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(176);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2454), "RuntimeVisibleAnnotations", "java/lang/Throwable", (String) null, "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("r7@exq!", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }
