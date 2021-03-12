  public void test62()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }
