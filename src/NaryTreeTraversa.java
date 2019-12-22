import java.util.ArrayList;
import java.util.List;

public class NaryTreeTraversa {

    /**
     * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     *
     * For example, given a 3-ary tree:
     *
     * We should return its level order traversal:
     *
     * [
     *      [1],
     *      [3,2,4],
     *      [5,6]
     * ]
     * @param root
     * @return
     */

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> rs = new ArrayList();
        if (root == null ) return rs;

        addChild(root,0,  rs);

        return rs;
    }


    void addChild(Node node, int d,  List<List<Integer>> rs) {

        if (rs.size() <= d) rs.add(new ArrayList<>());
        rs.get(d).add(node.val);

        for (Node n : node.children){
            if (n!=null) addChild(n, d + 1, rs);
        }
    }
    class Node {

        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
