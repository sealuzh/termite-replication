  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ClassWriter classWriter0 = new ClassWriter(4);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1699), "<Mm0{r;`/lk_", "<Mm0{r;`/lk_", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
