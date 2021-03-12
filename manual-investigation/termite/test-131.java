  public void test0()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("938.V\"", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
