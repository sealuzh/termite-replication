/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 23:00:11 GMT 2019
 */

package net.sourceforge.squirrel_sql.client.session;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.session.Session;
import net.sourceforge.squirrel_sql.fw.id.IIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.ISQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Session_ESTest extends Session_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SQLAlias sQLAlias0 = new SQLAlias();
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) null, sQLAlias0, (SQLConnection) null, "okxVa2h=;{i;D", "okxVa2h=;{i;D", (IIdentifier) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.Session", e);
      }
  }
}
