package stone.ast;

import java.util.Iterator;

/**
 * @author movis
 * @date 2018-07-24
 */
public abstract class ASTree implements Iterable<ASTree> {

    public abstract ASTree child(int i);    // get child node "i"

    public abstract int numChildren(); // get the number of child nodes

    public abstract Iterator<ASTree> children();    // get the iterator which use to look through its child nodes

    public abstract String location();  // get the node's location 

    public Iterator<ASTree> iterator() {    // to change a ASTree to an iterator
        return children();
    }

}
