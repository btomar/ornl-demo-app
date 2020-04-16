# ornl-demo-app

This is a demo app which demonstrates use of simple POJOS to exhibit composition, inheritance, interface and data structures to enable adding and removing a product into shopping cart. The product is implemented as a composite of different items. 

## Build Instructions

This project can be imported into an IDE like IntelliJ Idea or Eclipse or even built from the cli using maven
Just use 
```
mvn clean install
```

Tests are written in JUnit

### Tests

Tests can be compiled and executed using
```
mvn test
```

### Cleaning

The build tree can be cleaned with
```
mvn clean
```

## Execution

```
java -jar ORNLDemoApp-1.0-SNAPSHOT.jar
```

## Documentation

All classes are documented using JavaDoc annotations..

## Sample Output after run
Welcome to the PC Shop!

Total cost of the PC is 735.0
After adding item
ShoppingCart{list={PersonalComputer{theCase=Case{powerSupply='65W', dimensions=Dimensions{width=10, height=4, depth=6}}, monitor=Monitor{size=24, nativeResolution=Resolution{width=1024, height=768}}, motherboard=Motherboard{ramSlots=4, cardSlots=2, bios='Intel'}, processor=Processor{speed='4.0GHz', NumOfCores='8'}, memory=Memory{capacity='32GB'}, storage=Storage{capacity='1TB', type='HDD'}}=1}}
After removing item
ShoppingCart{list={}}


