/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 03:35:06 GMT 2019
 */

package org.jsecurity.authc;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.InetAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UsernamePasswordToken_ESTest extends UsernamePasswordToken_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-19);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-39);
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("`S>t6yuk5X$e", "u1TDPfU$5-YJ", inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - `S>t6yuk5X$e, rememberMe=false (/237.1.255.217)", string0);
      
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("zy&gCMrh@Ggu:yA&^", "zy&gCMrh@Ggu:yA&^");
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[14];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true);
      usernamePasswordToken0.getUsername();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (char[]) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" (", " (", inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true, inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, false, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", (char[]) null, false, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(", rememberMe=", ", rememberMe=", true);
      usernamePasswordToken0.getCredentials();
      UsernamePasswordToken usernamePasswordToken1 = new UsernamePasswordToken(", rememberMe=", ", rememberMe=");
      usernamePasswordToken1.getInetAddress();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=, rememberMe=true", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("8IJ#a/Nb};LkTGV", "8IJ#a/Nb};LkTGV");
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("G-[vqAGUy");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("G-[vqAGUy", "G-[vqAGUy", inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("`", "`");
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      char[] charArray0 = new char[1];
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setUsername("Xx\"qvRR");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Cx", "Cx");
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, (InetAddress) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
