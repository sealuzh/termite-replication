/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 00:52:06 GMT 2019
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
  /*Coverage entropy=1.581345485628665
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("jfiev");
      assertEquals("jfief", string0);
      
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1862643602110532
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ical");
      assertEquals("ical", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.312047394116508
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.stemString("ement");
      lovinsStemmer0.stemString("ement");
      String string1 = lovinsStemmer0.stemString("ement");
      assertEquals("ement", string1);
      
      String string2 = lovinsStemmer0.stemString("A link to a PDF file.");
      assertEquals("a link to a pdf fil.", string2);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.8690529818095458
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("8034");
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      String string1 = lovinsStemmer0.stem("capitex");
      assertEquals("capitic", string1);
      
      String string2 = lovinsStemmer0.stemString("capitic");
      assertEquals("capit", string2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4396322413608942
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.getTechnicalInformation();
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.stemString("E%rUGg(Dg\"$^+E!oq");
      String string0 = lovinsStemmer3.stemString("E%rUGg(Dg\"$^+E!oq");
      assertEquals("e%rug(dg\"$^+e!oq", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.8852718662323649
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("istr");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer1.stemString("l86![I=.");
      lovinsStemmer1.stemString("l86![I=.");
      lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation characters are numerals, such as `hbox{(about 1984)}'.");
      lovinsStemmer1.getRevision();
      lovinsStemmer1.stemString("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu character ar numer, such as `hbox{(about 1984)}'.");
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8816200524031901
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("seP");
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.stem("ariseH");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer0.toString();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      String string1 = lovinsStemmer0.stemString("enet");
      assertEquals("enet", string1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0070905604932938
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer0.stem("j4qr[");
      String[] stringArray0 = new String[9];
      stringArray0[1] = "j4qr[";
      stringArray0[2] = "j4qr[";
      stringArray0[1] = "j4qr[";
      stringArray0[5] = "j4qr[";
      stringArray0[6] = "j4qr[";
      stringArray0[7] = "j4qr[";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      String string0 = lovinsStemmer2.stemString("b8mn3zpher");
      assertEquals("b8mn3zpher", string0);
      
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.toString();
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.getRevision();
      String string1 = lovinsStemmer1.stemString("j4qr[");
      assertEquals("j4qr[", string1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.2755248741091858
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString("linguend");
      assertEquals("linguens", string0);
      
      String string1 = lovinsStemmer0.stemString("How something strange has been published. The first word should be capitalized.");
      assertEquals("how someth strang ha been publ. th first word should be capital.", string1);
      
      String string2 = lovinsStemmer0.stemString("how someth strang ha been publ. th first word should be capital.");
      assertEquals("how someth strang ha been publ. th first word should be capit.", string2);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vu_+w+8jsyl-x0lid");
      assertEquals("vu_+w+8jsyl-x0lis", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5975596570891621
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      String string1 = lovinsStemmer0.stemString("The number of a journal, magazine, technical report, or of a work in a series. An issue of a journal or magazine is usually identified by its volume and number; the organization that issues a technical report usually gives it a number; and sometimes books are given numbers in a named series.");
      assertEquals("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it volum and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.", string1);
      
      String string2 = lovinsStemmer0.stemString("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it volum and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.");
      assertEquals("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it vol and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.", string2);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4736842105263158
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a.@5(I$=c7ouM#(mm");
      assertNotNull(string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4736842105263158
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString(", editors, ");
      String string0 = lovinsStemmer0.stemString(", editor, ");
      assertEquals(", edit, ", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1995737562654383
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString(", editors,OZ ");
      String string0 = lovinsStemmer0.stemString("\tUses lowercase strings.");
      assertEquals("\tus lowercas string.", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.8783578531833827
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.globalInfo();
      lovinsStemmer1.toString();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.stemString("iers");
      String string0 = lovinsStemmer1.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer2.toString();
      lovinsStemmer2.getTechnicalInformation();
      String string1 = lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string1);
      
      String string2 = lovinsStemmer0.stemString("olv");
      assertEquals("olut", string2);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8456473824672358
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The database key of the entry being cross referenced. Any fields that are missing from the current record are inherited from the field being cross referenced.");
      assertEquals("th databas key of th entr being cros refer. any field that ar mis from th cur record ar inherit from th field being cros refer.", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.2404482212173744
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.stemString("ental");
      assertEquals("ent", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.1847146894287413
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ening");
      assertEquals("ening", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.145277367387215
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("Uty8pP");
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("capityt");
      assertEquals("capitys", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("idine");
      assertEquals("id", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.48000000000000004
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("get flag cf@ Yex");
      assertEquals("ges flag cf@ yec", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("numberyz");
      assertEquals("numberys", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.174613679327731
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("/ical");
      assertEquals("/ic", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.49056603773584906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Can't construct a path to file relative to user dir.");
      assertEquals("can't construc a path to fil rel to user dir.", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4736842105263158
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Get oRption~-o: ");
      assertEquals("ges orb~-o: ", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lud");
      assertEquals("lus", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("bex");
      assertEquals("bic", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.4961278702362282
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString("Proceeding of the Sixteenth International Conference on Machine Learning");
      assertEquals("proceed of th sixteenth intern confer on mach learn", string0);
      
      String string1 = lovinsStemmer0.stemString("proceed of th sixteenth intern confer on mach learn");
      assertEquals("proceed of th sixteenth intern confer on mach learn", string1);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.5814759998868568
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lux");
      assertEquals("luc", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1203851360367483
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("probToLogOdds: probability must be in [0,1] ");
      assertEquals("probtologod: prob must be in [0,1] ", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ho6hcid");
      assertEquals("ho6hcis", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ert");
      assertEquals("ers", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("O obb^uG>X0");
      assertEquals("o ob^ug>x0", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("panderid");
      assertEquals("panderis", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.4782608695652174
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Max index (ints): ");
      assertEquals("mac indic (int): ", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iiefrud");
      assertEquals("iiefrus", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ond");
      assertEquals("ons", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.4987212276214834
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. tis field should not be confused with the key that appears in the cite command and at the beginning of the dtabase entry.ix");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. ti field should not be confus with th key that appear in th cit command and at th begin of th dtabas entr.ix", string0);
      
      String string1 = lovinsStemmer0.stemString("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. ti field should not be confus with th key that appear in th cit command and at th begin of th dtabas entr.ix");
      assertEquals("us for alphab, cro refer, and creat a label when th ``author'' inform is mi. ti field should not be confus with th key that appear in th cit command and at th begin of th dtab entr.ix", string1);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.4814814814814815
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("IU9S^7vW%7;lGuS}r");
      assertEquals("iu9^7vw%7;lgus}r", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("pand");
      assertEquals("pans", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vad");
      assertEquals("vas", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("%AmRymaR<]HktVG");
      assertEquals("%amrymar<]hktvg", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("uad");
      assertEquals("uas", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("linguix");
      assertEquals("linguic", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("editpex");
      assertEquals("editpic", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.1877705603888151
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ogen");
      assertEquals("ogen", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("linguet");
      assertEquals("lingues", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.49760765550239233
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.48837209302325585
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The alternating de>ision tree learning algorithm");
      assertEquals("th altern de>ision tre learn algorithm", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ieftex");
      assertEquals("ieftic", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.5949626536316133
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      String string1 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string1);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  //Test case number: 57
  /*Coverage entropy=0.4827586206896552
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("invalid CVS revision - notWdots!");
      assertEquals("invalis cv revis - notwdot!", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("acies");
      assertEquals("aci", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  //Test case number: 60
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.5397644158920878
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("H)cX5sB_8");
      assertEquals("h)cx5sb_8", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.439020744028582
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("}30I~LHn`R'^$r");
      assertEquals("}30~lhn`r'^$r", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("j''xN");
      assertEquals("j''xn", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("'");
      assertEquals("'", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=1.176163350110043
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("atingly");
      assertEquals("ating", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("icide");
      assertEquals("ic", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("pansend");
      assertEquals("pansens", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.497716894977169
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Usually the address of the publisher or other type of institution. For major publishing houses, van Leunen recommends omitting the information entirely. For small publishers, on the other hand, you can help the reader by giving the complete address.");
      assertEquals("usu th addres of th publishes or other typ of institut. for major publish hous, van leun recommens omis th inform entir. for smal publishes, on th other hand, you can help th reader by giv th comples addres.", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("efully");
      assertEquals("efl", string0);
  }
}
