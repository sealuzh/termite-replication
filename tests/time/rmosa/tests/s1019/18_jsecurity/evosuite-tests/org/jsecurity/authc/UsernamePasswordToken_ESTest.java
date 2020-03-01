/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 07:13:22 GMT 2019
 */

package org.jsecurity.authc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UsernamePasswordToken_ESTest extends UsernamePasswordToken_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[3] = 'f';
      charArray0[1] = '1';
      charArray0[2] = 'n';
      charArray0[1] = 'e';
      charArray0[4] = '0';
      charArray0[5] = 'v';
      charArray0[6] = '\\';
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-27);
      byteArray0[1] = (byte)110;
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte)6;
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("]MW7JuoexJM'ht", charArray0, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/192.168.1.42)", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("%G\"^`.<gE", (String) null, true, inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true);
      try { 
        MockInetAddress.getByAddress((byte[]) null);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" (", (String) null, false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, charArray0);
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("?1z)", charArray0, true, inetAddress0);
      usernamePasswordToken0.getCredentials();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(". F~UtHWlU@", ". F~UtHWlU@");
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("1TCAn+ry@", (char[]) null, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("1?sclp! 4", (char[]) null, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("1TCAn+ry@", "1TCAn+ry@", false, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("n", (char[]) null, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[0];
      InetAddress inetAddress0 = MockInetAddress.getByName(" (");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" (", charArray0, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("984", "984", inetAddress0);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      assertFalse(inetAddress0.isAnyLocalAddress());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("?1z)", charArray0, true, inetAddress0);
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '}';
      charArray0[1] = '@';
      charArray0[2] = '\'';
      charArray0[3] = 'U';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false, (InetAddress) null);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(")Kj(,@BO^9a@", ")Kj(,@BO^9a@");
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true (/127.0.0.1)", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true, inetAddress0);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setUsername("f3j");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setRememberMe(true);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      assertFalse(inetAddress0.isLinkLocalAddress());
  }
}
