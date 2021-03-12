/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 11:10:45 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(1984, "OZ[Qx|56\"Sn=G:A", "63XA[t`7Uf~YlabY/n", 1024, 0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)66;
      player0.unpack(byteArray0);
      assertEquals("OZ[Qx|56\"Sn=G:A", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getStrength());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1024, player0.getPictureId());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(0, "", "XBRlt`(/7FV!Wew", 1176);
      Player player1 = new Player(5, (String) null, (String) null, 5, 1176);
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertTrue(boolean0);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(1176, player1.getStrength());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertFalse(player1.isDead());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertTrue(player1.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(1176, player0.getPictureId());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(0, "", "gui.ModuleBrowserDialog$ModuleFilter", 0);
      Player player1 = new Player((short)4919);
      player0.head = (Party) player1;
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(0, player1.getPictureId());
      assertEquals("Player4919", player0.head.toString());
      
      int int0 = player0.gangStrength();
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-453), "p=M:DDI;:9", (-453));
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals((-453), player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("qw46.!?o", "qw46.!?o");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      Player player0 = new Player((-1344), "qw46.!?o", "", (-31571), 4919);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(4919, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals((-31571), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("qw46.!?o", player0.getIP());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((-3339), (String) null, 1);
      player0.toString();
      assertEquals(1, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(1024, "r", (-672));
      player0.toString();
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-672), player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((-1568), "fNP#e^KMSYpd", 0);
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(3930, "OZ[Qx|56\"Sn=G:A", "OZ[Qx|56\"Sn=G:A", 0, 0);
      player0.setZ(3930);
      float float0 = player0.getZ();
      assertEquals(3930.0F, float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((-723), "gui.ModuleBrowserDialog$ModuleFilter", "gui.ModuleBrowserDialog$ModuleFilter", (-716));
      player0.setDead((long) 341);
      long long0 = player0.getTimeOfDeath();
      assertEquals(341L, long0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(0, ")yZu6U@{", "0q(@Xu\"3)", 0, 0);
      int int0 = player0.getStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(")yZu6U@{", player0.getIP());
      assertEquals(0, int0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((-9), "eaM0-?E63=Df0gEn", "eaM0-?E63=Df0gEn", (-9), (-2915));
      int int0 = player0.getStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-9), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals((-2915), int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(4919, "", "", 3493, 3493);
      int int0 = player0.getPictureId();
      assertEquals(3493, int0);
      assertTrue(player0.isConnected());
      assertEquals(3493, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((-1220), "=dd(35APNf;@Ep`P", (-1220));
      int int0 = player0.getPictureId();
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1220), int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(1024, "r", (-672));
      player0.getName();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-672), player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(1363, "", 1363);
      player0.getName();
      assertEquals(1363, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(4919, (String) null, "@;#R(Qct?*VMXy~)", 4919);
      player0.setMoney(1);
      float float0 = player0.getMoney();
      assertEquals(1.0F, float0, 0.01F);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player(3930, "OZ[Qx|56\"Sn=G:A", "OZ[Qx|56\"Sn=G:A", 0, 0);
      player0.getIP();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(0, player0.getStrength());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((-21248), "", "module.ModuleBrowserDialog$ModuleFilter", 10241);
      String string0 = player0.getIP();
      assertFalse(player0.isDead());
      assertEquals(10241, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(3930, "OZ[Qx|56\"Sn=G:A", "OZ[Qx|56\"Sn=G:A", 0, 0);
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, int0);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(267, ".*[.]class$", (String) null, 267, (-3024));
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(267, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-3024), int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((-1147), "V:P60_pV@'?G4Wpi:x", (-1147));
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertEquals((-1147), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ(0.0F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      player0.setY(1421.8356F);
      float float0 = player0.getY();
      assertEquals(1421.8356F, float0, 0.01F);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player(16885, "=dd(35APNf;@Ep`P", "=dd(35APNf;@Ep`P", (-1241), 16885);
      player0.setY((-1903.096F));
      float float0 = player0.getY();
      assertEquals((-1903.096F), float0, 0.01F);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player(16896, "C_Y[}UzN", "module.ModuleBrowserDialog$ModuleFilter", (-1395), 5);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player((-5254));
      player0.setX((-5254));
      float float0 = player0.getX();
      assertEquals((-5254.0F), float0, 0.01F);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(16885, "=dd(35APNf;@Ep`P", 16885);
      player0.setMoney(0.0F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(16885, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player(16915, ".*[.]class$", (-1220));
      player0.setMoney((-1462.157F));
      assertEquals((-1462.157F), player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player(1, "", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", 1, 1);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(0L, true);
      assertEquals(1, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("", player0.getIP());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player(1618, (String) null, "gui.ModuleBrowserDialog$ModuleFilter", 1335);
      player0.setDead(561L, true);
      assertEquals(561L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player((-5254));
      player0.setDead((long) (-5254), false);
      assertEquals((-5254L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player(16896, "=dd(35APNf;@Ep`P", (-1220));
      assertFalse(player0.isDead());
      
      player0.setDead((long) (byte)0);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player(3930, ".*[.]class$", ".*[.]class$", (-641));
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((long) (byte) (-1));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-1L), long0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player(3930, "OZ[Qx|56\"Sn=G:A", "OZ[Qx|56\"Sn=G:A", 0, 0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("v&9G");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      player0.pack(dataOutputStream0);
      assertEquals(0, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player(16896, ".*[.]cU#lass$", (-1220));
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
  //Test case number: 37
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player(4919, (String) null, "@;#R(Qct?*VMXy~)", 4919);
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
  //Test case number: 38
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player((-1220), "=dd(35APNf;@Ep`CP", "=dd(35APNf;@Ep`CP", 819);
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
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player(16896, ".*[.]cU#lass$", (-1220));
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
  //Test case number: 40
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player(267, ".*[.]class$", (String) null, 267, (-3024));
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player(0, "", "gui.ModuleBrowserDialog$ModuleFilter", 0);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player(1984, "OZ[Qx|56\"Sn=G:A", "63XA[t`7Uf~YlabY/n", 1024, 0);
      byte[] byteArray0 = new byte[8];
      player0.unpack(byteArray0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("OZ[Qx|56\"Sn=G:A", player0.getIP());
      assertEquals(0, player0.getStrength());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1024, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player((-1220), "=dd(35APNf;@Ep`CP", "=dd(35APNf;@Ep`CP", 819);
      player0.setJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertTrue(player0.isConnected());
      assertEquals(819, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player(1618, (String) null, "gui.ModuleBrowserDialog$ModuleFilter", 1335);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertTrue(player0.isConnected());
      assertEquals(1335, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player(1273);
      player0.setDead();
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player(3930, "OZ[Qx|56\"Sn=G:A", "OZ[Qx|56\"Sn=G:A", 0, 0);
      boolean boolean0 = player0.isDead();
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player(1273);
      player0.reset(true);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("Player1273", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player((-5254));
      player0.reset(false);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-5254", player0.toString());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player((-1220), "=dd(35APNf;@Ep`CP", (-458));
      float float0 = player0.getZ();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals((-458), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player((-5254));
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("Player-5254", player0.toString());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player((-2199), "", (-2199));
      boolean boolean0 = player0.isConnected();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals((-2199), player0.getPictureId());
      assertTrue(boolean0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player((-2199), "", (-2199));
      player0.setConnected(true);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-2199), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player(4919, (String) null, "@;#R(Qct?*VMXy~)", 4919);
      int int0 = player0.getStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(4919, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(1, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player((-1220), "=dd(35APNf;@Ep`CP", (-458));
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(60, player0.getId());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player(1618, (String) null, "gui.ModuleBrowserDialog$ModuleFilter", 1335);
      String string0 = player0.getIP();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1335, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertNull(string0);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player(267, ".*[.]class$", (String) null, 267, (-3024));
      player0.getName();
      assertEquals(267, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-3024), player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player((-2199), "", (-2199));
      player0.toString();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-2199), player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player(0, "", "XBRlt`(/7FV!Wew", 1176);
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player(1984, "OZ[Qx|56\"Sn=G:A", "63XA[t`7Uf~YlabY/n", 1024, 0);
      float float0 = player0.getY();
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1024, player0.getPictureId());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals("OZ[Qx|56\"Sn=G:A", player0.getIP());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Player player0 = new Player(3930, "OZ[Qx|56\"Sn=G:A", "OZ[Qx|56\"Sn=G:A", 0, 0);
      int int0 = player0.type();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(5, int0);
      assertEquals(0, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Player player0 = new Player(0, "", "gui.ModuleBrowserDialog$ModuleFilter", 0);
      player0.setX(1735.8926F);
      assertEquals(1735.8926F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Player player0 = new Player((-723), "gui.ModuleBrowserDialog$ModuleFilter", "gui.ModuleBrowserDialog$ModuleFilter", (-716));
      long long0 = player0.getTimeOfDeath();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, long0);
      assertEquals((-716), player0.getPictureId());
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Player player0 = new Player((-1220), "=dd(35APNf;@Ep`CP", (-458));
      player0.setZ((-1220));
      float float0 = player0.getZ();
      assertEquals((-1220.0F), float0, 0.01F);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Player player0 = new Player((-2199), "", (-2199));
      player0.setY(0.0F);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals((-2199), player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getPictureId();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
      assertEquals(1, player0.getStrength());
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 66
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Player player0 = new Player(4919, (String) null, "@;#R(Qct?*VMXy~)", 4919);
      float float0 = player0.getMoney();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(4919, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
  }
}
