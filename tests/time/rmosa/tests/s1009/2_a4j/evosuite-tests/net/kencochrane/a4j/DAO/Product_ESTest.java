/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 23:34:14 GMT 2019
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/COUNTY = _COUNTY = _HEAVY_COUNTY = .XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "WMNVEB2j6^{PFxZ");
      FullProduct fullProduct0 = product0.getProduct("County = ", "County = ", "County = ");
      assertNotNull(fullProduct0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "heavy", "heavy");
      assertNull(fullProduct0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("F#*1tL=H-SySuM{g/B", "_;ytp[8-WNJ1NZSN", "F#*1tL=H-SySuM{g/B");
      assertNull(fullProduct0);
  }
}
