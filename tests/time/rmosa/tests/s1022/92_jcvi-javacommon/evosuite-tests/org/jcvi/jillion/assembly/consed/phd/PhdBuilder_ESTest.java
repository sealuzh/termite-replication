/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 09:09:02 GMT 2019
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.assembly.consed.phd.ArtificialPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhd;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.internal.trace.chromat.BasicChromatogram;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannel;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannelGroup;
import org.jcvi.jillion.trace.chromat.Chromatogram;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PhdBuilder_ESTest extends PhdBuilder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("0b 1St6u=q", nucleotideSequence0, qualitySequence0);
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(8L).when(nucleotideSequence1).getLength();
      String string0 = "4L~";
      QualitySequence qualitySequence1 = null;
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("4L~", nucleotideSequence1, (QualitySequence) null);
      artificialPhd0.getComments();
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      artificialPhd0.getPositionSequence();
      PhdBuilder phdBuilder1 = new PhdBuilder(artificialPhd0);
      // Undeclared exception!
      try { 
        phdBuilder1.peaks(positionSequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(32767L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultPhd defaultPhd0 = new DefaultPhd("", (NucleotideSequence) null, (QualitySequence) null, (PositionSequence) null);
      PhdBuilder phdBuilder0 = new PhdBuilder(defaultPhd0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems(linkedList0);
      PhdBuilder phdBuilder2 = phdBuilder1.fakePeaks(1073741824, 1073741824);
      PhdBuilder phdBuilder3 = phdBuilder2.peaks((PositionSequence) null);
      PhdBuilder phdBuilder4 = phdBuilder3.fakePeaks();
      // Undeclared exception!
      try { 
        phdBuilder4.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.ArtificialPhd", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(qualitySequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("0b 1St6u=q", nucleotideSequence0, qualitySequence0);
      artificialPhd0.getComments();
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      PhdBuilder phdBuilder1 = phdBuilder0.peaks(positionSequence0);
      phdBuilder1.peaks((PositionSequence) null);
      Phd phd0 = phdBuilder1.build();
      assertEquals("0b 1St6u=q", phd0.getId());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("0b 1St6u=q", nucleotideSequence1, qualitySequence0);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L, 0L, 0L).when(qualitySequence1).getLength();
      DefaultChannel defaultChannel0 = new DefaultChannel(qualitySequence1, positionSequence0);
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup(defaultChannel0, defaultChannel0, defaultChannel0, defaultChannel0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", nucleotideSequence0, qualitySequence1, positionSequence0, defaultChannelGroup0, map0);
      PhdBuilder phdBuilder0 = new PhdBuilder(basicChromatogram0);
      PhdBuilder phdBuilder1 = phdBuilder0.comments(map0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("/YB*m&_k", nucleotideSequence0, qualitySequence1);
      artificialPhd0.getPositionSequence();
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      artificialPhd0.getReadTags();
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
  //Test case number: 6
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("0b 1St6u=q", nucleotideSequence0, qualitySequence0);
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      phdBuilder0.fakePeaks(45, 45);
      Phd phd0 = phdBuilder0.build();
      // Undeclared exception!
      try { 
        phd0.getComments();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", nucleotideSequence0, qualitySequence0);
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
  //Test case number: 8
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(2371L).when(qualitySequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("0b 1St6u=q", nucleotideSequence0, qualitySequence0);
      artificialPhd0.getComments();
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      // Undeclared exception!
      try { 
        phdBuilder0.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder(",`0e~yj", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(15, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("sequence and qualities have unequal lengths", nucleotideSequence0, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // qualities can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("0b 1St6u=q", nucleotideSequence0, qualitySequence0);
      artificialPhd0.getComments();
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      // Undeclared exception!
      try { 
        phdBuilder0.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("A/Ci", nucleotideSequence0, qualitySequence0);
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
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(nucleotideSequence0).getLength();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("*_Q*=,x+x'e5)G\"", nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sequence and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("\"Q", nucleotideSequence0, qualitySequence0);
      Phd phd0 = phdBuilder0.build();
      assertEquals("\"Q", phd0.getId());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("EDP`-1X]#-}Js;", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(757, 592);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("can not iterate over %s when sequence is only %d long", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks((-188), (-2034458191));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first peak position must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("8Q\"Mu]L", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems(linkedList0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("{0n@r5`%=", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(7, 7);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("@p>].l(N&1^2Iz", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks();
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("bT-IV^z5d0j&H", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      PhdBuilder phdBuilder1 = phdBuilder0.readTags(linkedList0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("SB", nucleotideSequence0, qualitySequence0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      PhdBuilder phdBuilder1 = phdBuilder0.comments(map0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("org.jcvi.jillion.core.Range$EmptyIntRange", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.peaks((PositionSequence) null);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("SB", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.copy();
      assertNotSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      DefaultPhd defaultPhd0 = new DefaultPhd("/6McMY'$O_,)dT/2af", nucleotideSequence0, qualitySequence0, (PositionSequence) null);
      List<PhdWholeReadItem> list0 = defaultPhd0.getWholeReadItems();
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      DefaultPhd defaultPhd1 = new DefaultPhd("/6McMY'$O_,)dT/2af", nucleotideSequence0, qualitySequence0, (PositionSequence) null, (Map<String, String>) null, list0, linkedList0);
      defaultPhd1.getComments();
      DefaultPhd defaultPhd2 = new DefaultPhd("/6McMY'$O_,)dT/2af", nucleotideSequence0, qualitySequence0, (PositionSequence) null, (Map<String, String>) null);
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder(defaultPhd2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("", nucleotideSequence0, qualitySequence0);
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
  //Test case number: 26
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  //Test case number: 27
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("DrxHpo<", (NucleotideSequence) null, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sequence can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((String) null, nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // id can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
