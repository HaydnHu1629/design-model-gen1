package com.haydn.practice.designmodelgen1.composite.abstractMod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author haydn
 * @create 2020/8/23 16:15
 */
public class LeafNode implements Node{

    private int id;
    private String name;
    private List<Node> lNodes = new ArrayList<>();

    public void print(){
        System.out.println(" --[ id = " + id + "; name = " + name + " / ]");

    }

    public LeafNode() {
    }

    /**
     * 带参构造
     * @param id
     * @param name
     */
    public LeafNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 下面几个是关于它的子节点 List 的相关操作
     * @return
     */
    public void add(Node node){
        lNodes.add(node);
    }

    public void remove(Node node){
        lNodes.remove(node);
    }

    public List<Node> getTNodes(){
        return lNodes;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LeafNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
