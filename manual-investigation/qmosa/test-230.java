  public void test50()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("org.quickserver.util.pool.MakeQSXbjectPool");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.util.pool.MakeQSXbjectPool
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }
