package com.haydn.practice.designmodelgen1.composite.abstractMod;

/**
 * @Author haydn
 * @create 2020/8/23 12:42
 */
public class TestClass {

    public static void main(String[] args) {

        TrunkNode root = new TrunkNode(1,"Alpha",001);
        TrunkNode tNode2 = new TrunkNode(2,"belta",010);
        TrunkNode tNode3 = new TrunkNode(2,"glma",013);
        Node lNode1 =new LeafNode(1629,"南风");
        Node lNode2 = new LeafNode(1625,"西风");

        root.add(tNode2);
        root.add(tNode3);
        tNode2.add(lNode1);
        tNode2.add(lNode2);

        stout(root);


    }

    public static void stout(Node node){

        node.print();
        if(node instanceof TrunkNode){
            for(Node temp : ((TrunkNode) node).getTNodes()){
                stout(temp);

            }

        }

    }



}
