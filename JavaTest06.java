2)public class Love {

	public static boolean flowersPetals(int flower1Petals, int flower2Petals) {
		return false;
		
	}
	
	    public static void main(String[] args) {

	        Scanner flower1 = new Scanner(System.in);
	        Scanner flower2 = new Scanner(System.in);

	        System.out.print("Enter a number of petals: ");
	        int num1 = flower1.nextInt();
	        int num2 = flower2.nextInt();
	        flowersPetals(num1,num2);
	        
	        if(num1%2==0 && num2%2==0) {
	        	System.out.println("They are not in love");
	        }else {
	        	System.out.println("They are in love");
	        }
	    }
	}


4.A)We can also stop a class to be extended/inherited by other classes in Java by
 making the class constructor private. If we make the class constructor private 
 we'll not be able to create the object of this class from outside of this class

4.C) Delegation can be an alternative to inheritance. Delegation means that you
 use an object of another class as an instance variable, and forward messages to
 the instance
 
 
 4.B) few example of final classes defined in java 
  --java.lang, string,
 java.lang.math are final
 classes.
 
 6.linkedeList and ArrayList
 ->ArrayList: - ArrayList internally use array
			  -ArrayList  are faster in read operations
			  - Arrylist are slower in write operations 
	
->LinkedList:-LinkedList internally use node
			-LinkedList are slowerin read operations
			-LinkedList are faster in write operations


3)Generalised and specialised classes
	Generalisation :
		Converting a sub class type into a super class type is called Generalisation.
		because we are making the subclass to become more general and its scope is widening.
	Specialisation :
	   Converting a super class type into sub class type is called Specialisation.
	   it is also called as norrowing.
	   
 1)Public Class MinMax{
	public static void main(String args[])
    {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
  
        
        arr.add(10);
        arr.add(20);
        arr.add(5);
        arr.add(8);
  
       
        int n = arr.size();
  
        
        System.out.println("ArrayList elements are :");
  
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
  
        System.out.println();
  
        
  
        int max = Collections.max(arr);
        System.out.println("Maximum is : " + max);
  
        int min = Collections.min(arr);
        System.out.println("Minimum is : " + min);
    }
}

5)sort() method is present in java. util. Collections class.
 It is used to sort the elements present in the specified list of Collection in 
 ascending order.
 
 7)ListIterator:
	ListIterator can traverse the elements in a collection in forward as well as the backwards direction.
	ListIterator can traverse List objects only.
	ListIteror can add elements to a collection.
	ListIterator can modify the elements in a collection using set().
	Using ListIterator,we can obtain an index of the element in a collection.
	
	Iterator:
	Iterator can traverse the elements in a collection only in forward direction.
	Iterator can traverse Map, List and Set.
	AIterator is unable to add elements to a collection.
	Iterator can not modify the elements in a collection.
    Iterator has no method to obtain an index of the element in a collection.

9)A Memory Leak is a situation where there are objects present in the heap that 
are no longer used, but the garbage collector is unable to remove them from memory, 
and therefore, they're unnecessarily maintained. A memory leak is bad because it blocks
 memory resources and degrades system performance over time.
 
 8)The covariant method overriding approach, implemented in Java 5, helps to remove
 the client-side typecasting by enabling you to return a subtype of the overridden 
 method's actual return type. Covariant Method overriding means that when overriding
 a method in the child class, the return type may vary.
 
 
 10) static polymorphism
 -static polymorphism is nothing but complile time polymorphism.
 -the proces of calling a method at complile time is called compliletime polymorphism.
 -static polymorphism is also called stack binding , early binding and overlooding
 -overlooding  is performed with in the class.
 -overlooding used to incress the readablity of the program.
  - in method overlooding is must be change in parameter,
  - method  is exucuted quite earlyer but provide fast exucusion.
  
  Dynamic polymorphism
  -dynamic polymorphism is nothing but run time polymorphism.
  -the proces of calling a method at run time is called run time polymorphism.
  -Dynamic polymorphism is also called late binding , curly binding and overriding
  -overlooding  is performed with two classes have IS-A relationShip.
-in method overriding parameter must be same

11)She can give security for her programs by making  properties as privite and providing
	access by setter and getter methos and this also called as encapsulatiom so she can give
	security for her programs. or she can use the property of the Oops called Abstract calss
	she can give security.  
 
 
