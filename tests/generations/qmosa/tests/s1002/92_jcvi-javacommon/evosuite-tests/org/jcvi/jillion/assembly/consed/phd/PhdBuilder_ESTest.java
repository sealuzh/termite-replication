/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 09:35:54 GMT 2019
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jcvi.jillion.assembly.consed.phd.ArtificialPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhdWholeReadItem;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.internal.trace.chromat.BasicChromatogram;
import org.jcvi.jillion.trace.chromat.Chromatogram;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PhdBuilder_ESTest extends PhdBuilder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("Kf5QWt", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.wholeReadItems((List<PhdWholeReadItem>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      System.setCurrentTimeMillis(1744L);
      System.setCurrentTimeMillis(0L);
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks((-1029), 65);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first peak position must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6764281154875817
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(nucleotideSequence0).getLength();
      LinkedList<DefaultPhd> linkedList0 = new LinkedList<DefaultPhd>();
      Consumer<DefaultPhd> consumer0 = (Consumer<DefaultPhd>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      linkedList0.forEach(consumer0);
      LinkedList<DefaultPhd> linkedList1 = new LinkedList<DefaultPhd>(linkedList0);
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("SB", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList2 = new LinkedList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(746, 1074);
      LinkedList<PhdReadTag> linkedList3 = new LinkedList<PhdReadTag>();
      phdBuilder0.build();
      PhdBuilder phdBuilder2 = phdBuilder1.fakePeaks();
      // Undeclared exception!
      try { 
        phdBuilder2.fakePeaks(746, (-1035));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Object object3 = new Object();
      Object object4 = new Object();
      Object object5 = new Object();
      Object object6 = new Object();
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.readTags((List<PhdReadTag>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("KQ*Wto", nucleotideSequence0, qualitySequence0);
      phdBuilder0.peaks((PositionSequence) null);
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Object object3 = new Object();
      Object object4 = new Object();
      Object object5 = new Object();
      Object object6 = new Object();
      Object object7 = new Object();
      Object object8 = new Object();
      assertFalse(object8.equals((Object)object4));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      Object object0 = new Object();
      Object object1 = new Object();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Object object2 = new Object();
      Object object3 = new Object();
      Object object4 = new Object();
      Object object5 = new Object();
      Object object6 = new Object();
      Object object7 = new Object();
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("KQ*Wto", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.comments(map0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.removeAll(linkedList1);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("", nucleotideSequence0, qualitySequence0, map0);
      LinkedList<PhdReadTag> linkedList2 = new LinkedList<PhdReadTag>();
      DefaultPhd defaultPhd0 = new DefaultPhd("invalid character ", nucleotideSequence0, qualitySequence0, (PositionSequence) null, map0, linkedList0, linkedList2);
      PhdBuilder phdBuilder0 = new PhdBuilder(defaultPhd0);
      LinkedList<String> linkedList3 = new LinkedList<String>();
      DefaultPhdWholeReadItem defaultPhdWholeReadItem0 = new DefaultPhdWholeReadItem(linkedList3);
      linkedList0.add((PhdWholeReadItem) defaultPhdWholeReadItem0);
      Range range0 = Range.of((-128L));
      MockDate mockDate0 = new MockDate(65536, 65536, 338, 338, 2389, 68);
      DefaultPhdReadTag defaultPhdReadTag0 = new DefaultPhdReadTag("", "=`AX1as(;kK'-$w+0c", range0, mockDate0, "", "");
      DefaultPhdReadTag defaultPhdReadTag1 = new DefaultPhdReadTag("{I", "=`AX1as(;kK'-$w+0c", range0, mockDate0, "{I", "");
      defaultPhdReadTag1.equals(artificialPhd0);
      defaultPhdReadTag0.equals(defaultPhdReadTag1);
      linkedList2.add((PhdReadTag) defaultPhdReadTag0);
      phdBuilder0.build();
      Phd phd0 = phdBuilder0.build();
      assertNotSame(phd0, defaultPhd0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.keySet();
      hashMap0.put("", "");
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put("", (String) null);
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      hashMap2.put((String) null, "");
      hashMap1.put("org.jcvijillion.internal.core.util.GrowableByteArray", "3");
      hashMap1.put((String) null, "org.jcvi.jillion.internal.core.io.RandomAccessFileInputStream");
      HashMap<String, String> hashMap3 = new HashMap<String, String>();
      HashMap<String, String> hashMap4 = new HashMap<String, String>();
      HashMap<String, String> hashMap5 = new HashMap<String, String>();
      hashMap5.put("", (String) null);
      HashMap<String, String> hashMap6 = new HashMap<String, String>();
      hashMap6.put((String) null, "");
      hashMap1.put((String) null, "");
      Object object0 = new Object();
      Object object1 = new Object();
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("", nucleotideSequence0, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // qualities can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.keySet();
      hashMap0.put("", "");
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.replace((String) null, "", "3");
      hashMap0.put("", (String) null);
      Object object0 = new Object();
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      hashMap2.put((String) null, "");
      hashMap1.put("org.jcvijillion.internal.core.util.GrowableByteArray", "3");
      hashMap1.put((String) null, "org.jcvi.jillion.internal.core.io.RandomAccessFileInputStream");
      HashMap<String, String> hashMap3 = new HashMap<String, String>();
      HashMap<String, String> hashMap4 = new HashMap<String, String>();
      HashMap<String, String> hashMap5 = new HashMap<String, String>();
      hashMap5.put("", (String) null);
      HashMap<String, String> hashMap6 = new HashMap<String, String>();
      hashMap6.put((String) null, "");
      hashMap1.put((String) null, "");
      Object object1 = new Object();
      Object object2 = new Object();
      Object object3 = new Object();
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("b4!4GJ<,Ro:", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(625, 1798);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.removeAll(linkedList1);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("C;qXl$osS0@uX", nucleotideSequence0, qualitySequence0, map0);
      LinkedList<PhdReadTag> linkedList2 = new LinkedList<PhdReadTag>();
      linkedList0.clear();
      DefaultPhd defaultPhd0 = new DefaultPhd("invalid character ", nucleotideSequence0, qualitySequence0, (PositionSequence) null, map0, linkedList0, linkedList2);
      PhdBuilder phdBuilder0 = new PhdBuilder(defaultPhd0);
      LinkedList<String> linkedList3 = new LinkedList<String>();
      DefaultPhdWholeReadItem defaultPhdWholeReadItem0 = new DefaultPhdWholeReadItem(linkedList3);
      linkedList0.add((PhdWholeReadItem) defaultPhdWholeReadItem0);
      Range range0 = Range.of((-128L));
      MockDate mockDate0 = new MockDate(65536, 65536, 338, 338, 2389, 68);
      DefaultPhdReadTag defaultPhdReadTag0 = new DefaultPhdReadTag("C;qXl$osS0@uX", "=`AX1as(;kK'-$w+0c", range0, mockDate0, "C;qXl$osS0@uX", "C;qXl$osS0@uX");
      DefaultPhdReadTag defaultPhdReadTag1 = new DefaultPhdReadTag("{I", "=`AX1as(;kK'-$w+0c", range0, mockDate0, "{I", "");
      defaultPhdReadTag1.equals(artificialPhd0);
      defaultPhdReadTag0.equals(defaultPhdReadTag1);
      linkedList2.add((PhdReadTag) defaultPhdReadTag0);
      phdBuilder0.build();
      phdBuilder0.build();
      Phd phd0 = phdBuilder0.build();
      assertEquals("invalid character ", phd0.getId());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = "";
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((String) null, (NucleotideSequence) null, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // id can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      hashMap0.keySet();
      hashMap0.put("", "");
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.replace((String) null, "", "3");
      hashMap0.put("", (String) null);
      Object object0 = new Object();
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      hashMap2.put((String) null, "");
      hashMap1.put("org.jcvijillion.internal.core.util.GrowableByteArray", "3");
      hashMap1.put((String) null, "org.jcvi.jillion.internal.core.io.RandomAccessFileInputStream");
      HashMap<String, String> hashMap3 = new HashMap<String, String>();
      HashMap<String, String> hashMap4 = new HashMap<String, String>();
      HashMap<String, String> hashMap5 = new HashMap<String, String>();
      HashMap<String, String> hashMap6 = new HashMap<String, String>();
      HashMap<String, String> hashMap7 = new HashMap<String, String>();
      hashMap4.put("", "org.jcvi.jillion.internal.core.io.RandomAccessFileInputStream");
      HashMap<String, String> hashMap8 = new HashMap<String, String>();
      hashMap1.put((String) null, "3|o%;6/d@08*[jm$p;");
      hashMap7.put("", "id can not be null");
      Object object1 = new Object();
      Object object2 = new Object();
      Object object3 = new Object();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("", (NucleotideSequence) null, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sequence can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      linkedList1.toArray();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) null, locale_FilteringMode0);
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) list0);
      DefaultPhdWholeReadItem defaultPhdWholeReadItem0 = new DefaultPhdWholeReadItem(list1);
      linkedList0.add((PhdWholeReadItem) null);
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("ToA5<2'^AEce\"ZN&V=", nucleotideSequence0, qualitySequence0, (Map<String, String>) null);
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder(artificialPhd0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initial capacity should be > 0 :0
         //
         verifyException("org.jcvi.jillion.internal.core.util.GrowableShortArray", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.ITALIAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) set0);
      DefaultPhdWholeReadItem defaultPhdWholeReadItem0 = new DefaultPhdWholeReadItem(list0);
      linkedList0.add((PhdWholeReadItem) defaultPhdWholeReadItem0);
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("Trunl2P(t=D=", nucleotideSequence0, qualitySequence0);
      List<PhdReadTag> list1 = artificialPhd0.getReadTags();
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      linkedList2.toArray();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list2 = Locale.filterTags((List<Locale.LanguageRange>) linkedList2, (Collection<String>) null, locale_FilteringMode0);
      List<String> list3 = Locale.filterTags((List<Locale.LanguageRange>) linkedList2, (Collection<String>) list2);
      DefaultPhdWholeReadItem defaultPhdWholeReadItem1 = new DefaultPhdWholeReadItem(list3);
      linkedList0.add((PhdWholeReadItem) null);
      DefaultPhd defaultPhd0 = new DefaultPhd("Trunl2P(t=D=", nucleotideSequence0, qualitySequence0, (PositionSequence) null, (Map<String, String>) null, linkedList0, list1);
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder(defaultPhd0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Phd) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // phd to copy can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      String string0 = "Jbg],Q0G";
      String string1 = "Bm=$iLb0\"B]";
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("Bm=$iLb0\"B]", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      phdBuilder0.wholeReadItems(linkedList0);
      Chromatogram chromatogram0 = null;
      BasicChromatogram basicChromatogram0 = null;
      try {
        basicChromatogram0 = new BasicChromatogram((Chromatogram) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.internal.trace.chromat.BasicChromatogram", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9289738521096165
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("invalid offset %d only values between 0 and %d are allowed", nucleotideSequence0, qualitySequence0);
      LinkedList<DefaultPhdReadTag> linkedList0 = new LinkedList<DefaultPhdReadTag>();
      LinkedList<PhdReadTag> linkedList1 = new LinkedList<PhdReadTag>(linkedList0);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 1724L, 1724L);
      MockDate mockDate0 = new MockDate(1336L);
      DefaultPhdReadTag defaultPhdReadTag0 = new DefaultPhdReadTag("invalid offset %d only values between 0 and %d are allowed", "[]<mno&{zUAK16|CA", range0, mockDate0, "rZg", "rZg");
      linkedList0.add(defaultPhdReadTag0);
      linkedList1.pollLast();
      PhdBuilder phdBuilder1 = phdBuilder0.readTags(linkedList1);
      PhdBuilder phdBuilder2 = phdBuilder1.readTags(linkedList1);
      assertSame(phdBuilder0, phdBuilder2);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      String string0 = "Jbg],Q0G";
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("Bm=$iLb0\"B]", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.comments((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9289738521096165
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      String string0 = "Jbg],Q0G";
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("Bm=$iLb0\"B]", nucleotideSequence0, qualitySequence0);
      phdBuilder0.copy();
      Chromatogram chromatogram0 = null;
      BasicChromatogram basicChromatogram0 = null;
      try {
        basicChromatogram0 = new BasicChromatogram((Chromatogram) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.internal.trace.chromat.BasicChromatogram", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Chromatogram) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // chromatogram can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }
}
