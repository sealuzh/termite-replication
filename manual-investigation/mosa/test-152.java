  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(136);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "n", "n", "n", "n");
      fieldWriter0.visitAnnotation("n", false);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }
