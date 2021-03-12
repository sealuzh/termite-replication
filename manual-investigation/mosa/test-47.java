  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-633));
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-633), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }
