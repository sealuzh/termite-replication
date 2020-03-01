/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 04:39:24 GMT 2019
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/;MY:|#IFTAT:9.SL__;MY:|#IFTAT:9.SL__HEAVY_NET.KENCOCHRANE.A4J.BEANS.FULLPRODUCT.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "b");
      Product product0 = new Product();
      product0.getProduct(";MY:|#IftAt:9.SL_", ";MY:|#IftAt:9.SL_", "net.kencochrane.a4j.beans.FullProduct");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      boolean boolean0 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("cER,WDKJCD&(c&h", "5@Vu0B2*x:^~FL", "$");
      assertNull(fullProduct0);
  }
}
