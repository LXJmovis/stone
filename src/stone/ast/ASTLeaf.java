package stone.ast;

import java.util.ArrayList;
import java.util.Iterator;

import stone.Token;

/**
 * @author movis
 * @date 2018-07-24
 */
public class ASTLeaf extends ASTree {

    private static ArrayList<ASTree> empty = new ArrayList<ASTree>();
    protected Token token;

    public ASTLeaf(Token t) {
        token = t;
    }

    public ASTLeaf child(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int numChildren() {
        return 0;
    }

    public Iterator<ASTree> children() {
        return empty.iterator();
    }

    public String toString() {
        return token.getText();
    }

    public String location() {
        return "at line " + token.getLineNumber();
    }

    public Token token() {
        return token;
    }
}
