# Classes and Objects

In real world, we can find many objects around us. ll these objects have some state and behavior. If we consider a car, then its states are **name**, **speed**, and **fuel**, and the behavior is **refuel**, **drive**, and **park.**
### Defination:
1. Class is a set of object which shares common characteristics/ behavior and common properties/ attributes.  
2. Class is not a real world entity. It is just a template or blueprint or prototype from which objects are created.  
3. Class does not occupy memory.
![image](https://user-images.githubusercontent.com/75389185/200157009-7aed52a4-6276-4a0f-aa7c-2d7eb280f090.png)

### ### Fields
This is known as **member variable**.  As they contain information about the class.
### Methods
use to perform operations using the fields variable.

The concept of classes allows us to create complex objects and applications in Java. This is why classes are the basic building blocks behind all of the OOP’s principles .
```
Private    
cannot be accessed directly from the outside of the class.It is used to keep the variable or methods hidden from the users. 

Public
It can access anywhere.As it provides the interface through which it can access the private member through this interface.
'''
class private_class {

   private  int val;  // Private variable

   public  int getVal(){

        return val;  // The private variable is directly accessible over here!

}

}

Protected

This category is unique. This stay inside the private and public class. This tag is mainly used at the time of inheritance. This is the process of creating a class outside the package. Protected data members can be used inside the package.However, outside the package, they can only be referred to through an inherited class.

Here we used two packages P1 and P2. We can access the protected class outside the package throw the inherited class.

`package` `p1;`

`// Class A`

`public` `class` `A {`

`protected` `void` `display()`

`{`

`System.out.println(``"Protected class"``);`

`}`

`}`

`package` `p2;`

`// import all classes in package p1`

`import` `p1.*;`

`// Class B is a subclass of A`

`class` `B` `extends` `A {`

`public` `static` `void` `main(String args[])`

`{`

`B obj =` `new` `B();`

`obj.display();`

`}`

`}`
'''
OUTPUT:
protected class
```
Static vs Non-static:
 - Static fields reside inside the class on the other hand non-static fields reside inside the instance.
 - To access the static field, we can use the class itself. But for accessing the non-static field we have to create an instance of the class. 
           Static field code:
        
        class Car {   
           static  int maxCapacity =  4;    
           static String color =  "green";
           }
        class Demo {
            public  static  void main(String args[]){
    
        System.out.println(Car.topSpeed);
        
        System.out.println(Car.maxCapacity);
        
        System.out.println(Car.color);
        
        }
    
        }

  
  Code of nonstatic example:
  ```
  class Car {

// static fields

int speed =  100;

int capacity =  4;

static String color =  "green";

}

  

class Demo {

public  static  void main(String args[]){

Car obj1 =  new Car();

System.out.println(obj1.speed);

System.out.println(obj1.capacity);

System.out.println(obj1.color);

}

}
  ```

Another field name **final** fields, use some cases to avoid assigning.

## Question:
1. Define a java class occupy any memory?
    1. Yes
    2. No
2. What happens when defining a class?
     1. It will occupy a memory.
     2. It will just save files on your hard drive.
     3.  Memorylocation will be occupied.
     4. None of the above.
 3. When you create objects does memory allocation takes place?
       1. Yes
       2. No
4. Why protected class used in java?
      1. Used class anywhere.
      2. Used only inside the package.
      3   .Used inside the package and can't access throw the outside class.
      4.  Used inside the package and can access throw the outside class by inherited.
 5. How can access non-static fields?
     1. Simply using the class itself.
     2. Create an instance of the class and then access it through this instance.
     3. Can not access this type of field.
     4. none of the above.