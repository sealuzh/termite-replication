/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 02:10:07 GMT 2019
 */

package net.kencochrane.a4j.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.beans.FullProduct;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Product_ESTest extends Product_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/HEAVY_29TWA.D,JDF8{_HEAVY_29TWA.D,JDF8{.XML");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/T_HEAVY_29TWA.D,JDF8{_HEAVY_29TWA.D,JDF8{.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile1);
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "rWj?1H9YgaGLizGMP");
      EvoSuiteFile evoSuiteFile2 = new EvoSuiteFile("/HEAVY_29TWA.D,JDF8{_HEAVY_29TWA.D,JDF8{.XML");
      FileSystemHandling.appendDataToFile(evoSuiteFile2, (byte[]) null);
      EvoSuiteFile evoSuiteFile3 = new EvoSuiteFile("/HEAVY_29TWA.D,JDF8{_HEAVY_29TWA.D,JDF8{.XML");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=heavy&type=heavy&offerpage=29twA.D,jDf8{&offer=29twA.D,jDf8{&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "rWj?1H9YgaGLizGMP");
      byte[] byteArray1 = new byte[1];
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "nekencochrane.a4j.beans.Accessories");
      byteArray1[0] = (byte)1;
      FileSystemHandling.appendDataToFile(evoSuiteFile3, byteArray1);
      FullProduct fullProduct0 = product0.getProduct("heavy", "29twA.D,jDf8{", "29twA.D,jDf8{");
      assertNotNull(fullProduct0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("heavy", "e*U.e`O:-Ykj*D1", "^Uf3&i)Xos9}3z");
      assertNull(fullProduct0);
  }
}
