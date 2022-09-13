Here, we have write a function that works as a currency converter. In our case we try to convert out native cureency different others currencies .Such as
BDT -----> INR
BDT -----> USD 
---------------
In our first attempt, we create different class for different conversion. For bdt to INR conversion we have used function called BDTtoINR() and at the same time for bdt to usd conversion we have used BdtTo Usd() conversiont function. And the create object of both function inside the currecncy converter and call both of the function. And print the output. 
1. Create three different class in below
![image](https://user-images.githubusercontent.com/75389185/189792357-12cf8466-66e6-46b7-9b5f-9ab219377fcc.png)
2. Body of those classes 
 (i) bdttoinr
 ![image](https://user-images.githubusercontent.com/75389185/189792505-ee496fb0-4cb3-40a2-86f8-354ec5d7850a.png)
(ii)BdtToUsd
![image](https://user-images.githubusercontent.com/75389185/189792593-d7ceb378-f9f3-4f27-abe6-d0dc04f5c69c.png)
(iii)Converter 
![image](https://user-images.githubusercontent.com/75389185/189792709-4eccac43-e455-4d07-bc59-9434edad6d72.png)
(iv) output 
![image](https://user-images.githubusercontent.com/75389185/189792763-868d05f6-7037-4108-b2a1-9c89c4f49532.png)


IF we add more conversion function?!!!!! 
We need to create different function. And then also create different object for those class. Which is versy much costly. In order avoid this, we try to minimize the code. 

WE have try to write to conversion in the same class. Then we create object of this class throug this object we call those function. Yes, it will reduce some complexit. If new class is added we will create new function in the currecconconversion method section.  And then call the function with required parameters. 
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

