/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 09:43:54 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)36;
      player0.unpack(byteArray0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(3, "y3!{JJN<`]0?WZ&fo", " aL/}:", (-723), (-723));
      player0.pack();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("y3!{JJN<`]0?WZ&fo", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-723), player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals((-723), player0.getPictureId());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(203, "lZnJ7\"lM_el", "", 203, 203);
      player0.setJoinOK(player0, true);
      System.setCurrentTimeMillis(1392409296346L);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(203, player0.getStrength());
      assertEquals(203, player0.getPictureId());
      assertEquals("lZnJ7\"lM_el", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.setJoinOK(player1, true);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertTrue(player1.isConnected());
      assertEquals(0, player1.getPictureId());
      assertFalse(boolean0);
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertFalse(player1.isDead());
      assertEquals("Player-1", player1.getName());
      assertEquals(1, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player1.add(player0);
      int int0 = player1.gangStrength();
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(2, int0);
      assertTrue(player1.isConnected());
      assertEquals(0, player1.getPictureId());
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertFalse(player1.isDead());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals("Player-1", player1.getName());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      MockPrintStream mockPrintStream0 = new MockPrintStream("state.Party");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      player0.pack(dataOutputStream0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("Player-1", player0.toString());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.getName());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(977, (String) null, (String) null, 977, 977);
      player0.toString();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(977, player0.getStrength());
      assertEquals(977, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((byte) (-34), "6m&", "", 4919);
      player0.toString();
      assertEquals("6m&", player0.getIP());
      assertEquals(4919, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((-8700), "];}H1", "];}H1", (-8700));
      player0.setZ((-8700));
      float float0 = player0.getZ();
      assertEquals((-8700.0F), float0, 0.01F);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(0.0F, player0.getY(), 0.01F);
      
      player0.setY(1.0F);
      float float0 = player0.getY();
      assertEquals(1.0F, float0, 0.01F);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((-8511));
      player0.setX((-220.21F));
      float float0 = player0.getX();
      assertEquals((-220.21F), float0, 0.01F);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(2983);
      player0.setDead();
      long long0 = player0.getTimeOfDeath();
      assertEquals(1392409281320L, long0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead((-758L), false);
      long long0 = player0.getTimeOfDeath();
      assertEquals((-758L), long0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((short)4919, "state.Party", "state.Party", (short)4919, 0);
      int int0 = player0.getStrength();
      assertEquals(0, int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(4919, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player(1697, " aL/}:", " aL/}:", 256, 1246);
      int int0 = player0.getStrength();
      assertEquals(256, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1246, int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(1320);
      int int0 = player0.getPictureId();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals("Player1320", player0.getName());
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(977, (String) null, (String) null, 977, 977);
      int int0 = player0.getPictureId();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(977, int0);
      assertTrue(player0.isConnected());
      assertEquals(977, player0.getStrength());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getName();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("Player-1", string0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((-548), "", "", (-548));
      player0.getName();
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-548), player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      
      player0.setMoney(0.1F);
      float float0 = player0.getMoney();
      assertEquals(0.1F, float0, 0.01F);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player(977, (String) null, (String) null, 977, 977);
      player0.setMoney((-359.8389F));
      float float0 = player0.getMoney();
      assertEquals((-359.8389F), float0, 0.01F);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((-13567), (String) null, (String) null, (short)4919, (short)4919);
      player0.getIP();
      assertEquals(4919, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(4919, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player(20651, "", "gui.ModuleBrowserDialog$ModuleFilter", (-2521));
      String string0 = player0.getIP();
      assertEquals((-2521), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("", string0);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(0, "", "0.0.0.0", 0, 0);
      int int0 = player0.gangStrength();
      assertEquals(0, int0);
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("", player0.getIP());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(3, "y3!{JJN<`]0?WZ&fo", " aL/}:", (-723), (-723));
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-723), int0);
      assertEquals((-723), player0.getPictureId());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.unpack((DataInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player(5, "]5z!f+T+.7", 92);
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-61), 2347);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        player0.unpack(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.setJoinOK((Player) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.isJoinOK((Player) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(1, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead((long) (short)4919);
      assertEquals(4919L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.pack((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      System.setCurrentTimeMillis(1392409296320L);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.getName());
      assertFalse(player0.isDead());
      assertFalse(boolean0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player(2983);
      player0.setDead();
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getZ();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isConnected();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertTrue(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player(3, "y3!{JJN<`]0?WZ&fo", " aL/}:", (-723), (-723));
      int int0 = player0.getStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("y3!{JJN<`]0?WZ&fo", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals((-723), player0.getPictureId());
      assertEquals((-723), int0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player(1320);
      // Undeclared exception!
      try { 
        player0.unpack((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getIP();
      assertEquals("0.0.0.0", string0);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player((-2809), (String) null, 4919);
      player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(4919, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.toString();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", string0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player((-27711), (String) null, (-27711));
      // Undeclared exception!
      try { 
        player0.pack();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getY();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.toString());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(5, int0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ((short)4919);
      float float0 = player0.getZ();
      assertEquals(4919.0F, float0, 0.01F);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player((-8501), "", "", (-8501), (-8501));
      player0.setY((-1589.0F));
      float float0 = player0.getY();
      assertEquals((-1589.0F), float0, 0.01F);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player(3950, "^4`Xat~pT$2P", "^4`Xat~pT$2P", (-4940), 3950);
      int int0 = player0.getPictureId();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals((-4940), int0);
      assertTrue(player0.isConnected());
      assertEquals(3950, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getMoney();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
  }
}
