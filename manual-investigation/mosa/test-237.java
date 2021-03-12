  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(57);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 57, "}b5K$rEo", "}b5K$rEo", "}b5K$rEo", "}b5K$rEo");
      fieldWriter0.visitAnnotation("}b5K$rEo", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }
