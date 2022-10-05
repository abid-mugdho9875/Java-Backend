# FrontController Design Pattern

All the different types of request comes in the application are handle by single  handler and then it is dispatched through the specefic handler. It is mainly used to refine the structure of an application. 



![image](https://user-images.githubusercontent.com/75389185/194072888-7c10d7e7-2b0a-4480-8a5e-72b540ffbaf9.png)



1. 'Front End controller' recieves request from the client and authenticate it. Then forward it through the dispatcher.
2. Dispatcher determines the types of the request and then forward it thhrough specefic handler.
3. Handler updates the view. And then views shows the result for request.

 Frontcontroller ---> Dispatcher ---> Handler ----> view
 creating object and call the class


 class FrontControllerPattern {
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		ctrl.forwardRequest("authentic", "pay bills");
	}
}

// Controller:
class Controller{
	private Dispatcher myDispatcher;
	
	public Controller(){
		myDispatcher = new Dispatcher();
	}
	public void forwardRequest(String u, String req) {
		if(authUser(u))
			myDispatcher.dispatch(req);
	}
	private boolean authUser(String user) {
		if(user.equalsIgnoreCase("authentic"))
			return true;
		else
			return false;
	}
}

// Dispatcher:
class Dispatcher{
	Handler1 handler1;
	Handler2 handler2;
	Handler3 handler3;
	
	Dispatcher(){
		handler1 = new Handler1();
		handler2 = new Handler2();
		handler3 = new Handler3();
	}
	public void dispatch(String req) {
		if(req.equalsIgnoreCase("pay bills"))
			handler1.updateView();
		else if(req.equalsIgnoreCase("update Username"))
			handler2.updateView();
		else if(req.equalsIgnoreCase("change password"))
			handler3.updateView();
		else
			System.out.println("Invalid request!");
	}
}

// Handlers:

class Handler1{
	View1 view1;
	
	public Handler1() {
		view1 = new View1();
	}
	public void updateView() {
		view1.update();
	}
}
class Handler2{
	View2 view2;
	
	public Handler2() {
		view2 = new View2();
	}
	public void updateView() {
		view2.update();
	}
}
class Handler3{
	View3 view3;
	
	public Handler3() {
		view3 = new View3();
	}
	public void updateView() {
		view3.update();
	}
}

// Views:

class View1{
	public void update() {
		System.out.println("Bills payed.");
	}
}
class View2{
	public void update() {
    System.out.println("Username updated.");
	}
}
class View3{
	public void update() {
    System.out.println("Password changed.");
	}
}
psvm{
    Controller controller = new Controller();
    controller.forwardRequest("authenticate", "passwordChange")
}

Output:

![image](https://user-images.githubusercontent.com/75389185/194074022-63d29d97-fab1-43c9-af78-6e2269cc81e2.png)
