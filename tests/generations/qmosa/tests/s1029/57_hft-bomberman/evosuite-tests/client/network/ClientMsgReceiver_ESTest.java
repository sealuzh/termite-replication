/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 12 12:22:33 GMT 2020
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Socket;
import messages.round.PowerUpHitMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClientMsgReceiver clientMsgReceiver0 = null;
      try {
        clientMsgReceiver0 = new ClientMsgReceiver((Socket) null, (BomberClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("common.network.MsgReceiver", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.displayErrorMessage();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      PowerUpHitMsg powerUpHitMsg0 = new PowerUpHitMsg(0, 1, 1);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(powerUpHitMsg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("client.network.ClientMsgReceiver", e);
      }
  }
}
