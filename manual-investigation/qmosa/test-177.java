  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(176);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2462), "ssFKP%-x=R.w", "LocalVariableTypeTable", (String) null, "ssFKP%-x=R.w");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[1];
      byteVector0.data = byteArray0;
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "fg\"%I", "v", "@PV:OT},6}&bMWPICq", (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
