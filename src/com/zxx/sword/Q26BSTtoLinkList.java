package com.zxx.sword;

public class Q26BSTtoLinkList {
    TreeNode headNode = null;
    TreeNode preNode = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        convert_ruc(pRootOfTree);
        return headNode;
    }
    public void convert_ruc(TreeNode pRootOfTree){
        if(pRootOfTree == null)return;
        convert_ruc(pRootOfTree.left);
        if(headNode == null){
            headNode = pRootOfTree;
            preNode = pRootOfTree;
        }else {
            preNode.right = pRootOfTree;
            pRootOfTree.left = preNode;
            preNode = pRootOfTree;
        }
        convert_ruc(pRootOfTree.right);
    }
}
