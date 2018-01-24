/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if(root != null){
            search(root, "", answer);
        }
        return answer;
    }
    private void search(TreeNode root,String path, List<String> answer){
        if(root.left == null && root.right == null){
            answer.add(path + root.val);
        }
        if(root.left != null){
            search(root.left, path + root.val + "->", answer);
        }
        if(root.right != null){
            search(root.right, path + root.val +"->", answer);
        }
    }
}