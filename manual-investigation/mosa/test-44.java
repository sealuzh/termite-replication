  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pipedInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }
