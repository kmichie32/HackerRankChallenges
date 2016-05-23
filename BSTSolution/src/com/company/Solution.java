package com.company;

import java.util.Scanner;

public class Solution {

    public static int getNumberOfNodes(Node root) {

        if (root == null) { // if the tree is empty, return 0
            return 0;
        } else {
           return  1+ Math.max(getNumberOfNodes(root.left), getNumberOfNodes(root.right));
        }
    }

    public static int getHeight(Node root){
        return getNumberOfNodes(root) - 1;
        // returns the height which is 1 less than the max length of connected nodes
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

