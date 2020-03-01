/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 04:09:39 GMT 2019
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError(", is neither a directory nor ", applicationException0);
      linkedList0.add((Object) messageFormatter_LoadBundleError0);
      MessageFormatter messageFormatter1 = new MessageFormatter();
      messageFormatter0.createLoadException(linkedList0);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      assertEquals(0, linkedList1.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.214534764133424
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "*GjTN,Jou)f";
      ApplicationException applicationException0 = new ApplicationException("*GjTN,Jou)f", "*GjTN,Jou)f", (Object) null);
      messageFormatter0.myLastException = (Throwable) applicationException0;
      messageFormatter0.getLastException();
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
  //Test case number: 2
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("Q#%");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.formatMessage("Q#%", (Object[]) null, (ResourceBundle) propertyResourceBundle0);
      Throwable throwable0 = null;
      ApplicationException applicationException0 = new ApplicationException((Throwable) null, "5*)J7]", "=G?^sLvp`=R`]");
      MockThrowable mockThrowable0 = new MockThrowable("Q#%", (Throwable) null);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("critical.question.saveFailedUnknown");
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("9,G_l]0dSZ,d");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) propertyResourceBundle0;
      objectArray0[1] = (Object) "9,G_l]0dSZ,d";
      stringReader0.skip(1L);
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) "prompt.";
      objectArray0[4] = (Object) "resources.messages.standard";
      objectArray0[5] = (Object) "com.lts.application.fatal.createRepository";
      objectArray0[6] = (Object) "9,G_l]0dSZ,d";
      objectArray0[7] = (Object) propertyResourceBundle0;
      objectArray0[8] = (Object) "prompt.";
      messageFormatter0.formatMessage("9,G_l]0dSZ,d", objectArray0, (ResourceBundle) propertyResourceBundle0);
      Throwable throwable0 = null;
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange("9,G_l]0dSZ,d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // range=9,g_l]0dsz,d
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[9];
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.formatMessage(".prompt.", objectArray0, (ResourceBundle) propertyResourceBundle0);
      objectArray0[0] = (Object) "com.lts.application.fatal.createRepository";
      objectArray0[1] = (Object) "com.lts.application.fatal.createRepository";
      objectArray0[2] = (Object) "com.lts.application.fatal.createRepository";
      objectArray0[3] = (Object) messageFormatter0;
      int int0 = 20;
      Integer integer0 = new Integer(20);
      Throwable throwable0 = null;
      String string0 = null;
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange("=G?^sLvp`=R`]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // range==g?^slvp`=r`]
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  //Test case number: 6
  /*Coverage entropy=2.022248870579868
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale locale0 = Locale.KOREAN;
      MockThrowable mockThrowable0 = new MockThrowable("resources.messages.standard");
      StringReader stringReader0 = new StringReader(".prompt.");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Locale locale1 = Locale.forLanguageTag("com.lts.aLplicatio&.errors.CeatingTempdir");
      LinkedList<PropertyResourceBundle> linkedList1 = new LinkedList<PropertyResourceBundle>();
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) linkedList0, (List<String>) linkedList0, locale1, (ClassLoader) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: ; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9195207554991391
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "!";
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
  //Test case number: 8
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad((String) null, "] = ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(linkedList0);
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      StringReader stringReader0 = new StringReader("");
      stringReader0.ready();
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("", "java.properties");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8950056533107491
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MessageFormatter messageFormatter1 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      ResourceBundle.Control.getControl(list0);
      List<String> list1 = ResourceBundle.Control.FORMAT_DEFAULT;
      messageFormatter0.listToString(list1);
      String string0 = messageFormatter0.listToString(list1);
      assertEquals("java.class, java.properties", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      // Undeclared exception!
      try { 
        messageFormatter0.listResources("Tq1W1.mW`8", (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader.getSystemClassLoader();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      messageFormatter0.listToString(list0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.add(".");
      Locale locale1 = Locale.KOREAN;
      assertEquals("kor", locale1.getISO3Language());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray1 = new Object[7];
      objectArray1[0] = (Object) messageFormatter0;
      objectArray1[1] = (Object) ":'jSJ#_,F32";
      objectArray1[2] = object1;
      objectArray1[3] = object0;
      objectArray1[4] = object0;
      objectArray1[5] = object0;
      objectArray1[6] = (Object) messageFormatter0;
      try { 
        messageFormatter0.getMessage(":'jSJ#_,F32", objectArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
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
  //Test case number: 16
  /*Coverage entropy=0.8950056533107491
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader.getSystemClassLoader();
      MessageFormatter messageFormatter1 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      ResourceBundle.Control resourceBundle_Control0 = ResourceBundle.Control.getControl(list0);
      List<String> list1 = resourceBundle_Control0.getFormats("B(Yh^,_-6n5");
      String string0 = messageFormatter1.listToString(list1);
      assertEquals("java.properties", string0);
      
      String string1 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassLoader.getSystemClassLoader();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader0.setPackageAssertionStatus("null", false);
      classLoader1.clearAssertionStatus();
      classLoader1.getParent();
      ClassLoader.getSystemClassLoader();
      classLoader0.setPackageAssertionStatus("EBS4yt", false);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader2.getParent();
      linkedList0.add((Object) classLoader2);
      linkedList0.add((Object) classLoader0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // sun.misc.Launcher$AppClassLoader cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      ClassLoader.getSystemClassLoader();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader2.setDefaultAssertionStatus(true);
      ClassLoader classLoader3 = ClassLoader.getSystemClassLoader();
      classLoader3.clearAssertionStatus();
      Object object1 = new Object();
      Object object2 = new Object();
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  //Test case number: 20
  /*Coverage entropy=2.1537308399247914
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      ClassLoader.getSystemClassLoader();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader0.setPackageAssertionStatus("null", true);
      classLoader2.setDefaultAssertionStatus(false);
      classLoader2.setPackageAssertionStatus("null", false);
      ClassLoader classLoader3 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      classLoader1.setPackageAssertionStatus("?P;[IYeh", false);
      ClassLoader classLoader4 = ClassLoader.getSystemClassLoader();
      classLoader4.getParent();
      classLoader3.setPackageAssertionStatus("com.lts.application.international.MessageFormatter$LoadBundleError", false);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader.getSystemClassLoader();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0);
      try { 
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.class, java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      assertFalse(list0.isEmpty());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader.getSystemClassLoader();
      classLoader2.setDefaultAssertionStatus(true);
      classLoader0.setPackageAssertionStatus(";LQhm", false);
      ClassLoader classLoader3 = classLoader0.getParent();
      classLoader3.clearAssertionStatus();
      Object[] objectArray0 = new Object[0];
      List list0 = MessageFormatter.buildList(objectArray0);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("com.lts.application.fatal.createRepository");
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("com.lts.application.error.createTempDir");
      linkedList0.add(".");
      Locale locale0 = Locale.KOREAN;
      assertEquals("ko", locale0.getLanguage());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = "/test";
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Locale locale0 = new Locale("-\"4Z66[ a", "ce0}&(");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) null, (List<String>) null, locale0, classLoader1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.8742830984023096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      ClassLoader classLoader3 = ClassLoader.getSystemClassLoader();
      classLoader0.setDefaultAssertionStatus(true);
      classLoader3.setPackageAssertionStatus("D2=", false);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("null");
      Locale locale0 = Locale.KOREAN;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) linkedList0, (List<String>) linkedList0, locale0, classLoader2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: null; and resource path: null
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.015255863586861
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader2.clearAssertionStatus();
      classLoader2.getParent();
      ClassLoader classLoader3 = ClassLoader.getSystemClassLoader();
      ClassLoader.getSystemClassLoader();
      classLoader3.clearAssertionStatus();
      classLoader3.setPackageAssertionStatus("OUL4G", true);
      ClassLoader.getSystemClassLoader();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) classLoader0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<ResourceBundle> linkedList1 = new LinkedList<ResourceBundle>();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List) linkedList1, (List) linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // sun.misc.Launcher$AppClassLoader cannot be cast to java.lang.String
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.022248870579868
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassLoader.getSystemClassLoader();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<ApplicationException> linkedList0 = new LinkedList<ApplicationException>();
      LinkedList<MockFileInputStream> linkedList1 = new LinkedList<MockFileInputStream>();
      try { 
        messageFormatter0.initializeResourceBundle((List) linkedList0, (List) linkedList1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: ; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      PipedInputStream pipedInputStream0 = new PipedInputStream(4462);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = object1;
      Object object3 = new Object();
      objectArray0[2] = object3;
      objectArray0[3] = (Object) "+]1H20/q<\")9N";
      objectArray0[4] = object2;
      objectArray0[5] = object1;
      try { 
        messageFormatter0.formatMessage("+]1H20/q<\")9N", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("Tq1W1.m`8", "Tq1W1.m`8");
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
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassLoader.getSystemClassLoader();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      ClassLoader classLoader3 = classLoader2.getParent();
      ClassLoader classLoader4 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      classLoader4.setPackageAssertionStatus("OUL4G", true);
      ClassLoader.getSystemClassLoader();
      classLoader1.getParent();
      classLoader3.setPackageAssertionStatus("", true);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("q+u+9#g1'8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
      classLoader1.clearAssertionStatus();
      ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      ClassLoader classLoader3 = ClassLoader.getSystemClassLoader();
      classLoader0.setDefaultAssertionStatus(true);
      classLoader3.setPackageAssertionStatus("D2=", false);
      classLoader2.clearAssertionStatus();
      classLoader0.setPackageAssertionStatus("crititcal.com.lts.application.errors.properties.title", false);
      ClassLoader.getSystemClassLoader();
      classLoader3.setDefaultAssertionStatus(false);
      classLoader0.getParent();
      classLoader2.setPackageAssertionStatus("x6", false);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader.getSystemClassLoader();
      List list0 = messageFormatter0.listResources("<", classLoader3);
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("/test", "resources.messages.standard");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.getLastException();
      MockThrowable mockThrowable0 = new MockThrowable("resources.messages.standard", (Throwable) null);
      String string0 = "^T36%o|\\ -H0\\,";
      String string1 = ";7_mqr";
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile("resources.messages.standard", ";7_mqr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \";7_mqr\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) messageFormatter0;
      objectArray0[1] = object1;
      objectArray0[2] = (Object) "-b";
      Object object3 = new Object();
      objectArray0[3] = object3;
      objectArray0[4] = (Object) "-b";
      objectArray0[5] = object0;
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("-b", objectArray0[4], objectArray0[4], object2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("U`!||", (Throwable) null);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
      messageFormatter0.temp();
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object0;
      Object object2 = new Object();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", object0, object2, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 3);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 3);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, pipedInputStream0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("<", (Object) pushbackInputStream0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }
}
