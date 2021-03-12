/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 13:51:14 GMT 2020
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[5];
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" (", charArray0, true, inetAddress0);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[7];
      InetAddress inetAddress0 = MockInetAddress.getByName("9");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("\"!RFsz,ljzMe$", charArray0, true, inetAddress0);
      usernamePasswordToken0.getUsername();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[5];
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true, inetAddress0);
      usernamePasswordToken0.getUsername();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[7];
      InetAddress inetAddress0 = MockInetAddress.getByName("9");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("9", charArray0, true, inetAddress0);
      usernamePasswordToken0.getPrincipal();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[7];
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("3u;mB!3q%", charArray0, true, inetAddress0);
      usernamePasswordToken0.getPassword();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-20);
      InetAddress inetAddress0 = MockInetAddress.getByAddress(" - ", byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", " - ", true, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[0];
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("E'xLs$}s1^M", charArray0, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("NgZQ]un", charArray0, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, charArray0, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[7];
      InetAddress inetAddress0 = MockInetAddress.getByName("9");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("9", charArray0, true, inetAddress0);
      usernamePasswordToken0.getCredentials();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (char[]) null, true, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true (/192.168.1.42)", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[7];
      InetAddress inetAddress0 = MockInetAddress.getByName("9");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("\"!RFsz,ljzMe$", charArray0, true, inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, true, inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("[prB,2XQl){>r^", "[prB,2XQl){>r^", inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("y:A<U.?Iy", "y:A<U.?Iy");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[4];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("6%[dp:m63/ ", charArray0, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte) (-1);
      InetAddress inetAddress0 = MockInetAddress.getByAddress("6%[dp:m63/ ", byteArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("m@gVrz:k_$Nz", (char[]) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setUsername("5");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[7];
      InetAddress inetAddress0 = MockInetAddress.getByName("9");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("9", charArray0, true, inetAddress0);
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false);
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[10];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("h64", charArray0, (InetAddress) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setRememberMe(false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
