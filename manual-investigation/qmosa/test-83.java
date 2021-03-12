  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("u$|>no-Mdo)a/", byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
