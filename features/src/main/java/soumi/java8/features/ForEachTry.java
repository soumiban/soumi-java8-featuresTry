package soumi.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class ForEachTry 
{
	
	
    public static void main( String[] args )
    {
    	List<Integer> listOfData = new ArrayList<Integer> ();
    	for(int i=0; i<10; i++) listOfData.add(i);
    	
    	List<String> listOfString = new ArrayList<String> ();
    	for(int i=0; i<10; i++) listOfString.add("try - "+ i);
    	
    	
    	
    	MyConsumer consumer = new MyConsumer();
    	listOfData.forEach(consumer);
    	listOfString.forEach(consumer);
    	
    }
}

class MyConsumer implements Consumer<Object>{

	public void accept(Object t) {
		System.out.println("forEach Value::"+(Object)t.toString());
		
		
	}
}
