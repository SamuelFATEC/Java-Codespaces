import java.util.Arrays;

public class HashTable{
    
    private int size = 11;
    private int [] slots = new int [size];
    private String [] data = new String [size];

    public HashTable(){
        Arrays.fill(slots, -1);
    }

    public int getSize(){
        return this.size;
    }
    public int [] getSlots(){
        return this.slots;
    }
    public String [] getData(){
        return this.data;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setSlots(int [] slots){
        this.slots = slots;
    }
    public void setData(String [] data){
        this.data = data;
    }

    public int hashFunction(int key, int size){
        return key%size;
    }

    public int reHash(int oldhash, int size){
        return (oldhash+1)%size;
    }

    public void put(int key, String data){
        int hashValue = hashFunction(key, this.slots.length);
        if(this.slots[hashValue] == -1){
            this.slots[hashValue] = key;
            this.data[hashValue] = data;
        }
        else{
            if(this.slots[hashValue]==key){
                this.data[hashValue]=data;
            }
            else{
                int nextSlot = reHash(hashValue, slots.length);
                while(this.slots[nextSlot] != -1 && this.slots[nextSlot]!=key){
                    nextSlot = reHash(nextSlot, slots.length);
                }
                if(this.slots[nextSlot]==-1){
                    this.slots[nextSlot]=key;
                    this.data[nextSlot]=data;
                }
                else{
                    this.data[nextSlot]=data;
                }
            }
        } 
    }

    public String get(int key){
        int startSlot = hashFunction(key, this.slots.length);
        String data = null;
        boolean stop = false;
        boolean found = false;
        int position = startSlot;
        while(this.slots[position] != -1 && !found && !stop){
            if(this.slots[position]==key){
                found=true;
                data = this.data[position];
            }
            else{
                position = reHash(position, this.slots.length);
                if(position==startSlot){
                    stop = true;
                }
            }
        }
        return data;
    }

    public String getItem(int key){
        return this.get(key);
    }

    public void setItem(int key, String data){
        this.put(key, data);
    }
}