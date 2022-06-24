package com.amzon.tree;

import com.amzon.Node;

import java.util.TreeMap;

public class VerticalSum {
    public static void main(String[] args) {
        Node root =  Node.setData();
        System.out.println("Following are the values of" +
                " vertical sums with the positions" +
                " of the columns with respect to root ");
        verticalSum(root);
    }

    private static void verticalSum(Node root) {
        if(root == null)
            return;
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        verticalSumUtil(root , 0 ,treeMap);
        if(treeMap != null){
            System.out.println(treeMap.entrySet());
        }

    }

    private static void verticalSumUtil(Node root, int i, TreeMap<Integer, Integer> treeMap) {
        if(root == null)
            return;
        verticalSumUtil(root.left ,i-1 , treeMap);
        int preSum = (treeMap.get(i) == null) ? 0 : treeMap.get(i);
        treeMap.put(i , preSum+root.data);
        verticalSumUtil(root.right ,i+1 , treeMap);

    }


}
