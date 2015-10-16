
# Implementation of patterns in java. 

Lets try to put all patterns in one place, implementing them in java by creating Knights of Holy light and Majestic ones that will embark on a quests to save the world from all that is dark and evil. 

Join in our quest of saving the world using nothing but emagination and java.


#Creational patterns

## Abstract factory
 Abstract factory allows us to create a families of objects, in this case we have two families of knights Majestic and Holy ones. 
 In the example I have created a Family interface with two imlementations HolyFactory and MajesticFactory. Which factory is used is decided in FamilyProducer.
 
 ```
  public class FactoryProducer {

    public static Factory getFactory(KnightFamily family) {
	    if (KnightFamily.HOLY.equals(family)) {
	      return new HolyFactory();
    	} else if (KnightFamily.MAJESTIC.equals(family)) {
	      return new MajesticFactory();
	    }
  	return null;
  }
}
 ```
 In the main method we have :
```
  Factory factory = FactoryProducer.getFactory(KnightFamily.MAJESTIC);
	Knight knight = factory.getKnight();// Knight is MajesticKnight
```

## Builder
Builder pattern allows us to separate creation of the object from its representation. KnightBuilder allows us to easily create knights using one of two methods createFightingHolyKnight and createFightingMajesticKnight. BuKnightBuilder can be also a singleton.

## Factory method
Factory method pattern has one factory interface and several implementations depending of the imlementation that we are using different family of knights is created.

## Prototype
Prototype pattern is nice  when we have a limited set of items that we are creating all the time. In this case we have few types of knights that instead of creating them all the time with new MajesticKnight we just clone them from prototypeFactory.

```
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
```

## Singleton
Singletone pattern enables a class to have only one instance of the object. This is done by setting contructor to private and having a static reference of the same type with static method getInstance.
```
public class SingletonKnight {

    private static SingletonKnight knight;
    ...
    /**
     * Private contructor
     */
    private SingletonKnight() {

    }

    public static SingletonKnight getIntance() {
	if (knight == null) {
	    knight = new SingletonKnight();
	}

	return knight;
    }
```

#Structural patterns

## Adapter
Adapter allows a developer to adapt old class that does not fit right in the new model. In this example we have OldKnight that does not implement Knight interface and that misses a few knightly features, it has only a name and a weapon properties. 

Adapter is demonstrated by a class KnightAdapter and implements Knight interface and that holds a instance of OldKnight, each knight method is implemented and where it is suitable OldKnight method is called. Here is the relevand code.
```
public class KnightAdapter implements Knight, Cloneable {

    private OldKnight knight = null;

    public KnightAdapter() {
	knight = new OldKnight();
    }

    public String getName() {
	return knight.getSirsName();
    }

    public void setWeapon(KnightWeapon knightWeapon) {
	knight.setSirsWeapon(knightWeapon.name());
    }

    public Knight cloneKnight() throws CloneNotSupportedException {
	return (Knight) super.clone();
    }

    public Integer getDamage() {
	return 0;
    }
```


## Composite

Composite is a nice pattern that allows a developer to represent an element that has a list of subelements. In this case we have a Knight and an KnightArmy. KnightArmy also implements Knight and has a list of Knights as a property.
```
public class KnightArmy implements Knight, Cloneable {

    private List<Knight> knights = new ArrayList<Knight>();
    private String armyName = null;

    public void addKnight(Knight knight) {
	knights.add(knight);
    }

    public void setWeapon(KnightWeapon knightWeapon) { // Army has the same weapon
	for (Knight knight : knights) {
	    knight.setWeapon(knightWeapon);
	}
    }

    public Integer getDamage() {//Army demage is calculated 
	Integer totalDamage = 0;
	for (Knight knight : knights) {
	    totalDamage += knight.getDamage();
	}

	return totalDamage;
    }
```

## Decorator

Decorating is the way to give the class a new skin, in this example we have created a writter that writes every knights move. Decorator accepts the Knight in the contructor and calls its methods but it also adds something new before and/or after it. 

```
public class KnightWriter implements Knight {

    private Knight knight;

    public KnightWriter(Knight knight) { //constructor that has Knight as a parameter
	this.knight = knight;
    }

    public String getName() {
	System.out.println("Knight has been asked for the name");
	return knight.getName();
    }

    public void setWeapon(KnightWeapon knightWeapon) {
	System.out.println("Knight has given his weapon.");
	knight.setWeapon(knightWeapon);
    }
```

## Private class data
Private class data can act as a protector to other class, to disallow calls to ie setters. Here we have PrivateHolyKnight class that disallows other knights methods and does not allow setting the properties.

```
public class PrivateHolyKnight {

    private Knight knight = null;

    public PrivateHolyKnight(KnightWeapon knightWeapon) {
	knight = new HolyKnight();
	knight.setWeapon(knightWeapon);
    }

    public String getName() {
	return knight.getName();
    }

    public Integer getDamage() {
	return knight.getDamage();
    }

}
```



## Proxy
Proxy pattern allows to have a wrapper around complicated class, to make it easier to use or to limit the access. Also it can delay the creation of the object until it is actually needed. 
Here have have a complicated knight that takes time to summon in the morning, so knight is created before it is needed.

```
public class MajesticKnightProxy implements Knight {

    private Knight knight = null;

    private Knight getKnight() {
	if (knight == null) {
	    System.out.println("On Request knight creation ...");
	    knight = new MajesticKnight();
	}
	return knight;
    }

    public String getName() {
	return getKnight().getName();
    }
    ...
```

# Behavioral patterns
## Command
## Memento
## Mediator
## Null object
## Observer
## Visitor
## Chain of responsibility 



