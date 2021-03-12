/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 07 13:18:19 GMT 2020
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PhdBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jcvi.jillion.assembly.consed.phd.PhdBuilder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/92_jcvi-javacommon"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PhdBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.jcvi.jillion.core.Range$EmptyIntRange",
      "org.jcvi.jillion.core.pos.DefaultPositionSequence",
      "org.jcvi.jillion.core.Range$ByteRange",
      "org.jcvi.jillion.core.Range$ShortRange",
      "org.jcvi.jillion.core.residue.Residue",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$1",
      "org.jcvi.jillion.core.Range$Builder",
      "org.jcvi.jillion.internal.core.util.Caches$AbstractReferencedCache",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceCache",
      "org.jcvi.jillion.core.Range$EmptyByteRange",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$NewValues",
      "org.jcvi.jillion.assembly.consed.phd.PhdBuilder",
      "org.jcvi.jillion.core.util.MapUtil",
      "org.jcvi.jillion.core.Range$1",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$AlignedReference",
      "org.jcvi.jillion.assembly.consed.phd.Phd",
      "org.jcvi.jillion.core.residue.nt.Nucleotide",
      "org.jcvi.jillion.core.residue.ResidueSequenceBuilder",
      "org.jcvi.jillion.internal.core.io.RandomAccessFileInputStream",
      "org.jcvi.jillion.core.Range$EmptyShortRange",
      "org.jcvi.jillion.core.qual.RunLengthEncodedQualityCodec",
      "org.jcvi.jillion.internal.core.util.RunLength",
      "org.jcvi.jillion.internal.core.residue.AbstractResidueSequence",
      "org.jcvi.jillion.core.pos.Position",
      "org.jcvi.jillion.internal.core.io.ValueSizeStrategy",
      "org.jcvi.jillion.trace.chromat.Channel",
      "org.jcvi.jillion.core.Range$LongStartIntLengthRange",
      "org.jcvi.jillion.core.residue.nt.ReferenceMappedNucleotideSequence",
      "org.jcvi.jillion.core.Range$UnsignedIntStartIntLengthRange",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$CodecDecider",
      "org.jcvi.jillion.internal.trace.chromat.DefaultChannelGroup",
      "org.jcvi.jillion.core.Range$IntRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartShortLengthRange",
      "org.jcvi.jillion.core.qual.QualitySequenceBuilder",
      "org.jcvi.jillion.core.util.ObjectsUtil",
      "org.jcvi.jillion.core.qual.RunLengthEncodedQualityCodec$Metrics",
      "org.jcvi.jillion.internal.core.util.Caches",
      "org.jcvi.jillion.core.Range$UnsignedShortStartLongLengthRange",
      "org.jcvi.jillion.internal.core.GlyphCodec",
      "org.jcvi.jillion.core.residue.nt.DefaultNucleotideSequence",
      "org.jcvi.jillion.internal.core.io.ValueSizeStrategy$1",
      "org.jcvi.jillion.trace.chromat.Chromatogram",
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhd",
      "org.jcvi.jillion.internal.core.io.ValueSizeStrategy$3",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder",
      "org.jcvi.jillion.internal.core.io.ValueSizeStrategy$2",
      "org.jcvi.jillion.core.qual.EncodedQualitySequence",
      "org.jcvi.jillion.trace.chromat.ChannelGroup",
      "org.jcvi.jillion.internal.core.util.GrowableShortArray",
      "org.jcvi.jillion.internal.core.io.ValueSizeStrategy$4",
      "org.jcvi.jillion.core.io.IOUtil",
      "org.jcvi.jillion.core.Range",
      "org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequence",
      "org.jcvi.jillion.core.residue.nt.NucleotideCodec",
      "org.jcvi.jillion.core.Rangeable",
      "org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem",
      "org.jcvi.jillion.internal.core.util.GrowableByteArray",
      "org.jcvi.jillion.core.qual.DefaultQualitySymbolCodec",
      "org.jcvi.jillion.core.Range$UnsignedByteStartShortLengthRange",
      "org.jcvi.jillion.internal.trace.chromat.BasicChromatogram",
      "org.jcvi.jillion.internal.core.util.Caches$WeakReferenceLRUCache",
      "org.jcvi.jillion.core.residue.nt.TwoBitEncodedNucleotideCodec",
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhdWholeReadItem",
      "org.jcvi.jillion.core.Range$RangeIterator",
      "org.jcvi.jillion.core.Range$UnsignedByteStartIntLengthRange",
      "org.jcvi.jillion.core.qual.PhredQuality",
      "org.jcvi.jillion.internal.trace.chromat.DefaultChannel",
      "org.jcvi.jillion.core.pos.PositionSequence",
      "org.jcvi.jillion.core.util.Builder",
      "org.jcvi.jillion.core.residue.ResidueSequence",
      "org.jcvi.jillion.core.Range$UnsignedShortStartIntLengthRange",
      "org.jcvi.jillion.internal.core.EncodedSequence",
      "org.jcvi.jillion.core.Range$CoordinateSystem",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceLRUCache",
      "org.jcvi.jillion.trace.Trace",
      "org.jcvi.jillion.core.qual.QualitySequence",
      "org.jcvi.jillion.assembly.consed.phd.ArtificialPhd",
      "org.jcvi.jillion.core.Range$UnsignedIntStartLongLengthRange",
      "org.jcvi.jillion.core.Range$LongRange",
      "org.jcvi.jillion.core.pos.PositionSequenceBuilder",
      "org.jcvi.jillion.core.SequenceBuilder",
      "org.jcvi.jillion.core.io.IOUtil$Endian",
      "org.jcvi.jillion.core.qual.QualitySymbolCodec",
      "org.jcvi.jillion.internal.core.util.Caches$WeakReferenceCache",
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag",
      "org.jcvi.jillion.assembly.consed.phd.PhdReadTag",
      "org.jcvi.jillion.core.Sequence",
      "org.jcvi.jillion.core.Range$EmptyLongRange"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.jcvi.jillion.core.qual.QualitySequence", false, PhdBuilder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jcvi.jillion.core.residue.nt.NucleotideSequence", false, PhdBuilder_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PhdBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jcvi.jillion.assembly.consed.phd.PhdBuilder",
      "org.jcvi.jillion.assembly.consed.phd.ArtificialPhd",
      "org.jcvi.jillion.core.pos.PositionSequenceBuilder",
      "org.jcvi.jillion.internal.core.util.GrowableShortArray",
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag",
      "org.jcvi.jillion.internal.trace.chromat.DefaultChannel",
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhd",
      "org.jcvi.jillion.core.qual.QualitySequenceBuilder",
      "org.jcvi.jillion.internal.core.util.GrowableByteArray",
      "org.jcvi.jillion.core.qual.RunLengthEncodedQualityCodec",
      "org.jcvi.jillion.internal.core.util.RunLength",
      "org.jcvi.jillion.core.qual.PhredQuality",
      "org.jcvi.jillion.core.pos.Position",
      "org.jcvi.jillion.core.io.IOUtil",
      "org.jcvi.jillion.core.pos.DefaultPositionSequence",
      "org.jcvi.jillion.internal.trace.chromat.BasicChromatogram",
      "org.jcvi.jillion.internal.trace.chromat.DefaultChannelGroup",
      "org.jcvi.jillion.core.util.ObjectsUtil",
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhdWholeReadItem",
      "org.jcvi.jillion.core.qual.RunLengthEncodedQualityCodec$Metrics",
      "org.jcvi.jillion.internal.core.io.ValueSizeStrategy",
      "org.jcvi.jillion.internal.core.EncodedSequence",
      "org.jcvi.jillion.core.qual.EncodedQualitySequence",
      "org.jcvi.jillion.core.qual.DefaultQualitySymbolCodec",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$NewValues",
      "org.jcvi.jillion.internal.core.util.Caches",
      "org.jcvi.jillion.internal.core.util.Caches$AbstractReferencedCache",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceCache",
      "org.jcvi.jillion.core.util.MapUtil",
      "org.jcvi.jillion.core.Range",
      "org.jcvi.jillion.core.Range$Builder",
      "org.jcvi.jillion.core.Range$CoordinateSystem",
      "org.jcvi.jillion.core.Range$UnsignedByteStartShortLengthRange",
      "org.jcvi.jillion.core.Range$LongRange",
      "org.jcvi.jillion.core.Range$ShortRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartIntLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartShortLengthRange",
      "org.jcvi.jillion.core.Range$EmptyShortRange",
      "org.jcvi.jillion.core.Range$ByteRange",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$CodecDecider",
      "org.jcvi.jillion.core.residue.nt.TwoBitEncodedNucleotideCodec",
      "org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$1",
      "org.jcvi.jillion.internal.core.residue.AbstractResidueSequence",
      "org.jcvi.jillion.core.residue.nt.DefaultNucleotideSequence",
      "org.jcvi.jillion.core.Range$UnsignedIntStartIntLengthRange",
      "org.jcvi.jillion.core.Range$EmptyByteRange",
      "org.jcvi.jillion.core.Range$LongStartIntLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartIntLengthRange"
    );
  }
}
