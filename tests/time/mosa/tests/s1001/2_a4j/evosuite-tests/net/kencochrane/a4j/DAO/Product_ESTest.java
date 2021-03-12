/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 27 10:54:47 GMT 2020
 */

package net.kencochrane.a4j.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.beans.FullProduct;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Product_ESTest extends Product_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct((String) null, (String) null, (String) null);
      assertNull(fullProduct0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct((String) null, "=K`@VN6]", (String) null);
      assertNull(fullProduct0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "", "");
      assertNull(fullProduct0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NET.KENCOCHRANE.A4J.BEANS.PRODUCTINFO_NET.KENCOCHRANE.A4J.BEANS.PRODUCTINFO_HEAVY_NET.KENCOCHRANE.A4J.BEANS.PRODUCTINFO.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencochrane.a4j.beans.ProductInfo");
      FullProduct fullProduct0 = product0.getProduct("net.kencochrane.a4j.beans.ProductInfo", "net.kencochrane.a4j.beans.ProductInfo", "net.kencochrane.a4j.beans.ProductInfo");
      assertNotNull(fullProduct0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("O~x", "t", "t");
      assertNull(fullProduct0);
  }
}
