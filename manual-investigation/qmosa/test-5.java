  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "#]D2gz+{+@'Q7-V`FK", "jF\"gw[}+skO,", "#]D2gz+{+@'Q7-V`FK", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@798a31b4
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }
