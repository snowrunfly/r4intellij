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

  public void accept(@NotNull RVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RVisitor) accept((RVisitor)visitor);
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
    return notNullChild(findChildByType(R_LPAR));
  }

  @Override
  @NotNull
  public PsiElement getRpar() {
    return notNullChild(findChildByType(R_RPAR));
  }

  @Override
  @Nullable
  public PsiElement getElse() {
    return findChildByType(R_ELSE);
  }

  @Override
  @NotNull
  public PsiElement getIf() {
    return notNullChild(findChildByType(R_IF));
  }

}
