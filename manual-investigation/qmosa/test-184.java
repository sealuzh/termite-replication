  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(176);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2462), "ssFKP%-x=R.w", "LocalVariableTypeTable", (String) null, "ssFKP%-x=R.w");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[3];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
