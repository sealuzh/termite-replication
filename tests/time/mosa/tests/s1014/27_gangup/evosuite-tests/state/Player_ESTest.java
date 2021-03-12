/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 27 21:46:52 GMT 2020
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)55;
      player0.unpack(byteArray0);
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(0);
      Player player1 = new Player((short)4919, "", "", 295, (short)4919);
      player1.setJoinOK(player0, true);
      boolean boolean0 = player1.isJoinOK(player0, false);
      assertTrue(player1.isConnected());
      assertFalse(boolean0);
      assertEquals("Player0", player0.getName());
      assertEquals(295, player1.getPictureId());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(4919, player1.getStrength());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      PipedInputStream pipedInputStream0 = new PipedInputStream((short)4919);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-1), "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-1), (-1));
      player0.toString();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-1), player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((-8060), "", "", 10, (-8060));
      player0.toString();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-8060), player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(5, "i(PWRM);m", 5);
      assertEquals(0.0F, player0.getY(), 0.01F);
      
      player0.setY(0.1F);
      float float0 = player0.getY();
      assertEquals(0.1F, float0, 0.01F);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      player0.setY((-1000.0023F));
      float float0 = player0.getY();
      assertEquals((-1000.0023F), float0, 0.01F);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(10, "i(PWRM);m", 10);
      player0.setDead((long) 10, false);
      long long0 = player0.getTimeOfDeath();
      assertEquals(10L, long0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(806, "Ft1bl>-VWY@W1FK2", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", 0, 0);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((-1L));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-1L), long0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((-11054), "Xv+3h4f}n6a}4", "", (-1), 0);
      int int0 = player0.getStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, int0);
      assertEquals("Xv+3h4f}n6a}4", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals((-1), player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((-1), "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (String) null, (-1), (-1));
      int int0 = player0.getStrength();
      assertFalse(player0.isDead());
      assertEquals((-1), int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((-489));
      int int0 = player0.getPictureId();
      assertEquals(0, int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-489", player0.toString());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-103), "b@ubfSuX", (-103));
      int int0 = player0.getPictureId();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-103), int0);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(0, ";4%l=t^", (String) null, 0);
      player0.getName();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(0, ";4%l`t^", ";4%l`t^", 0);
      player0.getName();
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((-15926), (String) null, "TBdD\"U_w[2z", (-15926), (-15926));
      String string0 = player0.getIP();
      assertEquals((-15926), player0.getStrength());
      assertEquals((-15926), player0.getPictureId());
      assertNull(string0);
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((-21016), "", ".*[.]class$", (short)4919, 220);
      String string0 = player0.getIP();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(220, player0.getStrength());
      assertEquals(4919, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("", string0);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((short)4919, (String) null, "(IElKhg._qs_*oC", 2, 0);
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(2, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((short)4919, "", "", 1, (-964));
      int int0 = player0.gangStrength();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals((-964), int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ(0.0F);
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals("Player-1", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(0.0F, player0.getZ(), 0.01F);
      
      player0.setZ(0.1F);
      float float0 = player0.getZ();
      assertEquals(0.1F, float0, 0.01F);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player(806, "Ft1bl>-VWY@W1FK2", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", 0, 0);
      player0.setY(0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(0, player0.getStrength());
      assertEquals("Ft1bl>-VWY@W1FK2", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player(5, "i(PWRM);m", 5);
      player0.setX(0.2F);
      assertEquals(0.2F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX((-1.0F));
      float float0 = player0.getX();
      assertEquals((-1.0F), float0, 0.01F);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(0.0F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player((-5343), "R", "", 2294, (-5343));
      player0.setMoney(1.0F);
      float float0 = player0.getMoney();
      assertEquals(1.0F, float0, 0.01F);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player();
      assertFalse(player0.isDead());
      
      player0.setDead(0L, false);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(1L, true);
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead((long) (-734), true);
      assertEquals((-734L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player((-5343), "R", "", 2294, (-5343));
      player0.setDead((long) 2294);
      assertEquals(2294L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player();
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  //Test case number: 34
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player((-695), "aDt{Wr$", "gui.ModuleBrowserDialog$ModuleFilter", 1, (-28416));
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-28416), (short)4919);
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
  //Test case number: 35
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  //Test case number: 37
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player(4538, "!mV]f}", "!mV]f}", 4538, 4538);
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
  //Test case number: 38
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player(1, (String) null, 1);
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
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player();
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
  //Test case number: 41
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[2];
      player0.unpack(byteArray0);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player(5, "i(PWRM);m", 5);
      player0.setJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertTrue(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(5, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player((-15926), (String) null, "TBdD\"U_w[2z", (-15926), (-15926));
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-15926), player0.getPictureId());
      assertEquals((-15926), player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player(2, "eyY!fS(AZ~O+,G/pmP$", 2);
      assertFalse(player0.isDead());
      
      player0.setDead(0L);
      boolean boolean0 = player0.isDead();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.gangStrength();
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
  //Test case number: 47
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player-1", player0.getName());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player((-15926), (String) null, "TBdD\"U_w[2z", (-15926), (-15926));
      player0.reset(false);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-15926), player0.getStrength());
      assertEquals((-15926), player0.getPictureId());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player(0);
      float float0 = player0.getZ();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player(0);
      float float0 = player0.getX();
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.toString());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player(2, "eyY!fS(AZ~O+,G/pmP$", 2);
      boolean boolean0 = player0.isConnected();
      assertTrue(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(2, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player(10, "i(PWRM);m", 10);
      player0.setConnected(true);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getStrength();
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player-1", player0.getName());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-1), player0.getId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player((-1842), "0.0.0.0", "0.0.0.0", (-1842));
      player0.getIP();
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-1842), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player(10, "i(PWRM);m", 10);
      player0.setMoney((-1.5928067F));
      float float0 = player0.getMoney();
      assertEquals((-1.5928067F), float0, 0.01F);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player((-5343), "R", "", 2294, (-5343));
      player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(2294, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-5343), player0.getStrength());
      assertEquals("R", player0.getIP());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player((-1), "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (String) null, (-1), (-1));
      player0.toString();
      assertEquals((-1), player0.getPictureId());
      assertEquals((-1), player0.getStrength());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player((-1842), "0.0.0.0", "0.0.0.0", (-1842));
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Player player0 = new Player((-15926), (String) null, "TBdD\"U_w[2z", (-15926), (-15926));
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Player player0 = new Player(10, "i(PWRM);m", 10);
      float float0 = player0.getY();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Player player0 = new Player((-1842), "0.0.0.0", "0.0.0.0", (-1842));
      int int0 = player0.type();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(5, int0);
      assertEquals((-1842), player0.getPictureId());
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Player player0 = new Player(0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, long0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player-1", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setZ((-1012.68976F));
      float float0 = player0.getZ();
      assertEquals((-1012.68976F), float0, 0.01F);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Player player0 = new Player(2841, "6'~", 1);
      int int0 = player0.getPictureId();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, int0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 67
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Player player0 = new Player(10, "i(PWRM);m", 10);
      float float0 = player0.getMoney();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }
}
