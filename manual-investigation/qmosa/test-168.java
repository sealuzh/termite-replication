  public void test6()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("aBs;(]W5/aBs;(]W5/aBs;(]W50.tmp");
      MockFile mockFile0 = new MockFile("aBs;(]W5", "aBs;(]W5");
      File file0 = MockFile.createTempFile("aBs;(]W5", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "id");
      mockFileInputStream0.read(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, byteArrayOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }