package com.haydn.practice.designmodelgen1.composite.abstractMod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author haydn
 * @create 2020/8/23 15:29
 */
public class TrunkNode implements Node {

    //
    private int Grade;
    private String name;
    private int id;
    private List<Node> tNodes = new ArrayList<Node>();

    public void print(){
        System.out.println("【Grade= " + Grade + "; id = " + id + "; name = " + name + " / 】");
    }



    public TrunkNode() {
    }

    /**
     * 带参构造
     * @param grade
     * @param name
     * @param id
     */
    public TrunkNode(int grade, String name, int id) {
        Grade = grade;
        this.name = name;
        this.id = id;
    }

    /**
     * 下面几个是关于它的子节点 List 的相关操作
     * @param node
     */
    public void add(Node node){
        tNodes.add(node);
    }

    public void remove(Node node){
        tNodes.remove(node);
    }

    public List<Node> getTNodes(){
        return tNodes;
    }
    public int getGrade() {
        return Grade;
    }



    public void setGrade(int grade) {
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TrunkNode{" +
                "Grade=" + Grade +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
