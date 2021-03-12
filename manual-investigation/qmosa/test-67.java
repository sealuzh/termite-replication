  public void test3()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
