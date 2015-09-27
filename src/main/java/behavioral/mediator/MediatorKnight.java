package behavioral.mediator;

import model.Knight;

public interface MediatorKnight extends Knight {

    void receiveQuest(String quest);

    void sendQuest();
}
