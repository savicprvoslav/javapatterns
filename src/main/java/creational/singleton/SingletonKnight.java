package creational.singleton;

/**
 * 
 * @author prvoslav
 *
 */
public class SingletonKnight {

    private static SingletonKnight knight;

    private Integer count = 0;

    public void increaseCount() {
	count++;
    }

    public Integer getCount() {
	return count;
    }

    private SingletonKnight() {

    }

    public static SingletonKnight getIntance() {
	if (knight == null) {
	    knight = new SingletonKnight();
	}

	return knight;
    }

}
