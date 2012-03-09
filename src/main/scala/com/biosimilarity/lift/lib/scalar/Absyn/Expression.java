package com.biosimilarity.lift.lib.scalar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Expression implements java.io.Serializable {
  public abstract <R,A> R accept(Expression.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.scalar.Absyn.Application p, A arg);
    public R visit(com.biosimilarity.lift.lib.scalar.Absyn.Abstraction p, A arg);
    public R visit(com.biosimilarity.lift.lib.scalar.Absyn.Mention p, A arg);
    public R visit(com.biosimilarity.lift.lib.scalar.Absyn.Calculation p, A arg);
    public R visit(com.biosimilarity.lift.lib.scalar.Absyn.Embedding p, A arg);

  }

}
