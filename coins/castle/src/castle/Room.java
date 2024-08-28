package castle;
import java.util.HashMap;
public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit (String direct, Room room) {
    	exits.put(direct, room);
    }
    
    public void findExits() {
        for(String dir : exits.keySet()) {
        	if(exits.get(dir) != null) {
        		System.out.print(dir+" ");
        	}
        }
        System.out.println();
    }
    
    public Room goRoom(String direction) {
    	Room nextRoom = exits.get(direction);
        return nextRoom;
    }

    @Override
    public String toString()
    {
        return description;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
