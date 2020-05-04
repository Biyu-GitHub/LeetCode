class Solution {
    private fun mirrorTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val temp = root.left
        root.left = root.right
        root.right = temp

        mirrorTree(root.left)
        mirrorTree(root.right)

        return root
    }
}