// This is a generated file. Not intended for manual editing.
package com.r4intellij.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RIfStatement extends RExpression {

  @NotNull
  List<RExpression> getExpressionList();

  @NotNull
  PsiElement getLpar();

  @NotNull
  PsiElement getRpar();

  @Nullable
  PsiElement getElse();

  @NotNull
  PsiElement getIf();

}
