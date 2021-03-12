  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("aBs;(]W5", "aBs;(]W5");
      File file0 = MockFile.createTempFile("aBs;(]W5", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("aBs;(]W5/aBs;(]W5/aBs;(]W50.tmp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "=!g:;c`[");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, byteArrayOutputStream0);
      base64Decoder0.ProgressSet = true;
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals((-9992), mockFileInputStream0.available());
      //  // Unstable assertion: assertEquals(1L, base64Decoder0.getLineCount());
  }
