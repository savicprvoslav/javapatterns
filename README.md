
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
Builder pattern allows us to separate creation of the object from its representation. KnightBuilder allows us to easily create knights using one of two methods createFightingHolyKnight and createFightingMajesticKnight. Builder pattern can be also a singleton.

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
## Composite
## Decorator
## Private class data
## Proxy

# Behavioral patterns
## Command
## Memento
## Mediator
## Null object
## Observer
## Visitor
## Chain of responsibility 



