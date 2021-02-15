  
import java.io.*; 
import java.util.*; 
  
class VectorExample {

public static Vector union (Vector firstVector, Vector secondVector){

if ((firstVector == null) && (secondVector == null))
{
	return null;
    
} else if ((firstVector.isEmpty()) &&  (secondVector.isEmpty()) )
{
	return new Vector();
}

// add all the elements of first vector
Vector output = new Vector (firstVector); 
Iterator itrVector = secondVector.iterator();
while (itrVector.hasNext())
{
Object obj = itrVector.next();
if (!firstVector.contains (obj))
{
// add the element if it not present in the first vector
output.add (obj);
}
}
return output;
}
    
    public static void main(String[] args) 
    { 
        // Size of the Vector 
        int n = 5; 
  
        // Declaring the Vector with 
        // initial size n 
        Vector<Integer> v1 = new Vector<Integer>(n); 
        Vector<Integer> v2 = new Vector<Integer>(n); 
        Vector<Integer> e1 = new Vector<Integer>(n); 
        Vector<Integer> e2 = new Vector<Integer>(n); 

//        List<Integer> l1 = new Vector<Integer>(n); 
//        List<Integer> l2 = new Vector<Integer>(n); 

        // Appending new elements at 
        // the end of the vector 
        for (int i = 1; i <= n; i= i+2) 
            v1.add(i); 
  
        for (int i = 2; i <= n; i= i+2) 
            v2.add(i); 

   	Vector<Integer> r2 = union(null,null);
        System.out.println(r2); 

  	Vector<Integer> r3 = union(e1,e2);
        System.out.println(r3); 


  	Vector<Integer> r1 = union(v1,v2);
        System.out.println(r1); 

  	Vector<Integer> r4 = union(v1,v1);
        System.out.println(r4); 

//  	List<Integer> r5 = union(l1,l2);
//        System.out.println(r5); 

    } 
}
