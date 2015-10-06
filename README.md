
# Implementation of patterns in java. 

Lets try to put all patterns in one place, implementing them in java by creating Knights of Holy light and Majestic ones that will embark on a quests to save the world from all that is dark and evil. 

Join in our quest of saving the world using nothing but emagination and java.


#Creational patterns

## Abstract factory
 Abstract factory allows us to create a families of objects, in this case we have two families of knights a Majestic and holy ones. 
 In the example I have created a Family interface with two imlementations HolyFactory and MajesticFactory. Witch factory is used is decided in FamilyProducer.
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
## Factory method
## Prototype
## Singleton

#Strunctural patterns

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



