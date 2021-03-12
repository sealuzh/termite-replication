/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 11 08:04:31 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(2845, "", "", 2638);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)79;
      player0.unpack(byteArray0);
      assertEquals(2638, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(197, "M\rf=>", "0.0.{.0", 197);
      Player player1 = new Player();
      player1.setJoinOK(player0, false);
      boolean boolean0 = player1.isJoinOK(player0, false);
      assertEquals("M\rf=>", player0.getIP());
      assertEquals(0, player1.getPictureId());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertTrue(player1.isConnected());
      assertFalse(player1.isDead());
      assertEquals(1, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertTrue(boolean0);
      assertEquals(197, player0.getPictureId());
      assertEquals("Player-1", player1.toString());
      assertEquals("0.0.0.0", player1.getIP());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(1245, "", "", 1245);
      Player player1 = new Player((-20731), "", "\u0006pu_-!6=", (short)4919);
      player0.head = (Party) player1;
      assertEquals("", player1.getIP());
      
      int int0 = player0.gangStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1245, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("!-/u ");
      Player player0 = new Player();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("!-/u ");
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((-912), ":$NdT9VYDT Pr^\"", (String) null, (short)4919);
      player0.toString();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(4919, player0.getPictureId());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(2845, "", "", 2638);
      player0.toString();
      assertEquals(2638, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(197, "M\r>h$", "0.0.0.0", (-912));
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(197, "M\r>h$", "0.0.0.0", (-912));
      player0.setZ((-9208));
      float float0 = player0.getZ();
      assertEquals((-9208.0F), float0, 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(197, "M\r>h$", "0.0.0.0", (-912));
      player0.setY(3817.4658F);
      float float0 = player0.getY();
      assertEquals(3817.4658F, float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((-1850), "", 0);
      player0.setY((-1850));
      float float0 = player0.getY();
      assertEquals((-1850.0F), float0, 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((-1));
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      float float0 = player0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(1245, "", "", 1245);
      player0.setX((-570.29F));
      float float0 = player0.getX();
      assertEquals((-570.29F), float0, 0.01F);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(2845, "", "", 2638);
      player0.setDead((long) 2638);
      long long0 = player0.getTimeOfDeath();
      assertEquals(2638L, long0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((-55), "CoCXL*", (-55));
      player0.setDead((long) (-55));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-55L), long0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((-55), "CoCXL*", (-55));
      int int0 = player0.getStrength();
      assertEquals((-55), player0.getPictureId());
      assertEquals(1, int0);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(185, "", "Yji)&i/,7'/A", (-621), (-621));
      int int0 = player0.getStrength();
      assertEquals((-621), player0.getPictureId());
      assertEquals((-621), int0);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("", player0.getIP());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(588);
      int int0 = player0.getPictureId();
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("Player588", player0.getName());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, int0);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player(197, "M\r>h$", "0.0.0.0", (-912));
      int int0 = player0.getPictureId();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals((-912), int0);
      assertEquals("M\r>h$", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(0, "lxA+jLS0,5I?X^", (String) null, 1513, (-19200));
      player0.getName();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals((-19200), player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1513, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((-912), "hLzG<@O'Q3?Al", "", 667);
      player0.getName();
      assertEquals(667, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("hLzG<@O'Q3?Al", player0.getIP());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(4919, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 4919, 4919);
      player0.setMoney((-1230.0F));
      float float0 = player0.getMoney();
      assertEquals((-1230.0F), float0, 0.01F);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player(163, (String) null, "l1fYFN)$:CH_MHQ5M", (-19200));
      String string0 = player0.getIP();
      assertNull(string0);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-19200), player0.getPictureId());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player(197, "M\r>h$", "0.0.0.0", (-912));
      String string0 = player0.getIP();
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals((-912), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("M\r>h$", string0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player(0, "Player.unpack(): *** WARNING *** data is not of proper type!", "Player.unpack(): *** WARNING *** data is not of proper type!", 3598, 0);
      int int0 = player0.gangStrength();
      assertEquals(0, int0);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(3598, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player(3, "module.ModuleBrowserDialog$ModuleFilter", "h'+sa+i:`%oQ8K<5C+", 560);
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
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Player player0 = new Player();
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
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(2);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-28416), 1867);
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
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(4028, "l8!iWDQ|I/rV8x\"", 2788);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        player0.pack(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player((-17147), "", 172);
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
  //Test case number: 29
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player((-17147), (String) null, (-17147));
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
      Player player0 = new Player((-1959), "", "", (-1959));
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
  //Test case number: 31
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player(197, "M\r>h$", "0.0.0.0", (-912));
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Player player0 = new Player();
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead(847L, true);
      assertEquals(847L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      Player player0 = new Player((-249), "", (-255));
      player0.pack(dataOutputStream0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals((-255), player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player(197, "v{", "x!MN4e>w55/N=aA .", 197);
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(197, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertFalse(player0.isDead());
      assertEquals("v{", player0.getIP());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player(3, "", 5);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(5, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player(2, "", "FT", 0);
      player0.setDead((-512L));
      boolean boolean0 = player0.isDead();
      assertEquals((-512L), player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player(0);
      boolean boolean0 = player0.isDead();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.getName());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player(163, (String) null, "Player.pack(): *** ERROR *** [IO] pack failed! current state is inconsistent: ", 163, (-1));
      int int0 = player0.gangStrength();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(163, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player(197, "M\rf=>", "0.0.{.0", 197);
      player0.reset(true);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("M\rf=>", player0.getIP());
      assertEquals(197, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player(4919, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 4919, 4919);
      player0.reset(false);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(4919, player0.getStrength());
      assertEquals(4919, player0.getPictureId());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player(3, "", 5);
      float float0 = player0.getZ();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(5, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isConnected();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  //Test case number: 46
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player(0, "Player.unpack(): *** WARNING *** data is not of proper type!", "Player.unpack(): *** WARNING *** data is not of proper type!", 3598, 0);
      int int0 = player0.getStrength();
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(3598, player0.getPictureId());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player((-1528), "\"P/pXD;Q", "h'+sa+i:`%oQ8K<5C+", 3);
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(3, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("\"P/pXD;Q", player0.getIP());
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player(2, "", "FT", 0);
      String string0 = player0.getIP();
      assertTrue(player0.isConnected());
      assertEquals("", string0);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player(4919, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 4919, 4919);
      player0.setMoney(4919);
      float float0 = player0.getMoney();
      assertEquals(4919.0F, float0, 0.01F);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player((-671));
      String string0 = player0.getName();
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-671", string0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player((-55), "CoCXL*", (-55));
      player0.toString();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals((-55), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player(0, "Player.unpack(): *** WARNING *** data is not of proper type!", "Player.unpack(): *** WARNING *** data is not of proper type!", 3598, 0);
      player0.pack();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(3598, player0.getPictureId());
      assertEquals(0, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player(197, "M\r>h$", "0.0.0.0", (-912));
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player((-1850), "", 0);
      float float0 = player0.getY();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player(0, "Player.unpack(): *** WARNING *** data is not of proper type!", "Player.unpack(): *** WARNING *** data is not of proper type!", 3598, 0);
      int int0 = player0.type();
      assertTrue(player0.isConnected());
      assertEquals(5, int0);
      assertEquals(3598, player0.getPictureId());
      assertEquals(0, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player(5, "Player.unpack(): *** WARNING *** data is not of proper type!", "Player.unpack(): *** WARNING *** data is not of proper type!", 5);
      long long0 = player0.getTimeOfDeath();
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(5, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player(3, "", 5);
      assertEquals(0.0F, player0.getZ(), 0.01F);
      
      player0.setZ(0.1F);
      float float0 = player0.getZ();
      assertEquals(0.1F, float0, 0.01F);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player(4919, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 4919);
      int int0 = player0.getPictureId();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(4919, int0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player(4919, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 4919, 4919);
      float float0 = player0.getMoney();
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(4919, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(4919, player0.getPictureId());
  }
}
