/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwl.oracle.design_pattern.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author aierxuan
 */
class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children=new Vector<>();

    public TreeNode(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    public  void add(TreeNode node){
        node.setParent(this);
        children.add(node);
    }
    //删除孩子节点  
    public void remove(TreeNode node){  
        children.remove(node);  
    }  
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
    @Override
    public String toString() {
        return getName();
    }
    
    
}
