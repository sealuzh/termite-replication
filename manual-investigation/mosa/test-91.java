  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }
