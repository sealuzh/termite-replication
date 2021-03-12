  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-792));
      classWriter0.index = 131072;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "L9^", "M", "", "");
      // Undeclared exception!
      fieldWriter0.getSize();
  }
