  public void test4()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }