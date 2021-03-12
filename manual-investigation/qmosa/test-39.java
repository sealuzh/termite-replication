  public void test7()  throws Throwable  {
      MockFile mockFile0 = new MockFile("aBs;(]W5", "aBs;(]W5");
      File file0 = MockFile.createTempFile("aBs;(]W5", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("aBs;(]W5/aBs;(]W5/aBs;(]W50.tmp");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, byteArrayOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals((-1), mockFileInputStream0.available());
      assertEquals(1L, base64Decoder0.getLineCount());
  }
