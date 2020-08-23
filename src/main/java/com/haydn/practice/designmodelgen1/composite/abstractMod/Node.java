package com.haydn.practice.designmodelgen1.composite.abstractMod;

/**
 * @Author haydn
 * @create 2020/8/23 15:27
 */
public interface Node {

    /**
     * 这种定义方式下，子节点可以不同的属性
     * 可以理解成不同（个数、类型）的文件和不同（类型/个数）的文件夹
     */
    abstract  public void print();

}
