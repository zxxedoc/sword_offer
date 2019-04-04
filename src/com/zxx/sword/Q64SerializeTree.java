package com.zxx.sword;

/**
 * 序列化和反序列化二叉树
 * 序列化：前序遍历，记录节点值，遇到空节点用#表示
 * 反序列化：
 */
public class Q64SerializeTree {
    public int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        pre(root,sb);
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        String[] DLRseq = str.split(",");
        TreeNode leave = null;
        if(!DLRseq[index].equals("#")){
            leave = new TreeNode(Integer.valueOf(DLRseq[index]));
            leave.left = Deserialize(str);
            leave.right = Deserialize(str);
        }
        return leave;
    }
    void pre(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append("#,");
        }else {
            sb.append(root.val+",");
            pre(root.left,sb);
            pre(root.right,sb);
        }
    }
}
