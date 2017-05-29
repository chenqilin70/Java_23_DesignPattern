/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.composite;

import java.util.Enumeration;

/**
 *
 * @author aierxuan
 */
public class Test {
    private TreeNode root=null;

    public Test(String name) {
        root=new TreeNode(name);
    }
    public static void main(String[] args) {
        TreeNode nodeA=new TreeNode("A");
        TreeNode nodeB=new TreeNode("B");
        TreeNode nodeC1=new TreeNode("C1");
        TreeNode nodeC2=new TreeNode("C2");
         TreeNode nodeD=new TreeNode("D");
         nodeC1.add(nodeD);
        nodeB.add(nodeC1);
        nodeB.add(nodeC2);
        nodeA.add(nodeB);
        printVector(nodeA);
    }
    
    public static void printVector(TreeNode node){
        System.out.println(node+"and parent is"+node.getParent());
        Enumeration<TreeNode> enums=node.getChildren();
        while(enums.hasMoreElements()){
            TreeNode next=enums.nextElement();
            printVector(next);
        }
    }
}
