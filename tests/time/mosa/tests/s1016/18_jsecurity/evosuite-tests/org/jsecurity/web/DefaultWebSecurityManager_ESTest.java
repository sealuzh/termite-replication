/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 27 23:52:57 GMT 2020
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.Session;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.18030455699462
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.4019454593787286
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
  /*Coverage entropy=1.5481155268740174
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookieSecure(false);
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5481155268740174
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookiePath("~7&Pi=$=u!r`:");
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5481155268740174
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookieMaxAge((-3724));
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add(simpleAccountRealm0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedHashSet0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.newSessionManagerInstance();
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2396593920543857
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.isHttpSessionMode();
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieSecure(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath((String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName((String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge(2147483645);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setRememberMeCookiePath((String) null);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      boolean boolean0 = defaultWebSecurityManager0.isAuthenticated((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      assertFalse(boolean0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      boolean boolean0 = defaultWebSecurityManager0.isAuthenticated((Session) null);
      assertFalse(boolean0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, (ServletResponse) null);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.getPrincipals((Session) null, (ServletRequest) null, servletResponseWrapper0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getPrincipals((Session) null);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      assertTrue(subject0.isAuthenticated());
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.bind(delegatingSubject0, (ServletRequest) null, servletResponseWrapper0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  //Test case number: 24
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
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
  //Test case number: 25
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
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
  //Test case number: 26
  /*Coverage entropy=2.1383330595080277
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
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
  //Test case number: 27
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((ServletRequest) null, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.session.ServletContainerSessionManager", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  //Test case number: 29
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  //Test case number: 30
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind((Subject) null, (ServletRequest) null, (ServletResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  //Test case number: 32
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      boolean boolean0 = defaultWebSecurityManager0.isHttpSessionMode();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.1490596969706202
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("http");
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  //Test case number: 35
  /*Coverage entropy=1.5481155268740174
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookieName(" class: '");
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) null, false, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setRememberMeCookiePath("");
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookiePath("[NJI>z");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.1383330595080277
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      assertFalse(subject0.isAuthenticated());
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
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
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(0);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }
}
