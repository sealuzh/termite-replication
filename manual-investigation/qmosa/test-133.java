  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(763);
      byte[] byteArray0 = classWriter0.toByteArray();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 76, "[S?F*k>b;oBxL,", "", "[S?F*k>b;oBxL,", "");
      Attribute attribute0 = new Attribute("RuntimeVisibleAnnotations");
      fieldWriter0.visitAttribute(attribute0);
      attribute0.value = byteArray0;
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.getSize();
  }
