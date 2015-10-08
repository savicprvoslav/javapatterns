package behavioral.mediator;

import model.HolyKnight;

/**
 * 
 * @author prvoslav
 * 
 * Implementation of HolyKnight with MediatorKnight quest abilities
 */
public class MediatorHolyKnight extends HolyKnight implements MediatorKnight {

    private MedevilPostOffice medevilPostOffice = null;

    public MediatorHolyKnight(MedevilPostOffice medevilPostOffice) {
	this.medevilPostOffice = medevilPostOffice;
    }

    public void receiveQuest(String quest) {
	System.out.println("	Quest :" + quest);
    }

    public void sendQuest() {
	String quest = "This is your quest :)";
	Integer address = 3;
	System.out.println("Sending knight to : " + address);
	medevilPostOffice.sendQuest(address, quest);
    }

}
