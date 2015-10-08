package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

import model.Knight;

/**
 * 
 * @author prvoslav
 *
 *         Central point where Knight can send a quest to other knight, all
 *         knights have reference to this central point ( mediator)
 */
public class MedevilPostOffice {

    private Map<Integer, Knight> medevilAddressBook = new HashMap<Integer, Knight>();

    public void addToAddressBook(Integer palaceNumber, Knight knight) {
	medevilAddressBook.put(palaceNumber, knight);
    }

    public void sendQuest(Integer palaceNumber, String questDetails) {
	medevilAddressBook.get(palaceNumber).readQuest(questDetails);
    }

}
