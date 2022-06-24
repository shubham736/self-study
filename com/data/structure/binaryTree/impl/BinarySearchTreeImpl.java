package com.data.structure.binaryTree.impl;

import com.data.structure.binaryTree.node.Node;

public interface BinarySearchTreeImpl {
    Node search( int key);

    void insert(int key);

    void inorder();
}
