package stone.ast;

import stone.Token;

/**
 * @author movis
 * @date 2018-07-24
 */
public class Name extends ASTLeaf {

    public Name(Token t) {
        super(t);
    }

    public String name() {
        return token().getText();
    }
}
