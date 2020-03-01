/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 17:33:23 GMT 2019
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
import net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier;
import net.sourceforge.squirrel_sql.fw.id.UidIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.ISQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Session_ESTest extends Session_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntegerIdentifier integerIdentifier0 = new IntegerIdentifier(0);
      SQLDriver sQLDriver0 = new SQLDriver(integerIdentifier0);
      SQLAlias sQLAlias0 = new SQLAlias(integerIdentifier0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ConnectionWrapper connectionWrapper0 = new ConnectionWrapper(connection0);
      ConnectionWrapper connectionWrapper1 = new ConnectionWrapper(connectionWrapper0);
      SQLConnection sQLConnection0 = new SQLConnection(connectionWrapper1, sQLDriverPropertyCollection0, (ISQLDriver) null);
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      UidIdentifier uidIdentifier1 = new UidIdentifier();
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) null, sQLAlias0, sQLConnection0, "JHBNSSejYw", "t.GPa?I,_kh&Z", integerIdentifier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.Session", e);
      }
  }
}
