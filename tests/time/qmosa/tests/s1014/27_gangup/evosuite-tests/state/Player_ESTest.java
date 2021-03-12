/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 02:03:23 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      Player player0 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", "<wN[6", 1, 1);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)29;
      player0.unpack(byteArray0);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("module.ModuleBrowserDialog$ModuleFilter", player0.getIP());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", "<wN[6", 1, 1);
      Player player1 = new Player((-25852), "", "", (short)4919, 1373);
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertFalse(boolean0);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals("module.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertFalse(player1.isDead());
      assertEquals(1373, player1.getStrength());
      assertEquals(4919, player1.getPictureId());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", "YKo2|zlN", 1708, (-25852));
      Player player1 = new Player();
      player0.head = (Party) player1;
      assertEquals(0, player1.getPictureId());
      assertEquals("Player-1", player0.head.toString());
      assertEquals("0.0.0.0", player1.getIP());
      
      int int0 = player0.gangStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1708, player0.getPictureId());
      assertEquals((-25851), int0);
      assertEquals("module.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(0, "ko9z>+", 0);
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
      Player player0 = new Player((-13459), (String) null, (String) null, 713, (-312));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(713, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals((-312), player0.getStrength());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((-1064), (String) null, (String) null, (-234));
      player0.toString();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals((-234), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(773, "", "", 3896);
      player0.toString();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(3896, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
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
      Player player0 = new Player((-1341), "#Ga&^6hk>|", "#Ga&^6hk>|", (-1341), (-1341));
      player0.setX((-1341));
      float float0 = player0.getX();
      assertEquals((-1341.0F), float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(2, "eyY!fS(AZ~O+,G/pmP$", 2);
      player0.setDead((long) 2);
      long long0 = player0.getTimeOfDeath();
      assertEquals(2L, long0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(2356, "", "", 2356, (-554));
      player0.setDead((long) (-554), true);
      long long0 = player0.getTimeOfDeath();
      assertEquals((-554L), long0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getStrength();
      assertEquals(1, int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(2356, "", "", 2356, (-554));
      int int0 = player0.getStrength();
      assertEquals(2356, player0.getPictureId());
      assertEquals((-554), int0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(335, "", 335);
      int int0 = player0.getPictureId();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(335, int0);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((-103), "b@ubfSuX", (-103));
      int int0 = player0.getPictureId();
      assertEquals((-103), int0);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
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
      Player player0 = new Player(0, "{%Bv{-]*r", (String) null, (-842), (-636));
      player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-636), player0.getStrength());
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals((-842), player0.getPictureId());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((-5343), "R", "", 2294, (-5343));
      player0.getName();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(2294, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("R", player0.getIP());
      assertEquals((-5343), player0.getStrength());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((-5343), "R", "", 2294, (-5343));
      player0.setMoney(1.0F);
      float float0 = player0.getMoney();
      assertEquals(1.0F, float0, 0.01F);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((-946), "", 10);
      player0.setMoney((-946));
      float float0 = player0.getMoney();
      assertEquals((-946.0F), float0, 0.01F);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(0);
      String string0 = player0.getIP();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", string0);
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((-25852), "", "", (short)4919, 1373);
      player0.getIP();
      assertEquals(4919, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(1373, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player(0, "{%Bv{-]*r", "{%Bv{-]*r", 0, 0);
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player((-312), (String) null, (-312));
      int int0 = player0.gangStrength();
      assertEquals(1, int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals((-312), player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player(0, "{%Bv{-]*r", "{%Bv{-]*r", 0, 0);
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player(0, "d%i$gu", "0.0.0.0", 0);
      player0.setZ(0);
      assertEquals("d%i$gu", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player(4061, "gui.ModuleBrowserDialog$ModuleFilter", "", 0, 1);
      player0.setZ(1);
      float float0 = player0.getZ();
      assertEquals(1.0F, float0, 0.01F);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(5, "7V}d", "7V}d", 5);
      player0.setY(0.0F);
      assertEquals(5, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player((-1101), "<TT[6", "<TT[6", (-1300), (-1101));
      player0.setY((-1101));
      float float0 = player0.getY();
      assertEquals((-1101.0F), float0, 0.01F);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player();
      player0.setX(9.013347F);
      assertEquals(9.013347F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(0.0F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player(0);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((long) 0, true);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player0", player0.getName());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", "<wN[6", 1, 1);
      player0.setDead((long) (short)4919, false);
      assertEquals(4919L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player(4061, "gui.ModuleBrowserDialog$ModuleFilter", "", 0, 1);
      assertFalse(player0.isDead());
      
      player0.setDead((long) 0);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((-5343), "R", "", 2294, (-5343));
      player0.setDead((-1702L));
      assertEquals((-1702L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player(0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player(2143);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player(0);
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 1254);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player((-234), "", (String) null, 1626, 4919);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player((-946), "", 10);
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
      Player player0 = new Player(0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player(0);
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
  //Test case number: 41
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", "<wN[6", 1, 1);
      byte[] byteArray0 = new byte[4];
      player0.unpack(byteArray0);
      assertEquals(1, player0.getStrength());
      assertEquals(1, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("module.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", "YKo2|zlN", 1708, (-25852));
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(1708, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(boolean0);
      assertFalse(player0.isDead());
      assertEquals((-25852), player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("module.ModuleBrowserDialog$ModuleFilter", player0.getIP());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player((-13459), (String) null, (String) null, 713, (-312));
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertTrue(player0.isConnected());
      assertEquals((-312), player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(713, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player(5, "7V}d", "7V}d", 5);
      player0.setDead((long) 5);
      boolean boolean0 = player0.isDead();
      assertEquals(5L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player(200, "HsLSQtr7:cfX", "HsLSQtr7:cfX", 2);
      boolean boolean0 = player0.isDead();
      assertEquals(2, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player((-1114), (String) null, "<TT[6", (-1114), (-1114));
      player0.reset(true);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-1114), player0.getPictureId());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-1114), player0.getStrength());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player(0);
      player0.reset(false);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player(4061, "gui.ModuleBrowserDialog$ModuleFilter", "", 0, 1);
      float float0 = player0.getZ();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("gui.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player(0);
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player0", player0.getName());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player(4061, "gui.ModuleBrowserDialog$ModuleFilter", "", 0, 1);
      boolean boolean0 = player0.isConnected();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("gui.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player(2356, "", "", 2356, (-554));
      player0.setConnected(true);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-554), player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals(2356, player0.getPictureId());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player(0, "{%Bv{-]*r", "{%Bv{-]*r", 0, 0);
      int int0 = player0.getStrength();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player((-13459), (String) null, (String) null, 713, (-312));
      Player player1 = new Player();
      byte[] byteArray0 = player1.pack();
      player0.unpack(byteArray0);
      assertEquals((-1), player0.getId());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player((-1114), (String) null, "<TT[6", (-1114), (-1114));
      String string0 = player0.getIP();
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals((-1114), player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertNull(string0);
      assertEquals((-1114), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player((-1101), "<TT[6", "<TT[6", (-1300), (-1101));
      player0.getName();
      assertEquals((-1300), player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-1101), player0.getStrength());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player((-1101), "<TT[6", "<TT[6", (-1300), (-1101));
      player0.toString();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1300), player0.getPictureId());
      assertEquals((-1101), player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player((-13459), (String) null, (String) null, 713, (-312));
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
  //Test case number: 58
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player(4061, "gui.ModuleBrowserDialog$ModuleFilter", "", 0, 1);
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player((-13459), (String) null, (String) null, 713, (-312));
      float float0 = player0.getY();
      assertEquals((-312), player0.getStrength());
      assertEquals(713, player0.getPictureId());
      assertEquals(0.0F, float0, 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Player player0 = new Player(335, "", 335);
      int int0 = player0.type();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(335, player0.getPictureId());
      assertEquals(5, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Player player0 = new Player(0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Player player0 = new Player(4061, "gui.ModuleBrowserDialog$ModuleFilter", "", 0, 1);
      long long0 = player0.getTimeOfDeath();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("gui.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setZ((-1012.68976F));
      float float0 = player0.getZ();
      assertEquals((-1012.68976F), float0, 0.01F);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Player player0 = new Player(2143);
      player0.setY(15.2F);
      float float0 = player0.getY();
      assertEquals(15.2F, float0, 0.01F);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Player player0 = new Player(4061, "gui.ModuleBrowserDialog$ModuleFilter", "", 0, 1);
      int int0 = player0.getPictureId();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("gui.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Player player0 = new Player(2143);
      float float0 = player0.getMoney();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player2143", player0.getName());
  }
}
