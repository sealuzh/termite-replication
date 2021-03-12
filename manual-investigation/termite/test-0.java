  public void test1()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass((String) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.densebrain.rif.client.RIFClassLoader", e);
      }
  }
