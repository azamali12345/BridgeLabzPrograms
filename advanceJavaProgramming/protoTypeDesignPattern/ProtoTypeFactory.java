package advanceJavaProgramming.protoTypeDesignPattern;
import java.util.HashMap;
import java.util.Map;
class ProtoTypeFactory
{
    public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }
    private static Map<String , ProtoTypeCapable> prototypes = new HashMap<String , ProtoTypeCapable>();
 
    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }
 
    public static ProtoTypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((ProtoTypeCapable) prototypes.get(s)).clone();
    }
}
