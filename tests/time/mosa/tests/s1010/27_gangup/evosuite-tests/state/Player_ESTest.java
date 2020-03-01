/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 21:54:05 GMT 2019
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.4221006252457893
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Player player0 = new Player((-4057), "l%H]Kx|V:sXZ", (-4057));
      Party party0 = new Party(1025);
      player0.remove(party0);
      Player player1 = new Player();
      player1.setZ((-339.0F));
      player0.setJoinOK(player1, false);
      Player player2 = new Player();
      float float0 = player1.getZ();
      assertEquals((-339.0F), float0, 0.01F);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      Player player0 = new Player(2370, "xn%6^<e6QUCRk", "3*QD@wr@2[qJ^75W`", (-251));
      player0.setMoney(1L);
      float float0 = player0.getMoney();
      assertEquals(1.0F, float0, 0.01F);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.847642989259894
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(0.0F);
      player0.reset(false);
      player0.getSubparty();
      player0.id = (-506);
      player0.pack();
      player0.setX(0.0F);
      player0.gangStrength();
      player0.getX();
      player0.type();
      player0.getMoney();
      String string0 = "Player.unpack(): *** WARNING *** data is not of proper type!";
      MockFile mockFile0 = new MockFile("Player.unpack(): *** WARNING *** data is not of proper type!");
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.9417429777213613
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(0, player1.getPictureId());
      assertEquals(1, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals("Player-1", player1.getName());
      assertFalse(player1.isDead());
      assertFalse(boolean0);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals("0.0.0.0", player1.getIP());
      assertTrue(player1.isConnected());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.8529610277865571
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.setJoinOK(player1, true);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertTrue(boolean0);
      assertEquals("0.0.0.0", player1.getIP());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertTrue(player1.isConnected());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(1, player1.getStrength());
      assertEquals("Player-1", player1.toString());
      assertEquals(0, player1.getPictureId());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = true;
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
  //Test case number: 6
  /*Coverage entropy=2.673415053526696
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(1082);
      player0.id = (-4480);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-49);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte) (-112);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      dataInputStream0.mark((byte)4);
      player0.setY((byte) (-112));
      dataInputStream0.readUnsignedShort();
      player0.unpack(dataInputStream0);
      System.setCurrentTimeMillis((short)4919);
      player0.getY();
      player0.getX();
      Player player1 = new Player(1, "u", "]qyX')", (byte) (-112), 52996);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals((-112.0F), player0.getY(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.3630015417836807
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Player player0 = new Player(5, "-d=h\"_:{fVn{5=GXIU", "-d=h\"_:{fVn{5=GXIU", 2683, 1024);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Player player1 = new Player(266, (String) null, "-d=h\"_:{fVn{5=GXIU", 2683);
      player1.pack();
      player0.setJoinOK(player1, true);
      player0.setDead();
      player0.setDead((-1L));
      player0.getY();
      player0.setZ(2683);
      player0.type();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      player0.getX();
      player0.pack();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      player1.pack(dataOutputStream0);
      System.setCurrentTimeMillis(318L);
      player0.getIP();
      player0.getIP();
      player1.gangStrength();
      player1.getZ();
      player0.getIP();
      assertEquals((-1L), player0.getTimeOfDeath());
      
      player1.getIP();
      assertEquals(2683, player1.getPictureId());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.7808459625592628
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player(2561, (String) null, (String) null, (-586), 84);
      player0.setDead();
      player1.isJoinOK(player0, false);
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      
      player1.getName();
      assertTrue(player1.isConnected());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney((-5822.31F));
      float float0 = player0.getMoney();
      assertEquals((-5822.31F), float0, 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.244203930364352
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.getName();
      player0.setDead();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      player0.gangStrength();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Player-1");
      player0.setDead((long) 1);
      player0.pack();
      player0.setConnected(false);
      player0.getZ();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "s");
      player0.gangStrength();
      player0.setDead((long) 1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      player0.gangStrength();
      player0.getTimeOfDeath();
      player0.gangStrength();
      player0.gangStrength();
      player0.gangStrength();
      System.setCurrentTimeMillis(15000L);
      player0.getMoney();
      player0.type();
      player0.getZ();
      player0.pack();
      player0.type();
      player0.getX();
      player0.getMoney();
      player0.getY();
      player0.getName();
      player0.getTimeOfDeath();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(1L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.881766240540306
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((-3421), "", (String) null, 513);
      player0.getZ();
      player0.toString();
      player0.getIP();
      int int0 = (-1061);
      Player player1 = new Player(513, "", (-1061));
      float float0 = 0.0F;
      player1.setY(0.0F);
      player1.reset(false);
      player0.setDead(0L);
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player0, false);
      player1.getZ();
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.038009341005529
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = true;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      Player player0 = new Player();
      String string0 = "Player.unpack(): *** WARNING *** data is not of proper type!";
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
  //Test case number: 13
  /*Coverage entropy=2.022248870579868
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player();
      Party party0 = new Party();
      player0.gangStrength();
      player0.add(party0);
      player0.pack();
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
  //Test case number: 14
  /*Coverage entropy=3.262384640607128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      System.setCurrentTimeMillis((-442L));
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Player player0 = new Player(1317, ".*[.]class$", 1787);
      Party party0 = new Party();
      party0.getSubparty();
      player0.remove(party0);
      player0.setMoney(927.001F);
      player0.setConnected(false);
      player0.setDead((-1231L));
      player0.setMoney(1.0F);
      player0.setDead((-1710L), false);
      player0.setDead();
      player0.getY();
      player0.getIP();
      player0.getX();
      player0.toString();
      player0.getIP();
      player0.type();
      player0.getX();
      player0.pack();
      player0.toString();
      player0.getName();
      player0.getY();
      long long0 = player0.getTimeOfDeath();
      assertEquals(1.0F, player0.getMoney(), 0.01F);
      assertEquals((-442L), long0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  //Test case number: 16
  /*Coverage entropy=2.0831221229604164
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((-24), "R.", "R.", (-24));
      Player player1 = new Player((-24), "R.", "R.", (-24), 3);
      player0.isJoinOK(player1, false);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)58;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-24), (short)4919);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        player1.unpack(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      player0.getIP();
      assertEquals(0.0F, player0.getY(), 0.01F);
      
      player0.setY(0.2F);
      player0.getIP();
      float float0 = player0.getY();
      assertEquals(0.2F, float0, 0.01F);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((-1769), "NRMf3#p\t", (-273));
      Player player1 = new Player();
      assertTrue(player1.isConnected());
      
      player1.setConnected(false);
      boolean boolean0 = player1.isConnected();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.3798389570661653
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ(0.0F);
      Player player1 = new Player(0, "V#'", "", 5);
      assertEquals(0.0F, player1.getZ(), 0.01F);
      
      player1.setZ(0.2F);
      player0.gangStrength();
      float float0 = player1.getZ();
      assertEquals(0.2F, float0, 0.01F);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(9472, "", "", 611, (-534));
      Party party0 = player0.head;
      player0.add((Party) null);
      player0.getName();
      player0.toString();
      assertEquals(611, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals((-534), player0.getStrength());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((-1601), "", "", 458, (-1601));
      player0.getIP();
      float float0 = player0.getY();
      assertTrue(player0.isConnected());
      assertEquals((-1601), player0.getStrength());
      assertEquals(458, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.5531257522061517
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player(9697, "k!", "k!", 4919, 4919);
      player0.setDead();
      player0.isDead();
      boolean boolean0 = player0.isConnected();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      player0.pack(dataOutputStream0);
      assertEquals(29, pipedInputStream0.available());
      
      player0.pack();
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.673415053526696
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player();
      player0.remove((Party) null);
      player0.boss = (Party) player0;
      Player player1 = new Player(0, "", "", (short)4919, (-1051));
      player1.pack();
      player1.getStrength();
      player0.getIP();
      float float0 = Player.MOVE_DISTANCE;
      assertEquals(0.1F, float0, 0.01F);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.267949945418531
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player(1, ">s}cd4(Nq>79Dj", (String) null, 1857, 1);
      Player player1 = new Player(1857, "", 1);
      Party party0 = player1.boss;
      player1.getSubparty();
      Player player2 = new Player(0, "state.Player$JoinInfo", 746);
      player2.reset(true);
      player2.getPictureId();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player((-925), ":pr~ cTLD", ":pr~ cTLD", (-1011), (-1938));
      player0.setX((-925));
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)45;
      player0.getSubparty();
      byteArray0[1] = (byte) (-67);
      player0.unpack(byteArray0);
      float float0 = player0.getX();
      assertEquals((-925.0F), float0, 0.01F);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(0, "N.", (-889));
      Party party0 = player0.boss;
      player0.getSubparty();
      player0.reset(false);
      player0.getPictureId();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-218));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.8148657896913192
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  //Test case number: 29
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isConnected();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player((short)4919, (String) null, (String) null, 1462, 1462);
      // Undeclared exception!
      try { 
        player1.pack();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player();
      player0.getZ();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(1, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.6376398674083723
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player(4, "k!", "", 0, 0);
      player0.pack();
      boolean boolean0 = player0.isDead();
      assertFalse(boolean0);
      
      int int0 = player0.getStrength();
      assertEquals(0, int0);
      
      int int1 = player0.gangStrength();
      assertEquals(0, player0.getPictureId());
      assertEquals("k!", player0.getIP());
      assertEquals(0, int1);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.209406559005219
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((-1769), "NRMW3#pvt", "NRMW3#pvt", (-1769), (-1769));
      player0.setZ((-1769));
      int int0 = player0.gangStrength();
      assertEquals((-1769.0F), player0.getZ(), 0.01F);
      assertEquals((-1769), int0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      
      Player player1 = new Player((short)4919, ", BqZ=H} {|g", "M@H'H3HW", (short)4919);
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(", BqZ=H} {|g", player1.getIP());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
      assertEquals(1, player1.getStrength());
      assertTrue(player1.isConnected());
      assertEquals(4919, player1.getPictureId());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.5500297769739535
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player(2372, "QoHt*@&YkUY", "v/r`)xgJ_", 2372);
      player0.setDead();
      player0.getMoney();
      int int0 = player0.getStrength();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.2700203387932723
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player((-990), (String) null, (String) null, 0, 4919);
      Player player1 = new Player(4919, "", 0);
      Party party0 = player1.boss;
      player1.getSubparty();
      player0.boss = null;
      player0.reset(true);
      player0.getPictureId();
      player1.setZ(0.0F);
      player0.setZ((-1878.906F));
      int int0 = player0.gangStrength();
      assertEquals((-1878.906F), player0.getZ(), 0.01F);
      assertEquals(4919, int0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(0.0F);
      float float0 = player0.getX();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player(1280, "state.Party", "state.Party", (-1));
      player0.toString();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals((-1), player0.getPictureId());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)86;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[1] = (byte)0;
      player0.unpack(byteArray0);
      player0.pack();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.856882596414008
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      player0.gangStrength();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player((byte)5, (String) null, 5);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)5;
      player0.unpack(byteArray0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(5, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  //Test case number: 44
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)10;
      player0.unpack(byteArray0);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  //Test case number: 46
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Player player0 = new Player();
      assertFalse(player0.isDead());
      
      player0.setDead(0L, false);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertTrue(player0.isDead());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      player0.pack();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Player player0 = new Player(1024);
      long long0 = player0.getTimeOfDeath();
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player1024", player0.toString());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, long0);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player((short)4919);
      assertEquals("Player4919", player1.toString());
      assertEquals(0, player1.getPictureId());
      assertEquals("0.0.0.0", player1.getIP());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(1, player1.getStrength());
      assertTrue(player1.isConnected());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Player player0 = new Player();
      player0.setY((-2065.0F));
      int int0 = player0.type();
      assertEquals((-2065.0F), player0.getY(), 0.01F);
      assertEquals(5, int0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
  }
}
