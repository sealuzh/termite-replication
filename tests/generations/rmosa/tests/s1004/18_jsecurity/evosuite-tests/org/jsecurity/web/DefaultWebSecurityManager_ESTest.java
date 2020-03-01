/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 02 03:02:03 GMT 2019
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.util.LinkedHashSet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsecurity.authz.permission.WildcardPermission;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.Session;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.session.DefaultWebSessionManager;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.isHttpSessionMode();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.isAuthenticated((Session) null);
      defaultWebSecurityManager0.getPrincipals((Session) null, (ServletRequest) null, servletResponseWrapper0);
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
      
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      String string0 = defaultWebSecurityManager0.getSessionMode();
      assertEquals("jsecurity", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.8599785716462063
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Session session0 = null;
      ServletRequest servletRequest0 = null;
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) null, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/jsecurity-ehcache");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) null, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      defaultWebSecurityManager0.setSessionManager(defaultWebSessionManager0);
      defaultWebSecurityManager0.setSessionIdCookiePath("public static final String constants in the ");
      System.setCurrentTimeMillis((-43L));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      Session session0 = null;
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      String string0 = "No CachePeerProviderFactoryConfiguration specified. Not configuring a CacheManagerPeerProvider.";
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      Session session1 = null;
      ServletResponseWrapper servletResponseWrapper2 = new ServletResponseWrapper(servletResponseWrapper1);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      servletRequestWrapper0.setRequest(servletRequestWrapper1);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, false, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.8599785716462063
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      assertFalse(subject0.isAuthenticated());
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      boolean boolean0 = defaultWebSecurityManager0.isAuthenticated((Session) null, (ServletRequest) null, servletResponseWrapper0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookieMaxAge((-1934455799));
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.newSessionManagerInstance();
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      WildcardPermission wildcardPermission0 = new WildcardPermission("org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY", false);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(wildcardPermission0, "jsecurity");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper1);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, false, (Session) null, (ServletRequest) servletRequestWrapper1, (ServletResponse) servletResponseWrapper1);
      assertFalse(subject0.isAuthenticated());
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind((Subject) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Object object0 = new Object();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(defaultWebSecurityManager0, "http");
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookieName("Unable to init cipher.");
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      defaultWebSecurityManager0.setSessionManager(defaultWebSessionManager0);
      defaultWebSecurityManager0.setSessionIdCookieSecure(false);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper1, servletResponseWrapper0);
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject((PrincipalCollection) null, true, inetAddress0, (Session) null, defaultWebSecurityManager0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Object object0 = new Object();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("7`").when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper1, (ServletResponse) servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0, servletRequestWrapper1, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Object object0 = new Object();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(defaultWebSecurityManager0, "7`");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("7`").when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper1, (ServletResponse) servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0, servletRequestWrapper1, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager(simpleAccountRealm0);
      DelegatingSubject delegatingSubject0 = new DelegatingSubject((PrincipalCollection) null, true, inetAddress0, (Session) null, defaultSecurityManager0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, (ServletResponse) null);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(defaultWebSessionManager0, "org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
      assertTrue(subject0.isAuthenticated());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind((Subject) null, servletRequestWrapper0, servletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.getSubject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("' or '");
      linkedHashSet0.add(simpleAccountRealm0);
      SimpleAccountRealm simpleAccountRealm1 = new SimpleAccountRealm("NNcl.QTi\"G$r'");
      linkedHashSet0.add(simpleAccountRealm0);
      linkedHashSet0.add(simpleAccountRealm1);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedHashSet0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [null].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((ServletRequest) servletRequestWrapper0, (ServletResponse) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.servlet.ServletRequestWrapper cannot be cast to javax.servlet.http.HttpServletRequest
         //
         verifyException("org.jsecurity.web.session.ServletContainerSessionManager", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((ServletRequest) null, (ServletResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.session.ServletContainerSessionManager", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("http");
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getPrincipals((Session) null);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(1945);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookieMaxAge((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.newSessionManagerInstance();
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      boolean boolean0 = defaultWebSecurityManager0.isHttpSessionMode();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieSecure(false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm((String) null);
      DefaultWebSecurityManager defaultWebSecurityManager0 = null;
      try {
        defaultWebSecurityManager0 = new DefaultWebSecurityManager((Realm) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realm argument cannot be null
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      String string0 = defaultWebSecurityManager0.getSessionMode();
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
      assertEquals("http", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge((-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("org.jsecurity.util.LifecycleUtils");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookiePath("].  Allowed values are ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setRememberMeCookiePath("5XOQ[l:F=-o37>\tcr");
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName("jsecurity");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      DefaultWebSecurityManager defaultWebSecurityManager0 = null;
      try {
        defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedHashSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realms collection argument cannot be empty.
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(1945);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }
}
