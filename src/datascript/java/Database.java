package datascript.java;

import java.util.List;

public interface Database {

    public Object entid(Object entityId);

    public Database with(List txData);

}
