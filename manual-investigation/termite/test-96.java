  public void test51()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("u");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // u
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }
