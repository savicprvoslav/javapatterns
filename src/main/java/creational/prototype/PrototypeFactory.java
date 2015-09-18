package creational.prototype;

import java.util.HashMap;
import java.util.Map;

import model.Knight;

/**
 * 
 * @author prvoslav
 *
 */
public class PrototypeFactory {

    private static Map<String, Knight> prototypes = new HashMap<String, Knight>();

    public static void addPrototype(String key, Knight knight) {
	prototypes.put(key, knight);
    }

    public Knight getPrototype(String key) {
	if (!prototypes.containsKey(key)) {
	    throw new RuntimeException("Knight missing!");
	}

	try {
	    return prototypes.get(key).cloneKnight();
	} catch (CloneNotSupportedException e) {
	    throw new RuntimeException("Cloning failed.");
	}
    }

}
