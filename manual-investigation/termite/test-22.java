  public void test0()  throws Throwable  {
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      SQLAlias sQLAlias0 = new SQLAlias();
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, sQLDriver0, sQLAlias0, (SQLConnection) null, "he.M#Y", "he.M#Y", uidIdentifier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.Session", e);
      }
  }
