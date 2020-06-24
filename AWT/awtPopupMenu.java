import java.awt.*;  
import java.awt.event.*;  
class PopupMenuExample  
{  
     PopupMenuExample(){ // Constructor of class PopupMenuExample.
        //Frame created using Association.
         final Frame f= new Frame("PopupMenu Example"); // Created a frame named PopupMenu Example.
         final PopupMenu popupmenu = new PopupMenu("Edit"); // Here we created an object(name: popupmenu) of class "PopupMenu".
         //Here Edit is the name of the menu, but it is not shown.

         MenuItem cut = new MenuItem("Cut"); // Item of the menu. "Cut" menuitem is created. cut is the object.
         cut.setActionCommand("Cut"); // Sets the name of the action performed by the MenuItem. Cut is the name of the action performed.
         //Can be used later to check which item is selected.

         MenuItem copy = new MenuItem("Copy");  // Item of the menu. "Copy" menuitem is created. copy is the object.
         copy.setActionCommand("Copy");  // Sets the name of the action performed by the MenuItem. Copy is the name of the action performed.
         //Can be used later to check which item is selected.

         MenuItem paste = new MenuItem("Paste");  // Item of the menu. "Paste" menuitem is created. paste is the object.
         paste.setActionCommand("Paste");  // Sets the name of the action performed by the MenuItem. Paste is the name of the action performed.
         //Can be used later to check which item is selected.

         popupmenu.add(cut); // Adds the MenuItem "cut" to popupmenu object. That is, it adds the item to Menu.
         popupmenu.add(copy); // Adds the MenuItem "copy" to popupmenu object. That is, it adds the item to Menu.
         popupmenu.add(paste); // Adds the MenuItem "paste" to popupmenu object. That is, it adds the item to Menu.

         f.addMouseListener(new MouseAdapter() // Adds the Mouse Event Listner - Then MouseAdapter() is an abstract adapter class for receiving mouse events.
         {  
            public void mouseClicked(MouseEvent e) // Adds a mouse event. Here in this case it listens for a mouse click. e is the Event object.
            {              
                popupmenu.show(f , e.getX(), e.getY());  // Shows the popup menu at the x, y position of frame f. 
            }                 
         });  
         f.add(popupmenu);  // Adds the object popupmenu to the frame f.
         f.setSize(400,400);  // Sets the size of the frame f.
         f.setLayout(null);  // null indicates we are not using any layout builders.
         f.setVisible(true); // makes the GUI window active. 
     }  
public static void main(String args[])  
{  
        new PopupMenuExample();  // Calling the Constructor - PopupMenuExample()
}  
} 