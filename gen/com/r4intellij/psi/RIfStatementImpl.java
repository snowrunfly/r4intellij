// This is a generated file. Not intended for manual editing.
package com.r4intellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.r4intellij.parsing.RElementTypes.*;
import com.r4intellij.psi.api.*;

public class RIfStatementImpl extends RExpressionImpl implements RIfStatement {

  public RIfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RVisitor) ((RVisitor)visitor).visitIfStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getLpar() {
    return findNotNullChildByType(THE_R_LPAR);
  }

  @Override
  @NotNull
  public PsiElement getRpar() {
    return findNotNullChildByType(THE_R_RPAR);
  }

  @Override
  @Nullable
  public PsiElement getElse() {
    return findChildByType(THE_R_ELSE);
  }

  @Override
  @NotNull
  public PsiElement getIf() {
    return findNotNullChildByType(THE_R_IF);
  }

}
