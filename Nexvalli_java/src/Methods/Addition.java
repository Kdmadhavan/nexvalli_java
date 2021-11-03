package Methods;

public class Addition {
        //Declare two instance variables
	int a=10;
	int b=20;
	//System.out.println(a+b)//it is  invlaid syntax because inside the class, we cannot write directly the business logic of the application
	//Declaration of instance method
	static void add( ){//no parameter 
		//write the logic of adding two number and print it in the colsole
		System.out.println(a+b);
	}
	public static void main(String[] args) {
         //Addition a=new Addition();//object creation
         add();//calling the method 
	}

}
