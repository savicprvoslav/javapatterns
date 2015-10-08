package structural.adapter;

/**
 * 
 * @author prvoslav
 * 
 * Old knight that does not implement Knight interface there fore it can not be used correctly
 *
 */
public class OldKnight {

    private String sirsName = "Old Knight is my name.";
    private String sirsWeapon;

    public void setSirsName(String sirsName) {
	this.sirsName = sirsName;
    }

    public String getSirsName() {
	return sirsName;
    }

    public String getSirsWeapon() {
	return sirsWeapon;
    }

    public void setSirsWeapon(String sirsWeapon) {
	this.sirsWeapon = sirsWeapon;
    }

    @Override
    public String toString() {
	return "OldKnight [sirsName=" + sirsName + ", sirsWeapon=" + sirsWeapon + "]";
    }

}
