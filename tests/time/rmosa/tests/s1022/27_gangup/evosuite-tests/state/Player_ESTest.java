/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 07:41:35 GMT 2020
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)87;
      player0.unpack(byteArray0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(1981, "d?oL*nMOp'-nfwEjd", "d?oL*nMOp'-nfwEjd", (-1), 0);
      player0.pack();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getStrength());
      assertEquals((-1), player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-7));
      Player player1 = new Player((-7));
      player0.setJoinOK(player1, true);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertTrue(boolean0);
      assertEquals(1, player1.getStrength());
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals("Player-7", player1.getName());
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(0, player1.getPictureId());
      assertTrue(player1.isConnected());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(4);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, player0.getPictureId());
      assertFalse(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals("Player4", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(863, "", 863);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 4919);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(471, (String) null, (String) null, 471, 22273);
      player0.toString();
      assertFalse(player0.isDead());
      assertEquals(22273, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(471, player0.getPictureId());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((-3753), "state.Player$JoinInfo", (-3753));
      player0.toString();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals((-3753), player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ((-993.18F));
      float float0 = player0.getZ();
      assertEquals((-993.18F), float0, 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((-21));
      player0.setX((-21));
      float float0 = player0.getX();
      assertEquals((-21.0F), float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(4919, "", "", 4919, 4919);
      player0.setDead((long) (short)4919);
      long long0 = player0.getTimeOfDeath();
      assertEquals(4919L, long0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(1981, "d?oL*nMOp'-nfwEjd", "d?oL*nMOp'-nfwEjd", (-1), 0);
      int int0 = player0.getStrength();
      assertEquals((-1), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((-1027), "", "", 3522, (-1027));
      int int0 = player0.getStrength();
      assertEquals(3522, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals((-1027), int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-1681));
      int int0 = player0.getPictureId();
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals("Player-1681", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, int0);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((short)4919, "Player", 149);
      int int0 = player0.getPictureId();
      assertEquals(149, int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(0, (String) null, (String) null, 0);
      player0.getName();
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(1, ".*[.]class$", "state.Player$JoinInfo", 0, 947);
      player0.getName();
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(".*[.]class$", player0.getIP());
      assertEquals(947, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney((-1.0F));
      float float0 = player0.getMoney();
      assertEquals((-1.0F), float0, 0.01F);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player(0, (String) null, (String) null, 0);
      player0.getIP();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(4919, "", "", 4919, 4919);
      player0.getIP();
      assertEquals(4919, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(4919, player0.getStrength());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(0, "^JVEr04E7", "module.ModuleBrowserDialog$ModuleFilter", 0, 0);
      int int0 = player0.gangStrength();
      assertEquals("^JVEr04E7", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
      assertEquals(0, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((-18), "", "", (-18), (-18));
      int int0 = player0.gangStrength();
      assertTrue(player0.isConnected());
      assertEquals((-18), int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-18), player0.getPictureId());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((-36));
      player0.setY(0.0F);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-36", player0.toString());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player(1002, "", 1002);
      player0.setY(1067L);
      float float0 = player0.getY();
      assertEquals(1067.0F, float0, 0.01F);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((-145), "yQ{tKA#'|6Ko\"Q", (-145));
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      assertEquals((-145), player0.getPictureId());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(8);
      player0.setX(8);
      assertEquals(8.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player((-3753), "state.Player$JoinInfo", (-3753));
      player0.setMoney((short)4919);
      float float0 = player0.getMoney();
      assertEquals(4919.0F, float0, 0.01F);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player(1002, "", 1002);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(0L, true);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1002, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player(489, "", "", (-2643));
      player0.setDead((long) (-1080), true);
      long long0 = player0.getTimeOfDeath();
      assertEquals((-1080L), long0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player();
      assertFalse(player0.isDead());
      
      player0.setDead(0L);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player(4919, "", "", 4919, 4919);
      player0.setDead((-563L));
      assertEquals((-563L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player();
      player0.setConnected(true);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player(670);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player(1116);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player((-1660));
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-44), (byte)31);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player((-7));
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player(0);
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
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  //Test case number: 40
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player(1116, (String) null, 1116);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player(8);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player((-12639), "", 22273);
      player0.add(player0);
      // Undeclared exception!
      player0.gangStrength();
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Player player0 = new Player(3, "", 3);
      Party party0 = new Party((-1681));
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
  //Test case number: 44
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player((-7));
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals("Player-7", player0.toString());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Player player0 = new Player(1002, "", 1002);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertFalse(player0.isDead());
      assertEquals(1002, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player((-145), "yQ{tKA#'|6Ko\"Q", (-145));
      player0.setDead(1613L, false);
      boolean boolean0 = player0.isDead();
      assertEquals(1613L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertFalse(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.gangStrength();
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player-1", player0.toString());
      assertEquals(1, int0);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player((-7));
      player0.reset(false);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals("Player-7", player0.getName());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getZ();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.toString());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.getName());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isConnected();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Player player0 = new Player();
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Player player0 = new Player(1258, "`DH?#uq", (-3670));
      int int0 = player0.getStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, int0);
      assertEquals((-3670), player0.getPictureId());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Player player0 = new Player(1116);
      String string0 = player0.getIP();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("0.0.0.0", string0);
      assertEquals("Player1116", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Player player0 = new Player((-145), "yQ{tKA#'|6Ko\"Q", (-145));
      player0.setMoney(0.0F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals((-145), player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Player player0 = new Player((-12639), "", 22273);
      player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(22273, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Player player0 = new Player((-12639), "", 22273);
      player0.toString();
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(22273, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getY();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.toString());
      assertEquals(0.0F, float0, 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Player player0 = new Player(1002, "", 1002);
      int int0 = player0.type();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1002, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(5, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Player player0 = new Player(489, "", "", (-2643));
      long long0 = player0.getTimeOfDeath();
      assertEquals((-2643), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ((short)4919);
      float float0 = player0.getZ();
      assertEquals(4919.0F, float0, 0.01F);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Player player0 = new Player();
      player0.setY((-2211.3F));
      float float0 = player0.getY();
      assertEquals((-2211.3F), float0, 0.01F);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Player player0 = new Player(1258, "`DH?#uq", (-3670));
      int int0 = player0.getPictureId();
      assertTrue(player0.isConnected());
      assertEquals((-3670), int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 68
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Player player0 = new Player(489, "", "", (-2643));
      float float0 = player0.getMoney();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals((-2643), player0.getPictureId());
      assertEquals(0.0F, float0, 0.01F);
  }
}
