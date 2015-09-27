package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

import model.Knight;

public class MedevilPostOffice {

    private Map<Integer, Knight> medevilAddressBook = new HashMap<Integer, Knight>();

    public void addToAddressBook(Integer palaceNumber, Knight knight) {
	medevilAddressBook.put(palaceNumber, knight);
    }

    public void sendQuest(Integer palaceNumber, String questDetails) {
	medevilAddressBook.get(palaceNumber).readQuest(questDetails);
    }

}
