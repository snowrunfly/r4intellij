// This is a generated file. Not intended for manual editing.
package com.r4intellij.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ROperatorExpression extends RExpression {

  @Nullable
  ROperator getOperator();

  boolean isBinary();

  RExpression getLeftExpr();

  RExpression getRightExpr();

}
