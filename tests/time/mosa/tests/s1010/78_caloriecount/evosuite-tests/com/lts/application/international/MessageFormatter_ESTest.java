/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 22:17:29 GMT 2019
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.138526235860879
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Object object0 = new Object();
      messageFormatter0.getMessage("resources.messages.standard", (Object) propertyResourceBundle0, (Object) messageFormatter0, (Object) stringReader0);
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("resources.messages.standard");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.085628388624577
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      List list0 = messageFormatter0.listResources("CcMLoymY|;XzvYr&C>5", classLoader0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      messageFormatter0.getLastException();
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("<undefined>", (Throwable) null);
      linkedList0.retainAll(list0);
      linkedList0.add((Object) messageFormatter_LoadBundleError0);
      messageFormatter0.createLoadException(linkedList0);
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      ApplicationException applicationException0 = messageFormatter0.createLoadException(list0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
      
      messageFormatter0.temp();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      List list1 = MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      assertFalse(list1.isEmpty());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "E]|.]$f4tsp";
      StringReader stringReader0 = new StringReader("E]|.]$f4tsp");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("E]|.]$f4tsp");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Object object0 = new Object();
      messageFormatter0.getMessage("E]|.]$f4tsp", (Object) propertyResourceBundle0, (Object) null);
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("E]|.]$f4tsp");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Object object0 = new Object();
      messageFormatter0.getMessage("resources.messages.standard");
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("resources.messages.standard");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1944064129383247
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.loadCriticalBundles();
      messageFormatter0.addBundle((ResourceBundle) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object) messageFormatter0, object0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      Object object0 = new Object();
      String string0 = "Xx:(?k{<%a6/";
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "XkGt";
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("XkGt", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      ApplicationException applicationException0 = new ApplicationException("critical.question.quit.title", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) applicationException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object) "resources.messages.standard", object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "resources.messages.standard");
      messageFormatter0.addBundle((ResourceBundle) null);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((String) null, (Object) null, (Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      messageFormatter0.addBundle((ResourceBundle) null);
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("resources.messages.standard", messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      Locale locale0 = Locale.ENGLISH;
      linkedList0.add(locale0);
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List) linkedList0, (List) linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Locale cannot be cast to java.lang.String
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      ApplicationException applicationException1 = new ApplicationException("", applicationException0, "resources.messages.standard");
      messageFormatter0.myLastException = (Throwable) applicationException1;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      messageFormatter0.getLastException();
      messageFormatter0.temp();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)6;
      byteArray0[3] = (byte)6;
      byteArray0[0] = (byte)48;
      byteArray0[5] = (byte) (-117);
      byteArray0[6] = (byte) (-118);
      byteArray0[7] = (byte) (-27);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ResourceBundle resourceBundle0 = null;
      Object[] objectArray0 = null;
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("critcal.error.unknown", (Object[]) null, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[0];
      StringReader stringReader0 = new StringReader("$IPSJ_8FI%YY");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      String string0 = messageFormatter0.formatMessage("$IPSJ_8FI%YY", objectArray0, (ResourceBundle) propertyResourceBundle0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      String string0 = messageFormatter0.formatMessage("I3v~p", (Object[]) null, (ResourceBundle) propertyResourceBundle0);
      assertNull(string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List) null, (List) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MessageFormatter messageFormatter1 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter1.formatMessage("", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      List list0 = MessageFormatter.buildList(objectArray0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.getLastException();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.listResources(". ;5Nrs_$]aD@A", (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard", "resources.messages.standard", messageFormatter0);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) applicationException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", object0, (Object) "resources.messages.standard");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.getLastException();
      ApplicationException applicationException0 = new ApplicationException((Throwable) null, "resources.messages.standard");
      Object object0 = new Object();
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("resources.messages.standard", applicationException0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.022248870579868
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      try { 
        messageFormatter0.initializeResourceBundle((List) linkedList0, (List) linkedList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: ; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      String string0 = messageFormatter0.listToString(list0);
      assertEquals("java.class, java.properties", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = messageFormatter0.listToString(linkedList0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try { 
        messageFormatter0.getMessage((String) null, (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("java.class", "java.class");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
      MessageFormatter messageFormatter1 = new MessageFormatter();
      assertFalse(messageFormatter1.equals((Object)messageFormatter0));
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try { 
        messageFormatter0.formatMessage("resources.messages.standard", messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Locale locale0 = Locale.UK;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) null, (List<String>) null, locale0, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      Locale locale0 = Locale.CANADA;
      try { 
        messageFormatter0.initializeResourceBundle(list0, list0, locale0, classLoader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.properties; and resource path: java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.addResourceBundles();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.5692005239622273
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      try { 
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.class
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("tX(!['%>4", (Object) "tX(!['%>4", (Object) "tX(!['%>4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("H_", (Object) "OK", (Object) "H_", (Object) "OK");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("^JyP!_8.;/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object) "resources.messages.standard", (Object) messageFormatter0, (Object) messageFormatter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }
}
