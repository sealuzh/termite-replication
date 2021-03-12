/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 01:10:46 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(152);
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)78;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)4, (byte)88);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player152", player0.getName());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      player0.pack();
      assertEquals((-1003), player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("_}~hT", player0.getIP());
      assertEquals(1676, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-371), "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", (-371), 468);
      Player player1 = new Player();
      player1.setJoinOK(player0, false);
      boolean boolean0 = player1.isJoinOK(player0, true);
      assertTrue(player1.isConnected());
      assertEquals(0, player1.getPictureId());
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(468, player0.getStrength());
      assertEquals(1, player1.getStrength());
      assertEquals("Player-1", player1.getName());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals((-371), player0.getPictureId());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(510);
      PipedInputStream pipedInputStream0 = new PipedInputStream(510);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("Player510", player0.toString());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(10);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(4, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((-1089), (String) null, (-1089));
      player0.toString();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-1089), player0.getPictureId());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((-1), "|", "", (-526), (-3225));
      player0.toString();
      assertTrue(player0.isConnected());
      assertEquals("|", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-526), player0.getPictureId());
      assertEquals((-3225), player0.getStrength());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(5);
      player0.setZ(5);
      float float0 = player0.getZ();
      assertEquals(5.0F, float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(4919, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", 1160);
      player0.setY(322.938F);
      float float0 = player0.getY();
      assertEquals(322.938F, float0, 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(949, "\",0i1", (-3497));
      assertEquals(0.0F, player0.getY(), 0.01F);
      
      player0.setY((-1.0F));
      float float0 = player0.getY();
      assertEquals((-1.0F), float0, 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setX((-2122.901F));
      float float0 = player0.getX();
      assertEquals((-2122.901F), float0, 0.01F);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-1), "", (-1));
      player0.setDead();
      long long0 = player0.getTimeOfDeath();
      assertEquals(1392409281320L, long0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(5239, "a", "Player.unpack(): *** WARNING *** data is not of proper type!", 5239);
      player0.setDead((-2376L));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-2376L), long0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(0, "_}~hT", "_}~hT", 1676, 0);
      int int0 = player0.getStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, int0);
      assertEquals(1676, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(1676, "_}~hT", "_}~hT", 1676, 1676);
      int int0 = player0.getStrength();
      assertEquals(1676, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1676, int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((-4605));
      int int0 = player0.getPictureId();
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals("Player-4605", player0.toString());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player(2, "=(c-", "", (-4605), (short)4919);
      int int0 = player0.getPictureId();
      assertEquals((-4605), int0);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(4919, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("=(c-", player0.getIP());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((short)4919, (String) null, 5);
      player0.getName();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(5, player0.getPictureId());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(3928, "", 3928);
      player0.getName();
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(3928, player0.getPictureId());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(1894, (String) null, "ivy\"ag)6]!8TP8x_", 1894);
      String string0 = player0.getIP();
      assertEquals(1, player0.getStrength());
      assertNull(string0);
      assertEquals(1894, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player(14173, "", "", (-720), 14173);
      player0.getIP();
      assertEquals(14173, player0.getStrength());
      assertEquals((-720), player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player(5, "~#", " L)&]uC1:dL;b*U,'", 4919, 0);
      int int0 = player0.gangStrength();
      assertTrue(player0.isConnected());
      assertEquals("~#", player0.getIP());
      assertEquals(4919, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", (-1), (-1));
      int int0 = player0.gangStrength();
      assertTrue(player0.isConnected());
      assertEquals((-1), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-1), int0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player(0);
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("Player0", player0.getName());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((-1084));
      player0.setZ(0.0F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player-1084", player0.getName());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(0, "_}~hT", "_}~hT", 1676, 0);
      player0.setY(0);
      assertEquals(0, player0.getStrength());
      assertEquals(1676, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(5239, "a", "Player.unpack(): *** WARNING *** data is not of proper type!", 5239);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player((-1084));
      player0.setX(0.2F);
      assertEquals(0.2F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player(2, "", "", (-2151));
      player0.setMoney(0.0F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals((-2151), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(10.0F);
      float float0 = player0.getMoney();
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player(0, "OX2@g&j~R", "Ulk>RHN0", 5);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((long) 0, true);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(5, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("OX2@g&j~R", player0.getIP());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      assertFalse(player0.isDead());
      
      player0.setDead(0L, false);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((-1), "_}~hT", "_}~hT", (-1), (-1));
      player0.setDead((-2219L), false);
      assertEquals((-2219L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player((-1084));
      assertFalse(player0.isDead());
      
      player0.setDead(0L);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player(1);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((long) 1);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      player0.setConnected(true);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1676, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1003), player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals("_}~hT", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player((-1084));
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
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player((-1084));
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
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player((-27647), "Vs3dX", (-27647));
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-80), (byte)94);
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
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player((-1));
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
  //Test case number: 41
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player(5239, "a", "Player.unpack(): *** WARNING *** data is not of proper type!", 5239);
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
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player((-206));
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
  //Test case number: 43
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player(0, (String) null, 0);
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
  //Test case number: 44
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player((-1), "_}~hT", "_}~hT", (-1), (-1));
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
  //Test case number: 45
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player(622);
      Party party0 = new Party((short)4919);
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
  //Test case number: 46
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player((-1));
      player0.setJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(boolean0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(1676, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertFalse(boolean0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals((-1003), player0.getStrength());
      assertEquals("_}~hT", player0.getIP());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player((-1));
      player0.setDead(14L, false);
      boolean boolean0 = player0.isDead();
      assertEquals(14L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player((-2951));
      boolean boolean0 = player0.isDead();
      assertTrue(player0.isConnected());
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-2951", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player(949, "\",0i1", (-3497));
      int int0 = player0.gangStrength();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-3497), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player(5239, "a", "Player.unpack(): *** WARNING *** data is not of proper type!", 5239);
      player0.reset(true);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("a", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(5239, player0.getPictureId());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player((-371), "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", (-371), 468);
      float float0 = player0.getZ();
      assertEquals(468, player0.getStrength());
      assertEquals((-371), player0.getPictureId());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      float float0 = player0.getX();
      assertTrue(player0.isConnected());
      assertEquals((-1003), player0.getStrength());
      assertEquals("_}~hT", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1676, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      boolean boolean0 = player0.isConnected();
      assertEquals((-1003), player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals("_}~hT", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1676, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      int int0 = player0.getStrength();
      assertEquals((-1003), int0);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(1676, player0.getPictureId());
      assertEquals("_}~hT", player0.getIP());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player((-1084));
      byte[] byteArray0 = new byte[5];
      player0.unpack(byteArray0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1084", player0.toString());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      String string0 = player0.getIP();
      assertEquals((-1003), player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1676, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("_}~hT", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player(29701, "g^F1c+Rszq", (-1));
      player0.setMoney((-988.4466F));
      float float0 = player0.getMoney();
      assertEquals((-988.4466F), float0, 0.01F);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Player player0 = new Player(29701, "g^F1c+Rszq", (-1));
      player0.getName();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-1), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Player player0 = new Player(864, "_}~hT", "yYvu@p@", 1676, (-1003));
      player0.toString();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1676, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1003), player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals("_}~hT", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Player player0 = new Player((-2));
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Player player0 = new Player(949, "\",0i1", (-3497));
      float float0 = player0.getY();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-3497), player0.getPictureId());
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Player player0 = new Player(5, "~#", " L)&]uC1:dL;b*U,'", 4919, 0);
      int int0 = player0.type();
      assertEquals(4919, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals("~#", player0.getIP());
      assertEquals(5, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Player player0 = new Player(5239, "a", "Player.unpack(): *** WARNING *** data is not of proper type!", 5239);
      long long0 = player0.getTimeOfDeath();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("a", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, long0);
      assertTrue(player0.isConnected());
      assertEquals(5239, player0.getPictureId());
  }

  /**
  //Test case number: 66
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Player player0 = new Player((-371), "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", (-371), 468);
      player0.setZ((-371));
      float float0 = player0.getZ();
      assertEquals((-371.0F), float0, 0.01F);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Player player0 = new Player(0, "OX2@g&j~R", "Ulk>RHN0", 5);
      int int0 = player0.getPictureId();
      assertFalse(player0.isDead());
      assertEquals("OX2@g&j~R", player0.getIP());
      assertEquals(5, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 68
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Player player0 = new Player(29701, "g^F1c+Rszq", (-1));
      float float0 = player0.getMoney();
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-1), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }
}
