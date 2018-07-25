package stone;

import stone.ast.ASTree;

/**
 * @author movis
 * @date 2018-07-24
 */
public class StoneException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StoneException(String m) {
        super(m);
    }

    public StoneException(String m, ASTree t) {
        super(m + "" + t.location());
    }
}
