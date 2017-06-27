package main.java.sample.treemap;

/**
 * Created by shinkook.kim on 2017-06-27.
 */
public class TreeMap {
    TreeMapNode topNode = null;

    public void add(Comparable key, Object value) {
        if (topNode == null) {
            topNode = new TreeMapNode(key, value);
        } else {
            topNode.add(key, value);
        }
    }

    public Object get(Comparable key) {
        return topNode == null ? null : topNode.find(key);
    }

}
