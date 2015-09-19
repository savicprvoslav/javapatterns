package creational.singleton;

/**
 * 
 * @author prvoslav
 *
 *         Singleton pattern test.
 * 
 *         In this test we are going to call singleton method twice and increase
 *         count by two.
 *
 */
public class Main {

    public static void main(String[] args) {
	Integer countStart = SingletonKnight.getIntance().getCount();

	SingletonKnight.getIntance().increaseCount();// count is one
	SingletonKnight.getIntance().increaseCount();// count is two

	Integer countEnd = SingletonKnight.getIntance().getCount();

	System.out.println(countStart + " " + countEnd);// 0 2
    }

}
