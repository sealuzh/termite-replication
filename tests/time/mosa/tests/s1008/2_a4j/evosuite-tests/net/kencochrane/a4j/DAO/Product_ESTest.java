/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 20:38:13 GMT 2019
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/>LGZYP~5J8V=P1KTZ_8&YWQW+~P{QD3CR'Z_HEAVY_8&YWQW+~P{QD3CR'Z.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ">LGzYP~5J8V=p1Ktz");
      FullProduct fullProduct0 = product0.getProduct(">LGzYP~5J8V=p1Ktz", "8&ywqw+~p{qD3cr'z", "8&ywqw+~p{qD3cr'z");
      assertNotNull(fullProduct0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct((String) null, (String) null, "HkBGp,3V&_?]z9N");
      assertNull(fullProduct0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct(">LGzYP~5J8V=p1Ktz", "8&ywqw+~p{qD3cr'z", "8&ywqw+~p{qD3cr'z");
      assertNull(fullProduct0);
  }
}
