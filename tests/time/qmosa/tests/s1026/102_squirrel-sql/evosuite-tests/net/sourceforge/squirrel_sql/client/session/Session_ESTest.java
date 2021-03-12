/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 11:16:33 GMT 2020
 */

package net.sourceforge.squirrel_sql.client.session;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper;
import java.sql.Connection;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.session.Session;
import net.sourceforge.squirrel_sql.fw.id.IIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.ISQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Session_ESTest extends Session_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SQLAlias sQLAlias0 = new SQLAlias();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      ConnectionWrapper connectionWrapper0 = new ConnectionWrapper(connection0);
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = sQLAlias0.getDriverPropertiesClone();
      SQLConnection sQLConnection0 = new SQLConnection(connectionWrapper0, sQLDriverPropertyCollection0, (ISQLDriver) null);
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) null, sQLAlias0, sQLConnection0, "sessionId == null", "6G~k", (IIdentifier) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.Session", e);
      }
  }
}
