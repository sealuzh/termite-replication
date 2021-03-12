/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 06:33:44 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
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
      Player player0 = new Player(29695);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)40;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(2, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(4, "Player", "/-", 4);
      player0.setJoinOK(player0, true);
      System.setCurrentTimeMillis(1392409296348L);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(4, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
      assertEquals("Player", player0.getIP());
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-3256), "", (-2498));
      Player player1 = new Player((-3256));
      player0.setJoinOK(player1, true);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertFalse(boolean0);
      assertEquals(0, player1.getPictureId());
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertTrue(player1.isConnected());
      assertEquals((-2498), player0.getPictureId());
      assertFalse(player1.isDead());
      assertEquals(1, player1.getStrength());
      assertEquals("Player-3256", player1.toString());
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0.0F, player1.getY(), 0.01F);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(4, "Player", "/-", 4);
      Player player1 = new Player((short)4919);
      player1.add(player0);
      assertEquals("Player", player0.getIP());
      assertEquals(4, player0.getPictureId());
      
      int int0 = player1.gangStrength();
      assertTrue(player1.isConnected());
      assertFalse(player1.isDead());
      assertEquals(2, int0);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(0, player1.getPictureId());
      assertEquals("Player4919", player1.toString());
      assertEquals("0.0.0.0", player1.getIP());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(2494, "szIN", 454);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(454, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(3);
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player3", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(4976, (String) null, 4976);
      player0.toString();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(4976, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(81, "", "module.ModuleBrowserDialog$ModuleFilter", 81);
      player0.toString();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(81, player0.getPictureId());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(86, "UQ=ns-", "UQ=ns-", 2641);
      player0.setZ(2641);
      float float0 = player0.getZ();
      assertEquals(2641.0F, float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(848, ".*[.]class$", "", 848, 848);
      player0.setZ((byte) (-25));
      float float0 = player0.getZ();
      assertEquals((-25.0F), float0, 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(1, "(K$?Pz>}2oM-z4;,bO", 1508);
      player0.setY(10.0F);
      float float0 = player0.getY();
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(1, "(K$?Pz>}2oM-z4;,bO", 1508);
      player0.setX((-2720.0F));
      float float0 = player0.getX();
      assertEquals((-2720.0F), float0, 0.01F);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis((-2694L));
      Player player0 = new Player();
      player0.setDead();
      long long0 = player0.getTimeOfDeath();
      assertEquals((-2694L), long0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(4919, "on\"Nujp)e;=)6c9XJ", "on\"Nujp)e;=)6c9XJ", 5, 0);
      int int0 = player0.getStrength();
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, int0);
      assertEquals(5, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getStrength();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, int0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(1, "", "", 0, (byte) (-79));
      int int0 = player0.getPictureId();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, int0);
      assertEquals((-79), player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((-18), "w*(1]84IE*Q-TCD", (-18));
      int int0 = player0.getPictureId();
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals((-18), int0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((byte) (-25), "", (String) null, (-291));
      player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals((-291), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((short)4919, "", (short)4919);
      player0.getName();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(4919, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((-851), (String) null, (String) null, 19717);
      player0.getIP();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(19717, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(4919, "", "X!oT@4;j7%1&kA|IFsD", 1);
      player0.getIP();
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getPictureId());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player(1668, "", "gui.ModuleBrowserDialog$ModuleFilter", 0, 0);
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player(1, "Vn,*O ps", "Vn,*O ps", (-503), (-503));
      int int0 = player0.gangStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals((-503), int0);
      assertEquals((-503), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((-1834), "", "", (-1834), 3670);
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
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((-1), "L'u'|D0jZb ", "$HE\"t!>hS2", 0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        player0.unpack(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player(1349, "3Qty7(MjftVyBjht", "3Qty7(MjftVyBjht", 1349);
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1590), (byte)10);
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
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(10);
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
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(4, "P|layer", "/-", 4);
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
  //Test case number: 28
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Cax>cbc^d-q>!79", true);
      Player player0 = new Player((-2485), (String) null, "", (-808));
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        player0.pack(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player(12544, (String) null, (String) null, 12544, 12544);
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
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player(258, "", "L'u'|D0jZb ", 2200);
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
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player((-503), "Vn,*O ps", 1);
      Party party0 = new Party();
      player0.boss = party0;
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
  //Test case number: 32
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player((-231), "L'u'|D0jZb ", "L'u'|D0jZb ", 376);
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((-1954), "Gtd8?wH/#", "Gtd8?wH/#", (-1954));
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(0L, true);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals((-1954), player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player((-1954), "Gtd8?wH/#", "Gtd8?wH/#", (-1954));
      player0.setDead(1392409296320L);
      long long0 = player0.getTimeOfDeath();
      assertEquals(1392409296320L, long0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("bDs8|2/~");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      Player player0 = new Player(2147340491, (String) null, "", 1479);
      player0.pack(dataOutputStream0);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1479, player0.getPictureId());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player(29695);
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(2, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player(4, "|{G(", (-7678));
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(boolean0);
      assertEquals((-7678), player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player(4, "Player", "", 4);
      player0.setJoinOK(player0, true);
      System.setCurrentTimeMillis(1392409296320L);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertEquals(4, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player", player0.getIP());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player((-1954), "Gtd8?wH/#", "Gtd8?wH/#", (-1954));
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals((-1954), player0.getPictureId());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player((-424), " ", "Y1}5>Oa@%nPW", (-2183));
      player0.setDead();
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player(4976, (String) null, 4976);
      boolean boolean0 = player0.isDead();
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(4976, player0.getPictureId());
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player-1", player0.toString());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player(15866, "module.ModuleBrowserDialog$ModuleFilter", (-4562));
      player0.reset(false);
      assertEquals((-4562), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player(5, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 5);
      float float0 = player0.getZ();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(5, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player(1, "(K$?Pz>}2oM-z4;,bO", 1508);
      float float0 = player0.getX();
      assertEquals(1508, player0.getPictureId());
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player(1, "(K$?Pz>}2oM-z4;,bO", 1508);
      boolean boolean0 = player0.isConnected();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(boolean0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1508, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player(1, "(K$?Pz>}2oM-z4;,bO", 1508);
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player((-1607), "", "", 19910, (-1607));
      int int0 = player0.getStrength();
      assertEquals((-1607), int0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(19910, player0.getPictureId());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player(1668, "", "gui.ModuleBrowserDialog$ModuleFilter", 0, 0);
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals((-124), player0.getId());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player((-669), "CjS0v@3\"hU", "B5N}jRN1\",3<Qzr", 0, 0);
      player0.getIP();
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player(1523, "", "state.Player$JoinInfo", (-3228), 4);
      player0.setMoney(1908.42F);
      float float0 = player0.getMoney();
      assertEquals(1908.42F, float0, 0.01F);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player(5, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 5);
      player0.getName();
      assertEquals(5, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player(81, "", "", 81);
      player0.toString();
      assertEquals(81, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player(1, "Vn,*O ps", "Vn,*O ps", (-503), (-503));
      float float0 = player0.getY();
      assertTrue(player0.isConnected());
      assertEquals((-503), player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-503), player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player(4976, (String) null, 4976);
      int int0 = player0.type();
      assertEquals(4976, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(5, int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player((-1954), "Gtd8?wH/#", "Gtd8?wH/#", (-1954));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-1954), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, long0);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player(1, "Vn,*O ps", "Vn,*O ps", (-503), (-503));
      player0.setY((-503));
      float float0 = player0.getY();
      assertEquals((-503.0F), float0, 0.01F);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player(1, ":<(}E+zs]Jf\"!Hje", 432);
      int int0 = player0.getPictureId();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(432, int0);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player(1523, "", "state.Player$JoinInfo", (-3228), 4);
      float float0 = player0.getMoney();
      assertEquals(4, player0.getStrength());
      assertEquals((-3228), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }
}
