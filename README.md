# 33-OOP

OOP Conponents: Inheritance, Composition, Encapsulation, Polymorphism;   
Interfaces, Abstract Classes, Nested Classes.  
Constructors, this(), super(), Overloading, Overriding.  


**OOP Components**  4:   
-	 inheritance(is),   
-  composition(has),   
-	 encapsulation,  
-	 polymorphism    

(Interfaces - can)  

**Encapsulation** – restrict access to some components of the object, protect the member of a class from external access.  
**Polymorphism** – the method or the mechanism that allows actions to act differently based on the actual object that the action is being performed on. Subclasses of a superclass override a method and return different results depending on what subclass was used for the method.  

**Overloding**  
-  same class or  subclass     
-  same name,  different parameters,  
-  every overloaded method have a unique signature,   
- return type may or may not be different;

**Overriding**  
-  in chiled class  
-  same signature( name and arguments(parameters)),                         
-  same return type or covariant (subclass),   
-  @Overriding  
-  can not overriding static methods   



**Interfaces** 
(CAN : magic word) 
Interface specifies methods that a class that implements the interface must implement;  
The interface is abstract, is no actual code, you only supply the method name and the parameters.  
The idea is to create a common behavior for several classes that implement the interface.  
The interface is a commitment, a contract that ensure that the method signature and parameters will not change.  

Accesing method of the class depends on the declaration(if we declare interface or class). We must specify (or cast) the class type for the method that are only in the class.  

Interface vs inheritance:   
Animal superclass; Dog subclass, Bird subclass,  Walk interface, Fly interface (Not all animals can walk or fly).  
Dog is an animal, Dog can walk  -> extends(inherit from) Animal class, implements Walk interface.  
Bird is an animal, Bird can walk, Bird can fly - > extends Animal, implements Walk interface and Fly interface.  

**Abstract Classes**  
Abstract classes provide methods without implementation like inerfaces, but abstract classes can also have normal methods and costructor.  
Abstract classes cannot be instantiated even if they have constructor. The constructor can be used in subclasses using super().  
Abstract method must be implemented. We force the class that extend from the abstract class to implement the abstract methods.  
Interfaces are abstract.

**NESTED CLASSES**  
4 Types of nested classes  
-  static nested classes ---rar  
-  non-static nested classes = **inner class**  
-  local class = inner class defined inside of a scope block (method) ---rar 
-  **anonymous classes** = nested class without a class name.  


Anonymous classes are local classes without a class name(declared in the method parameter space())  they have to be declared and instantiated at the same time(new keyword) as the method parameter. They are used when the local class is required only once.  

Inner classes - has a – relationship.   
Instances of an inner class have access to members of class that contain it even if they are declared private.  
Instantiate inner Gear class that is inside Gearbox class:  
-  To instantiate a inner class we mast have firs an instance of outer class and use it. The inner class will belong to an instance of the outer class.  
-  If the inner class is public we can use following code:  
      -  Gearbox mcLaren = new Gearbox(6);  
      -  Gearbox.Gear first = mcLaren.new Gear(1, 12.3);  
-  Else if inner class is private we can access it throw outer class public methods. In general inner class will be private.  

Notes:  
Object:    
-  State – fields   
-  Behavior - methods  

Class: template, blueprint for creating objects.  
A Object is an Instance of a class.  

Local variables = method variables  – inside a method      
Member variables = class variables = fields.     
When creating a field you must specify the access modifier(public, private…)  




[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)
