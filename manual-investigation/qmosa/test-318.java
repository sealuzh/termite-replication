  public void test23()  throws Throwable  {
      Player player0 = new Player((-452), (String) null, "5)4:uzi32VgOiQ", 0, 0);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }
