  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-633));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-633), "", "", "", "");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "org.apache.commons.io.filefilter.HiddenFileFilter", "Fb_SQ6/@I&l|0", "org.apache.commons.io.filefilter.HiddenFileFilter", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@125280fd
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }
