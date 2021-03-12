  public void test58()  throws Throwable  {
      Player player0 = new Player(1073);
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(49, player0.getId());
  }
