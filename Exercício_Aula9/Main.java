
public class Main{
    public static void main(String[] args) {
        PositionalList list = new PositionalList();

        try{
            list.addFirst(10);     
            list.addLast(20);        
            list.addLast(30);        
            list.addBefore(list.after(list.after(list.first())), 25);  
            list.addAfter(list.first(), 15);   
            list.printList(list.first()); 
        }
        catch(IllegalArgumentException error){
            System.out.println(error);
        }
        catch(IllegalStateException e){
            System.out.println(e);
        }
    }
}