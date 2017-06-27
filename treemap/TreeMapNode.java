package main.java.sample.treemap;

/**
 * Created by shinkook.kim on 2017-06-27.
 */
public class TreeMapNode {

    final static int LESS = 0;
    final static int GREATER = 1;
    Comparable itskey = null;
    Object itsValue;
    TreeMapNode nodes[] = new TreeMapNode[2];

    TreeMapNode(Comparable key, Object value) {
        itskey = key;
        itsValue = value;
    }

    public Object find(Comparable key) {
        System.out.println("[TreeMapNode] itsKey: " + itskey.toString());
        if (key.compareTo(itskey) == 0) {
            System.out.println("[TreeMapNode] itsKey is same");
            return itsValue;
        }

        System.out.println("[TreeMapNode] itsKey not same");
        return findSubNodeForKey(selectSubnode(key), key);
    }

    public Object findSubNodeForKey(int node, Comparable key) {
        return nodes[node] == null ? null : nodes[node].find(key);

    }

    private int selectSubnode(Comparable key) {
        return (key.compareTo(itskey) < 0) ? LESS : GREATER;
    }

    public void add(Comparable key, Object value) {
        if (key.compareTo(itskey) == 0) {
            itsValue = value;
        } else {
            addSubNode(selectSubnode(key), key, value);
        }
    }

    private void addSubNode(int node, Comparable key, Object value) {
        if (nodes[node] == null) {
            nodes[node] = new TreeMapNode(key, value);
        } else {
            nodes[node].add(key, value);
        }

    }
}
