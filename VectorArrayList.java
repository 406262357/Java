import java.util.*;  
  
public class VectorArrayList  
{  
    public static void main(String[] args)   
    {  
        Scanner input = new Scanner(System.in);  
        while(true)  
        {  
            Vector<Integer>vector = new <Integer>Vector();  
            ArrayDeque<Integer>array = new <Integer>ArrayDeque();  
            boolean flag = false;  
            while(input.hasNext())  
            {  
                int tmp = input.nextInt();  
                if(tmp == 0)  
                {  
                    if(vector.isEmpty())  
                    {  
                        flag = true;  
                    }  
                    break;  
                }  
  
                vector.add(tmp);  
            }  
            if(flag)  
                break;  
            Collections.sort(vector);  
            while(!vector.isEmpty())  
            {  
                int tmp = vector.firstElement();  
                if(tmp % 2 == 0)  
                {  
                    array.addLast(tmp);  
                }  
                else  
                {  
                    array.addFirst(tmp);  
                }  
                vector.remove(0);  
            }  
            System.out.print(array.peek());  
            array.pop();  
            while(!array.isEmpty())  
            {  
                int tmp = array.peek();  
                System.out.print(" " + tmp);  
                array.pop();  
            }  
            System.out.println();  
        }      
    }  
}  