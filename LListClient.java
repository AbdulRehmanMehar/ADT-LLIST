class LListClient {

   public static void displayList(ListInterface<String> list)
    {
       int numberOfEntries = list.getLength();
       System.out.println("The list contains " + numberOfEntries +
                          " entries, as follows:");
       for (int position = 1; position <= numberOfEntries; position++)
          System.out.println(list.getEntry(position) +
                             " is entry " + position);
       System.out.println();
    } // end displayList
 
   public static void main(String[] args) {
 
    System.out.println("Create an empty list.");
    ListInterface<String> myList = new LList<String>();
    System.out.println("List should be empty; isEmpty returns " + 
                       myList.isEmpty() + ".");
 
    System.out.println("\nTesting add to end:");
    myList.add("15");
    myList.add("25");
    myList.add("35");
    myList.add("45");
 
    myList.remove(4);
    myList.add(4, "55");
 
    System.out.println("List should contain 15 25 35 45.");    
    displayList(myList);   
    System.out.println("List should not be empty; isEmpty() returns " + 
                       myList.isEmpty() + ".");
    System.out.println("\nTesting clear():");
    myList.clear();
    System.out.println("List should be empty; isEmpty returns " + 
                       myList.isEmpty() + ".");
   }  // end main
   /* 
    Create an empty list.
    List should be empty; isEmpty returns true.
    
    Testing add to end:
    List should contain 15 25 35 45.
    The list contains 4 entries, as follows:
    15 25 35 45
    List should not be empty; isEmpty() returns false.
    
    Testing clear():
   */
 
 
 }//class