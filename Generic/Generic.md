Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.


 If we don't use Generics we have to duplicate code. We have to create same function for different data type for different datatype.We try to understand it thorugh example in below.

 1. Create function which can take integer  as well as double datatype. Without Generic same function create two times with different data types.


 ![image](https://user-images.githubusercontent.com/75389185/190866030-43791969-5118-49a9-9437-4a39bad5e059.png) 

 ![image](https://user-images.githubusercontent.com/75389185/190866052-84bda24b-dbf8-42f7-90ce-9c63e4b62754.png)


 2.  Then create object fot this class individually.


 ![image](https://user-images.githubusercontent.com/75389185/190866113-e904e24d-0104-4acf-9c5a-be399d4cc656.png)


 3. If Generic is used in this case , we can create one function and use it for different data types.


 ![image](https://user-images.githubusercontent.com/75389185/190866172-0928ded0-68d3-4338-91de-c70d7bc54977.png)
 


 Here, creater generic function which can take only number class object!!!! We can use it for several different class object also.
 Suppose, Try to print speed of the 'carclass'. So, Create Generic function which can tak car class object as a input.


 1. Car  calss extends carmain class

![image](https://user-images.githubusercontent.com/75389185/190866327-591f78ca-97fd-405a-a5a9-88291efe350c.png)

![image](https://user-images.githubusercontent.com/75389185/190866358-97528229-1245-439d-a706-1f9c8915dbd2.png)


2. Generic printer class which take car class object as a input.


![image](https://user-images.githubusercontent.com/75389185/190866379-b0169934-4597-4c73-8b00-6a128c3b8a1f.png)

If you try to push any thing beyond this specefic class. We got an runtime error.
![image](https://user-images.githubusercontent.com/75389185/190866471-15b9ae6b-72c9-420b-ba95-d425847ef9d8.png)


Here,we try to push truck class. Which is not recoginzed by our generic printer.



We try to undersatnd another beautiful example regarding this topic.

We have an animal class which is extended by Cat and Dog class.

1. Animal class

![image](https://user-images.githubusercontent.com/75389185/190866583-73c57268-4eb7-4b16-bf66-9cbbbc05927d.png)


2. Cat and Dog class extended this Animal class

![image](https://user-images.githubusercontent.com/75389185/190866638-1e3b8d5e-6719-4bc0-9b1b-3b0d1e4c42e1.png)

![image](https://user-images.githubusercontent.com/75389185/190866650-a7781997-90b7-4ed1-b09f-0022ac6a5616.png)


We can see that this two class override Animal class object.
We try to restrict the animal types here. Others object which are not the object of animal class does n't be used in this case. We have tried two method one without generic and another method is used by generic.

Without generic, we have created house class.

![image](https://user-images.githubusercontent.com/75389185/190866823-17540e8a-204f-472e-9589-f3deb6dff4e3.png)

In house class, we have try to implement two method. 
(i)At frist method, we have used downcasting(Which is not good practise to use). It restrict the object passes which is not animal class object. But it does it at the executing time not run time. 

![image](https://user-images.githubusercontent.com/75389185/190867082-7e2c3539-f153-4778-b990-3711b657acf3.png)

Tested double object. we see that it does not given any hints at the runtime. But after execution we get that detects it as error.

![image](https://user-images.githubusercontent.com/75389185/190867170-86f526f8-b211-4be3-b0bf-d509bcbf3bb1.png)

(ii)At second method we have used direct class object in the method declaration. We have used upcasting. 

![image](https://user-images.githubusercontent.com/75389185/190867381-f248580b-d1ff-4592-bd9e-83ecb9972401.png)

![image](https://user-images.githubusercontent.com/75389185/190867470-5d5bd525-1d8f-4769-bf50-ecb0acf3b44b.png)

Here, we have tried to pass integer object and we get an execution time error.

![image](https://user-images.githubusercontent.com/75389185/190867923-43bb7852-021c-48e6-bada-84f79c3da4ab.png)

In order to solve this issues, we have used Generic house class name AnimalHouse.

![image](https://user-images.githubusercontent.com/75389185/190868090-e00feccc-3497-49b9-86b8-862a0def415c.png)

Here, AnimalHouse <T extends  Animal > , Extends Animal class and take only Animal type object. 

Now, We can find error in runtime if we give different object type.

![image](https://user-images.githubusercontent.com/75389185/190868253-4c1d7aaf-c869-4c27-bcdf-bf9498aec725.png)
Here, red cross onidicate runtime error. 

We can also give two dofferent class separately.

![image](https://user-images.githubusercontent.com/75389185/190868324-bab89648-ebcb-4357-9076-2b6b2fb6fb7b.png)

Final Result :


![image](https://user-images.githubusercontent.com/75389185/190868349-84d68855-79c7-41a0-9d33-99eda802ccce.png)


-----------------------Thank You -----------------