  public void test3()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("j\"/)TV", byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
