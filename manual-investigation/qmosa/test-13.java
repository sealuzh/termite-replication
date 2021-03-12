  public void test0()  throws Throwable  {
      IntegerIdentifier integerIdentifier0 = new IntegerIdentifier(1031);
      SQLDriver sQLDriver0 = new SQLDriver(integerIdentifier0);
      SQLAlias sQLAlias0 = new SQLAlias(integerIdentifier0);
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, sQLDriver0, sQLAlias0, (SQLConnection) null, "", "", integerIdentifier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.Session", e);
      }
  }
