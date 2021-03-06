package com.r4intellij.inspections;

import org.jetbrains.annotations.NotNull;

import static com.r4intellij.RFileType.DOT_R_EXTENSION;

/**
 * @author Holger Brandl
 */
public class MissingPackageInspectionTest extends RInspectionTest {

    @Override
    public void setUp() throws Exception {
        super.setUp();

        // inject stub index here for more reproducible testing
//        RIndexCache.getTestInstance();
//        RIndexCache.getInstance().refreshIndex();
    }


    public void testMissingFoobarPackage() {
        doTest(getTestName(false) + DOT_R_EXTENSION);
    }


    public void testQuotedPackageName() {
        createBaseLibraryWith("dplyr");
        doTest(getTestName(false) + DOT_R_EXTENSION);
    }


    public void testFunCallRequireArg() {
        doExprTest("require(getPckgName('foo'))");
    }


    public void testMissingPckgInNamespaceCall() {
        doExprTest("<error descr=\"'foobar' is not yet installed\">foobar</error>::myFun()");
    }


    public void testMissingPckgInNonExportedNamespaceCall() {
        doExprTest("<error descr=\"'foobar' is not yet installed\">foobar</error>:::myFun()");
    }


    @NotNull
    @Override
    Class<? extends RInspection> getInspection() {
        return MissingPackageInspection.class;
    }
}
