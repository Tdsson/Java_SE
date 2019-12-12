package com.tdsson.abstract_test;
/*
 * 3、设计一个系统：
XXX门的实现过程：
流程：
设计一张抽象的门Door，那么对于这张门来说，就应该拥有所有门的共性，开门和关门；
然后对门进行另外的功能设计,防盗、防水、
防弹--bulletproof()、防火、防锈，要求：利用继承、抽象类、接口的知识设计该门

 * */
public interface Method {
    public abstract void guard();
    public abstract void waterproof();
    public abstract void bulletproof();
    public abstract void fireproof();
    public abstract void rustproof();
}
