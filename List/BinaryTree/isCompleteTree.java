//判断一棵树是不是完全二叉树////////////////////////////////////////////////////////////////////////


public class TreeTest04 {
    public boolean isCompleteTree(Node root) {
        //完全二叉树可以是空树
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur != null) {
                queue.offer(root.left);
                queue.offer(root.right);
            }
            else break;
        }
        //判断此时队列里剩下的元素，是否为空
        while (!queue.isEmpty()) {
            Node cur = queue.peek();
            if (cur != null) {
                return false;
            }
            else queue.poll();
        }
        return true;
    }
}
