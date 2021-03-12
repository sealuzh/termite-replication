/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 06 12:07:27 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(2073);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)27;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      System.setCurrentTimeMillis(1392409296333L);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(boolean0);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(1, player1.getStrength());
      assertEquals("Player-1", player1.toString());
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0, player1.getPictureId());
      assertEquals("0.0.0.0", player1.getIP());
      assertTrue(player1.isConnected());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-567), "6", "6", (-567));
      Party party0 = new Party(205);
      player0.head = party0;
      // Undeclared exception!
      try { 
        player0.gangStrength();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // state.Party cannot be cast to state.Player
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((short)4919);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      player0.pack(dataOutputStream0);
      assertEquals(29, byteArrayOutputStream0.size());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals("Player-1", player0.getName());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.toString();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", string0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((-21), "", (-21));
      player0.toString();
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals((-21), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player();
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ(1556.0226F);
      float float0 = player0.getZ();
      assertEquals(1556.0226F, float0, 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ((byte) (-34));
      float float0 = player0.getZ();
      assertEquals((-34.0F), float0, 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(2073);
      player0.setY((byte)27);
      float float0 = player0.getY();
      assertEquals(27.0F, float0, 0.01F);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      player0.setY((-2055.239F));
      float float0 = player0.getY();
      assertEquals((-2055.239F), float0, 0.01F);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(257, "g<-_lp)4", 1962);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(1, "hgLk(**9<g%", "hgLk(**9<g%", 1);
      player0.setX((-1756.21F));
      float float0 = player0.getX();
      assertEquals((-1756.21F), float0, 0.01F);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      long long0 = player0.getTimeOfDeath();
      assertEquals(1392409281320L, long0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((-3328));
      player0.setDead((long) (-3328));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-3328L), long0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player(5, "Y|x;SNIiWO", "Y|x;SNIiWO", 5, 0);
      int int0 = player0.getStrength();
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
      assertEquals(5, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(249, "", "0.0.0.0", 249, (-5888));
      int int0 = player0.getStrength();
      assertEquals((-5888), int0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("", player0.getIP());
      assertEquals(249, player0.getPictureId());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((-1376), "_maH{C`]?\"", "_maH{C`]?\"", 62, (-1376));
      int int0 = player0.getPictureId();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-1376), player0.getStrength());
      assertEquals(62, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((short)4919, "", "", (-254), (short)4919);
      int int0 = player0.getPictureId();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(4919, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals((-254), int0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player(5, (String) null, (String) null, 12544);
      player0.getName();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(12544, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player((short)4919, (String) null, "", (short)4919, (short)4919);
      player0.getName();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(4919, player0.getPictureId());
      assertEquals(4919, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney((short)4919);
      float float0 = player0.getMoney();
      assertEquals(4919.0F, float0, 0.01F);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney((-2342.0F));
      float float0 = player0.getMoney();
      assertEquals((-2342.0F), float0, 0.01F);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((short)4919, (String) null, "", (short)4919, (short)4919);
      String string0 = player0.getIP();
      assertNull(string0);
      assertTrue(player0.isConnected());
      assertEquals(4919, player0.getPictureId());
      assertEquals(4919, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player((byte)5, "", (String) null, (-1394));
      String string0 = player0.getIP();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertNotNull(string0);
      assertEquals((-1394), player0.getPictureId());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(5, "Y|x;SNIiWO", "Y|x;SNIiWO", 5, 0);
      int int0 = player0.gangStrength();
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(5, player0.getPictureId());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player((-521), "-/p2!M", "-/p2!M", (-521), (-521));
      int int0 = player0.gangStrength();
      assertFalse(player0.isDead());
      assertEquals((-521), player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-521), int0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player();
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
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.setJoinOK((Player) null, true);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        player0.pack(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player(5, (String) null, 5);
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
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.isJoinOK((Player) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player(5, "Y|x;SNIiWO", "Y|x;SNIiWO", 5, 0);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((long) 0, true);
      assertEquals(0, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(5, player0.getPictureId());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player(409);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(0, player0.getPictureId());
      assertEquals((-1), player0.getId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals("Player-1", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      System.setCurrentTimeMillis(1392409296320L);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("Player-1", player0.getName());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(boolean0);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.toString());
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player(1895, "xL4Z]lRrqW", "xL4Z]lRrqW", 1895, 1895);
      int int0 = player0.gangStrength();
      assertEquals(1895, int0);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1895, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getZ();
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player-1", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player((-21), "", (-21));
      boolean boolean0 = player0.isConnected();
      assertEquals((-21), player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(boolean0);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player(2732, "`-Eef{{>vH", "`-Eef{{>vH", (-640), 2732);
      int int0 = player0.getStrength();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(2732, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-640), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player((-2823), " xPjiRc1N+en_\"", (-2823));
      String string0 = player0.getIP();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("0.0.0.0", string0);
      assertTrue(player0.isConnected());
      assertEquals((-2823), player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("Player-1", string0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player((-1293), (String) null, (String) null, (-1293), 0);
      player0.toString();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals((-1293), player0.getPictureId());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player((-572), "", "", (-572), 3095);
      player0.pack();
      assertEquals((-572), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(3095, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getY();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(5, int0);
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player(1);
      long long0 = player0.getTimeOfDeath();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, long0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals("Player1", player0.getName());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getPictureId();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, int0);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Player player0 = new Player((-1293), (String) null, (String) null, (-1293), 0);
      float float0 = player0.getMoney();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getStrength());
      assertEquals((-1293), player0.getPictureId());
  }
}
