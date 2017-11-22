package datascript.java;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class DataScript {

    static {
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("datascript.core"));
    }

    static IFn EMPTY_DB = Clojure.var("datascript.core", "empty-db");

    public static Database emptyDB() {
        return (Database) EMPTY_DB.invoke();
    }

}
