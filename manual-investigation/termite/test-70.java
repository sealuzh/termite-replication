  public void test0()  throws Throwable  {
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, (OutputStream) null);
      // Undeclared exception!
      try { 
        base64Decoder0.decodeStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.Base64Decoder", e);
      }
  }
