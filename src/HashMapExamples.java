import java.util.*;
public class HashMapExamples {

	Queue<String> queue;
	HashMapExamples()
	{
		queue = new LinkedList();
	}
	
	public void enqueue(String str)
	{
		queue.add(str);
	}
	
	public String dequeue()
	{
		if(!queue.isEmpty())
			return queue.poll();
		return null;
	}
	
	public static void main(String args[])
	{
//		HashMapExamples hm = new HashMapExamples();
//		
//		hm.enqueue("first");
//		System.out.println(hm.dequeue());
//		
//		hm.enqueue("first");
//		hm.enqueue("Second");
//		hm.enqueue("Third");
//		System.out.println(hm.dequeue());
		
Scanner sc = new Scanner(System.in);
        
        int entryCount = (int)sc.nextInt();
        String [] entries = new String [entryCount];
        
        for(int i = 0; i<entryCount; i++)
        {
            entries[i] = sc.next();
        }
        int find = (int)sc.nextInt();
        
        String [] findentries = new String[find];
        
        for(int i = 0; i<find; i++)
        {
            findentries[i] = sc.next(); 
        }
        
        
        for(String s1 : findentries)
        {
            int count = 0;
            for(String s2 : entries)
            {
                if(s1.equals(s2))
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
	}
}
