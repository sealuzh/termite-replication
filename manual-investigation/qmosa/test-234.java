  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(176);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "{7";
      stringArray0[1] = "";
      stringArray0[2] = "{7";
      stringArray0[3] = "{7";
      stringArray0[4] = "Synthetic";
      stringArray0[5] = "";
      stringArray0[6] = "{7";
      stringArray0[7] = "";
      classWriter0.visit(49, (-1646), "", "RuntimeVisibleAnnotations", "{7", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-663), "Deprecated", "Deprecated", "+", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }
