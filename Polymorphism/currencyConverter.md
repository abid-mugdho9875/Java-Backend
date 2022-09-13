Here, we have write a function that works as a currency converter. In our case we try to convert out native cureency different others currencies .Such as

- BDT -----> INR
- BDT -----> USD

---

In our first attempt, we create different class for different conversion. For bdt to INR conversion we have used function called BDTtoINR() and at the same time for bdt to usd conversion we have used BdtTo Usd() conversiont function. And the create object of both function inside the currecncy converter and call both of the function. And print the output.


1. Create three different class in below

   ![image](https://user-images.githubusercontent.com/75389185/189792357-12cf8466-66e6-46b7-9b5f-9ab219377fcc.png)

2. Body of those classes

   (i) BdttoInr

   ![image](https://user-images.githubusercontent.com/75389185/189792505-ee496fb0-4cb3-40a2-86f8-354ec5d7850a.png)

   (ii)BdtToUsd

   ![image](https://user-images.githubusercontent.com/75389185/189792593-d7ceb378-f9f3-4f27-abe6-d0dc04f5c69c.png)

   (iii)Converter

   ![image](https://user-images.githubusercontent.com/75389185/189792709-4eccac43-e455-4d07-bc59-9434edad6d72.png)

   (iv) output

   ![image](https://user-images.githubusercontent.com/75389185/189792763-868d05f6-7037-4108-b2a1-9c89c4f49532.png)


IF we add more conversion function?!!!!!

We need to create different function. And then also create different object for those class. Which is versy much costly. In order avoid this, we try to minimize the code.


WE have try to write to conversion in the same class. Then we create object of this class throug this object we call those function. Yes, it will reduce some complexit. If new class is added we will create new function in the currecconconversion method section. And then call the function with required parameters.


1. Create two class one for CurrencyConversionMethod and another for calling those method.

   ![image](https://user-images.githubusercontent.com/75389185/189795369-850cd547-09bf-43f4-9e8e-f4b4fa0ab844.png)

   
   ![image](https://user-images.githubusercontent.com/75389185/189795858-a09f9499-4621-4937-978a-26ec8438523f.png)

2. Convert class call those conversion function with required parameters.

   ![image](https://user-images.githubusercontent.com/75389185/189795959-4751c21b-d31f-4277-82c3-736ffc8e8443.png)

3. Results

   ![image](https://user-images.githubusercontent.com/75389185/189796003-2d415f73-a50a-4349-9adb-3c0d5099005c.png)

Again we will try to increase the readility to our code. So, we have created function which have takes two parameter. One amount and type of conversion such as USD , INR. Then it mathces with the inner function and return some output value. In that case we never called function using object.

1. Create function Covert that takes two parameters and return result after calculation.

   ![image](https://user-images.githubusercontent.com/75389185/189799408-4de83bd4-283c-43e6-bf59-e7d064cd2a7e.png)


But in this case, the code is so much messy due to if else condition. And not usable in practical scenarion. We again try to increase the readability of the code. And then use it.
Again we try another process. We have created one Coverter function which is extends by USACurrencyConverter class and also INRCurrencyConverter. And then we create function object of converter class and then call the child conversion class to success our operation. 

1. Create another package which consist of four different class.


![image](https://user-images.githubusercontent.com/75389185/189886478-ebdb416d-a556-466d-afe4-a5a1454bde56.png)


2. Converter class which is extended by others class.



![image](https://user-images.githubusercontent.com/75389185/189886812-932613d6-746c-4bad-921d-26dc8aa56be8.png)



3.  Two currency conversion class


![image](https://user-images.githubusercontent.com/75389185/189887108-78766aa8-39bf-4a61-950b-39a3f3835768.png)



![image](https://user-images.githubusercontent.com/75389185/189887303-646d1001-d718-41b8-bebb-56f4fba61dd9.png)


4. Main function . Here, at first create object of Converter class then calls the others function conversion function as per our need.


![image](https://user-images.githubusercontent.com/75389185/189887303-646d1001-d718-41b8-bebb-56f4fba61dd9.png)


Here, if we see the above screenshot we found that we don't need create object of currency conversion . So, inorder to stop it we use abstract class and abstract method. This method are overwrite by childrean class. 

1. Create abstract class


![image](https://user-images.githubusercontent.com/75389185/189888393-6c2f43db-cdc1-424e-b49e-e380c953606c.png)


2. Changes in main function

![image](https://user-images.githubusercontent.com/75389185/189889625-f899a7be-7629-448b-9c09-162626ada00f.png)


Here, we have introduced java factory design pattern!!! It is mainly talks about the object creation. To implement this,
- Define a factory method inside an interface.
- Let the subclass extends  the above factory method and decides which object to create. 
- In Java, constructors are not polymorphic, but by allowing subclass to create an object, we are adding polymorphic behavior to the instantiation. In short, we are trying to achieve Pseudo polymorphism by letting the subclass to decide what to create, and so this Factory method is also called a virtual constructor.

--------In our case -------------
We create parent class converter which is extended by the various subclass they are USDCurrencyConvertion and INRCurrency conversion. Let we create an factory class that's create the necessary object for our problem.
1. Factory Converter class to create object

![image](https://user-images.githubusercontent.com/75389185/189903316-571d3a11-8634-45b2-8ddd-b8e99b1d1ef2.png)


2. Based on the object creation call specific convert function.

- converterFactory factory  = new converterFactory();  //Create object from the convertcurrencyfactory

-  Converter converter =  factory.createCurrencyObject(type);  //using this factory object create

- System.out.println(converter.convert(amount));  //based on the object creation call this convert functio

![image](https://user-images.githubusercontent.com/75389185/189903774-ab207f27-6d43-4270-8f94-d24c6c043f50.png)


Now suppose we want add new method to BDT to Euro Conversion. And for this , we first crate necessary function for conversion. And add it to the currencyConvertionFactory!!!!That's a super flexibility!!!
1. Creation of EuroConvertion Method

![image](https://user-images.githubusercontent.com/75389185/189904905-42f67de7-64d8-48c6-b138-671f82b01e05.png)

2. Add this in the factory conversion class

![image](https://user-images.githubusercontent.com/75389185/189906730-0e538371-1cfe-4d0e-9af4-5038fefe2e1a.png)

3. Now we con do our BDT to EURO Conversion.


![image](https://user-images.githubusercontent.com/75389185/189907860-a923eb62-94ae-4929-8e1e-15d864a66c84.png)



Result :

![image](https://user-images.githubusercontent.com/75389185/189908019-53c06640-c8e6-4737-9b98-fb8f7061547a.png)



----------------------Thank You -----------------------------
