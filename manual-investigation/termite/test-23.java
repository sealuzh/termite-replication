  public void test1()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ABORT);
  }
