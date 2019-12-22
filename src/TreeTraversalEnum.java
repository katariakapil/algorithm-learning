public enum TreeTraversalEnum {

    IN_ORDER("In Order Traversal L -> N -> R"),
    POST_ORDER ("Post Order Traversal L-> R -> N "),
    PRE_ORDER ("Pre Order Traversal N -> L -> R"),
    LEVEL_ORDER ("Level Order is Breadth First Search ");

    public String desc;

    TreeTraversalEnum(String s) {

        this.desc = s;
    }
}
