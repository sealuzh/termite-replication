/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 06:51:49 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((-1), (String) null, (-1));
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)88;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 5);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(4, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((-1637), "'rG%2.a1IN6c\"TJm", "'rG%2.a1IN6c\"TJm", 180, (-134));
      Player player1 = new Player((-134));
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals("Player-134", player1.getName());
      assertFalse(boolean0);
      assertFalse(player1.isDead());
      assertEquals("0.0.0.0", player1.getIP());
      assertTrue(player1.isConnected());
      assertEquals(180, player0.getPictureId());
      assertEquals((-134), player0.getStrength());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((byte) (-43), " ", "", (byte) (-43), (-5419));
      Player player1 = new Player();
      player0.head = (Party) player1;
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(0, player1.getPictureId());
      assertEquals("Player-1", player0.head.toString());
      
      int int0 = player0.gangStrength();
      assertEquals((-43), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-5418), int0);
      assertEquals(" ", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-10795), "", (-10795));
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0, ".yaY?Sa'8&o\"a+Gc", ".yaY?Sa'8&o\"a+Gc", 0, 1647);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertFalse(boolean0);
      assertEquals(1647, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((byte) (-43), "state.Player", (String) null, (byte) (-43), 4);
      player0.toString();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(4, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-43), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((byte)1, "", "", (-9211));
      player0.toString();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals((-9211), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((-2318), "Player.unpack(): *** WARNING *** data is not of proper type!", 180);
      player0.setY(5);
      float float0 = player0.getY();
      assertEquals(5.0F, float0, 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((-2318), "Player.unpack(): *** WARNING *** data is not of proper type!", 180);
      player0.setY((-2224.8328F));
      float float0 = player0.getY();
      assertEquals((-2224.8328F), float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(3);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(1L);
      long long0 = player0.getTimeOfDeath();
      assertEquals(1L, long0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((short)4919, ">(pm", ">(pm", 1430, (byte)0);
      int int0 = player0.getStrength();
      assertEquals(0, int0);
      assertTrue(player0.isConnected());
      assertEquals(1430, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-1856), "C", "Q,aJyf2[", 0, (-1856));
      int int0 = player0.getStrength();
      assertTrue(player0.isConnected());
      assertEquals((-1856), int0);
      assertEquals("C", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((-1856), "C", "Q,aJyf2[", 0, (-1856));
      int int0 = player0.getPictureId();
      assertEquals(0, int0);
      assertEquals("C", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-1856), player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((byte)10, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (byte)5);
      int int0 = player0.getPictureId();
      assertEquals(5, int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((-2710), (String) null, (String) null, (byte)2, 45);
      player0.getName();
      assertEquals(45, player0.getStrength());
      assertEquals(2, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(4144, "", (-1));
      player0.getName();
      assertEquals(1, player0.getStrength());
      assertEquals((-1), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      player0.setMoney((short)4919);
      float float0 = player0.getMoney();
      assertEquals(4919.0F, float0, 0.01F);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(0, ".yaY?Sa'8&o\"a+Gc", ".yaY?Sa'8&o\"a+Gc", 0, 1647);
      player0.setMoney((-876.2487F));
      float float0 = player0.getMoney();
      assertEquals((-876.2487F), float0, 0.01F);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((byte) (-43), (String) null, "state.Party", (-10024), (-615));
      String string0 = player0.getIP();
      assertNull(string0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-10024), player0.getPictureId());
      assertEquals((-615), player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(0, "", "Player", 5, 2);
      String string0 = player0.getIP();
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(2, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(5, player0.getPictureId());
      assertEquals("", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((-2960), "az_{2\"&VL", "", (byte)0, (byte)0);
      int int0 = player0.gangStrength();
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(0, int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("az_{2\"&VL", player0.getIP());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player((-1637), "'rG%2.a1IN6c\"TJm", "'rG%2.a1IN6c\"TJm", 180, (-134));
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals((-134), player0.getStrength());
      assertEquals(180, player0.getPictureId());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player(0, "T3kt%K=", "T3kt%K=", 0);
      player0.setZ(0L);
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player(1647);
      player0.setZ((byte) (-43));
      assertEquals((-43.0F), player0.getZ(), 0.01F);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      player0.setY(0.0F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(0, "T3kt%K=", "T3kt%K=", 0);
      player0.setX(0.1F);
      assertEquals(0.1F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(0.0F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player((-1), "state.Party", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-5419), 1624);
      player0.setJoinOK(player0, true);
      assertEquals("state.Party", player0.getIP());
      assertEquals(1624, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-5419), player0.getPictureId());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      player0.setDead((long) (short)4919, false);
      assertEquals(4919L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player(0, ".yaY?Sa'8&o\"a+Gc", ".yaY?Sa'8&o\"a+Gc", 0, 1647);
      player0.setDead((-1609L), true);
      assertEquals((-1609L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player(125, "vLP:91", 125);
      assertFalse(player0.isDead());
      
      player0.setDead((long) (byte)0);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player((-5630), "", "", (-725));
      player0.setDead((-214L));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-214L), long0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
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
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player(1018, "Gp7Z,$*;4OU", 1018);
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
  //Test case number: 36
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player(5, ",]ufa?],mFQBup#^", ",]ufa?],mFQBup#^", 5, 5);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-43), (byte)1);
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
  //Test case number: 37
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player((-11007), "", 1);
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
  //Test case number: 38
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player(1, "2j%JT[9H(", "2,2&9DG[Ch", 1, (-1682));
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
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player(3);
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
  //Test case number: 40
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player((byte) (-43), (String) null, (String) null, (-11007), 213);
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
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player(960, "module.ModuleBrowserDialog$ModuleFilter", 180);
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
  //Test case number: 42
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player(0, "", "", 6196, 0);
      Party party0 = new Party();
      player0.add(party0);
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
  //Test case number: 43
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player(0, ".yaY?Sa'8&o\"a+Gc", ".yaY?Sa'8&o\"a+Gc", 0, 1647);
      byte[] byteArray0 = new byte[2];
      player0.unpack(byteArray0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(1647, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player(4144, "", (-1));
      player0.setJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertTrue(boolean0);
      assertEquals((-1), player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-1856), player0.getPictureId());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player(1647);
      assertFalse(player0.isDead());
      
      player0.setDead(0L, false);
      boolean boolean0 = player0.isDead();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      boolean boolean0 = player0.isDead();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-1856), player0.getPictureId());
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      int int0 = player0.gangStrength();
      assertEquals((-1856), player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(1, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      player0.reset(true);
      assertEquals((-1856), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player(4919, "C", (-1334));
      player0.reset(false);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-1334), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      float float0 = player0.getZ();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals((-1856), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-1856), player0.getPictureId());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      boolean boolean0 = player0.isConnected();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(boolean0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-1856), player0.getPictureId());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      player0.setConnected(true);
      assertEquals(1, player0.getStrength());
      assertEquals((-1856), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      int int0 = player0.getStrength();
      assertEquals(1, int0);
      assertEquals((-1856), player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      String string0 = player0.getIP();
      assertEquals("0.0.0.0", string0);
      assertEquals((-1856), player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player((-2318), "Player.unpack(): *** WARNING *** data is not of proper type!", 180);
      player0.getName();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(180, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player((-2318), "Player.unpack(): *** WARNING *** data is not of proper type!", 180);
      player0.toString();
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(180, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Player player0 = new Player(1, "ae#`+=-A^Jg_NoIe;^C", "<A3CS/{nHG9tIDQoZ+", 1, 1);
      float float0 = player0.getY();
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("ae#`+=-A^Jg_NoIe;^C", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Player player0 = new Player((-10795), "", (-10795));
      int int0 = player0.type();
      assertEquals((-10795), player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(5, int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Player player0 = new Player(0, "T3kt%K=", "T3kt%K=", 0);
      player0.setX((-3489.2961F));
      assertEquals((-3489.2961F), player0.getX(), 0.01F);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Player player0 = new Player((-725));
      long long0 = player0.getTimeOfDeath();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-725", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0L, long0);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Player player0 = new Player((-10795), "", (-10795));
      player0.setZ(1);
      float float0 = player0.getZ();
      assertEquals(1.0F, float0, 0.01F);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      int int0 = player0.getPictureId();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-1856), int0);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 66
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Player player0 = new Player((-1856), "C", (-1856));
      float float0 = player0.getMoney();
      assertEquals(1, player0.getStrength());
      assertEquals((-1856), player0.getPictureId());
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }
}
