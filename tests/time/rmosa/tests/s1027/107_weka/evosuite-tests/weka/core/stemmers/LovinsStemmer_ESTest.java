/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 11:37:46 GMT 2020
 */

package weka.core.stemmers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.TechnicalInformation;
import weka.core.stemmers.LovinsStemmer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LovinsStemmer_ESTest extends LovinsStemmer_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertFalse(technicalInformation0.hasAdditional());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      // Undeclared exception!
      try { 
        lovinsStemmer0.stemString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.7590639940948603
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("eflyz");
      assertEquals("eflys", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.7708712659660121
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("3w1cqyt");
      assertEquals("3w1cqys", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7238929454732672
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("Tet");
      assertEquals("tes", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9771676162369937
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("journet");
      assertEquals("journet", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("mit");
      assertEquals("mis", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9830062712558603
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("An annotation. It is not used by the standard bibliography styles, but may be used by others that produce an annotated bibliography.");
      assertEquals("an annot. it is not us by th standard bibliograph styl, but may be us by other that produc an annot bibliograph.", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9992896741139999
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vasenonsrudlusrud");
      assertEquals("vasenonsrudlusrus", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lud");
      assertEquals("lus", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dg0ond");
      assertEquals("dg0ons", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.7484466800352509
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("icend");
      assertEquals("icens", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7297512257249834
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.7450373458332782
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("vasend");
      assertEquals("vasens", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.7905698620453724
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("|c|_dzrmn+r[cdupand");
      assertEquals("|c|_dzrmn+r[cdupans", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.7905698620453724
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lovinsstemmerherlid");
      assertEquals("lovinsstemmerherlis", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.7708712659660121
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("yearcid");
      assertEquals("yearcis", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("vad");
      assertEquals("vas", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("uad");
      assertEquals("uas", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lux");
      assertEquals("luc", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.7708712659660121
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ingecix");
      assertEquals("ingecic", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.7590639940948603
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ingex");
      assertEquals("ingec", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.7590639940948603
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ttzax");
      assertEquals("ttzac", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.7758353327309706
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("asendtex");
      assertEquals("asendtic", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.9826446443097824
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("atpex");
      assertEquals("atpic", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.066197979413553
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("mw+4,jkl)0vdex");
      assertEquals("mw+4,jkl)0vdic", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0825645272912494
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("g8%c{,bbex");
      assertEquals("g8%c{,bbic", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0138995869176664
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.");
      assertEquals("a stemmer ba on th lovin stemmer, describ he:\n\njl beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("olv");
      assertEquals("olut", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rpt");
      assertEquals("rb", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.045856515276326
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("1^z7Ns2 PAuL=arr");
      assertEquals("1^z7ns2 paul=ar", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.1017812388073802
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("=x9<=HvNPP)';:NZ8]~");
      assertEquals("=x9<=hvnp)';:nz8]~", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.8013034584019739
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("Ross Quinn");
      assertEquals("ross quin", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0934172007358256
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("=+ mhGg[");
      assertEquals("=+ mhg[", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.002727982931539
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("probToLogOdds: probability must be in [0,1] ");
      assertEquals("probtologod: prob must be in [0,1] ", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0748079526341228
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("V?cF9mPtsp$RBb>");
      assertEquals("v?cf9mptsp$rb>", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.9424669566424351
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ental");
      assertEquals("ent", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ical");
      assertEquals("ical", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0276355151602763
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("[WP=NraaR\",^$ah;D");
      assertEquals("[wp=nraar\",^$ah;d", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0489749968264364
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ZP<xiAR`,g)AP!<x:");
      assertEquals("zp<xi`,g)ap!<x:", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0314280459800158
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The Library of Congress Call Number. I've also seen this as lib-congress.");
      assertEquals("th libr of congres cal number. i'v als seen th as lib-congres.", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.9452994815086471
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("EDITOR");
      assertEquals("edit", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.9367490397930263
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ation");
      assertEquals("ation", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.9617663299095778
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("aries");
      assertEquals("ar", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0281552596636727
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Array-Dimensions of 'new String[3][4][]': ");
      assertEquals("arra-dimens of 'new string[3][4][]': ", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.9929252478508062
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Indction of decision trees");
      assertEquals("indct of decis tree", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ement");
      assertEquals("ement", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.9680065317199433
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dnpEAr-r1goLUn:rfM");
      assertEquals("dnpear-r1golun:rfm", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.7566043656709511
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("vasenonsrudlus");
      assertEquals("vasenonsrudlus", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0307451919192103
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("zJUM&(,7");
      assertEquals("zjum&(,7", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.9896880782456102
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A document having a_ author and title, but~not formally published.");
      assertEquals("a docum hav a_ author and titl, but~not form publ.", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.9963837978517196
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th edit of a book---for exampl, ``second''. th should be an ordin, and should hav th first letter capital, as shown hes; th standard styl convers to lower cas when neces.");
      assertEquals("th edit of a book---for exampl, ``second''. th should be an ordin, and should hav th first letter capit, as shown he; th standard styl conver to lower ca when nec.", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.9937190816160949
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("the edition of a book---for example, ``second''. this should be an ordinal, and should have the first letter capitalized, as shown here; the standard styles convert to lower case when necessary.");
      assertEquals("th edit of a book---for exampl, ``second''. th should be an ordin, and should hav th first letter capital, as shown hes; th standard styl convers to lower cas when neces.", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.9424669566424351
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("encies");
      assertEquals("enci", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.9992173531757648
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("C4.5: Programs for Machine Learning");
      assertEquals("c4.5: program for mach learn", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.9563968167464134
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("otide");
      assertEquals("ot", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.9629135477582456
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The WWW Universal Resource Locator that points to the item being referenced. Tis often is used for technical reports to point to the ftp site where the postscript source of the report is located.");
      assertEquals("th www univers resourc loc that point to th item being refer. ti oft is us for techn report to point to th ftp sit whes th postscript sourc of th report is loc.", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.9795276407612141
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.9607162505764949
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation characters are numerals, such as `hbox{(about 1984)}'.");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu character ar numer, such as `hbox{(about 1984)}'.", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=1.0389395751475599
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Can't construct a path to file relative to user dir.");
      assertEquals("can't construc a path to fil rel to user dir.", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String[] stringArray0 = new String[8];
      LovinsStemmer.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
