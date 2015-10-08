package behavioral.mediator;

public class Main {
    public static void main(String[] args) {

	MedevilPostOffice medevilPostOffice = new MedevilPostOffice();

	MediatorKnight knight = new MediatorHolyKnight(medevilPostOffice);
	MediatorKnight knight1 = new MediatorHolyKnight(medevilPostOffice);
	MediatorKnight knight2 = new MediatorHolyKnight(medevilPostOffice);

	// mediator needs to know about knights
	medevilPostOffice.addToAddressBook(1, knight);
	medevilPostOffice.addToAddressBook(2, knight1);
	medevilPostOffice.addToAddressBook(3, knight2);

	// send quest to one of the knights
	knight.sendQuest();
	// Sending knight to : 3
	// QUEST: This is your quest :)
    }
}
