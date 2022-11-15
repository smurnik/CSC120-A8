public interface Contract {

    void grab(String item);
    String drop(String item);
    void examine(String item);
    void use(String item);
    boolean walk(String direction);
    boolean fly(int x, int y);
    Number shrink();
    Number grow();
    void rest();
    void undo();

}


class Plant implements Contract{

    String plantName;
    String type;
    int plantAge;


    public Plant(String plantName, int plantAge){
        this.type = plantName;
        
    } 
    

    /**
    * Adds a new plant
    * @param object string value of the plants's name
    */
    public void grab(String item){
        this.type = item;
        System.out.println("You added the species " + item + " to your collection");
        
    }

    /**
    * It "removes" plant from collection
    * @param item string value of the plants's name
    */
    public String drop(String item){
        this.type= item;
        System.out.println("You took out the species " + item + " from your collection");
        return item;

    }

    /**
    * examines plant
    * @param item string value of the plants's name
    */
    public void examine(String item) {
        this.type = item;
        if ( item == "resting"){
            System.out.println("The plant is resting");
        } else{
        System.out.println("The species of this plant is " + item);

        }
    }

    /**
    * displays plant
    * @param item string value of the plants's name
    */
    public void use(String item) {
        this.type= item;
        System.out.println("The plant " + item + " has been displayed");
        
    }

    /**
    * moves plant based on left or right
    * @param direction string value of direction
    */
    public boolean walk(String direction) {
        if (direction == "left" || direction == "right"){
            System.out.println("The plant has been moved to the " + direction + " side of the room");
            return true;
        } else {
            System.out.println("that was an invalid option");
            return false;
        }
        
    }

    /**
    * moves plant based on coordinates
    * @param xy int of coordinates
    */
    public boolean fly(int x, int y) {
        if( x >= -180 && x <= 180 && y >= -180 && y <= 180){
            System.out.println("You have flown your plant to the coordinates of (" + x +"," + y + ")");
        }
        return false;
    }

    /**
    * determins if plant is old enough to splice
    * @return null
    */
    public Number shrink() {
        if (plantAge >= 3){
            System.out.println("You have spliced your plant");
        } else{
            System.out.println("Your plant is not old enough");
        }
        return null;
    }

    /**
    * determins if plant need growth help
    * @return null
    */
    public Number grow() {
        if (plantAge <= 1){
            System.out.println("Extra care will be given to the plant: " + plantName + ", this includes fertilizer sun and water.");
        } else {
            System.out.println("It is just a sapling! It does not need assistance, patience and it will grow.");
        }
        return null;
    }

    /**
    * the plant is resting
    */
    public void rest() {
        examine("resting");
        
    }

    /**
    * Undo past action
    */
    public void undo() {
        System.out.println("action undone");
        
    }

    
    
 public static void main(String[] args) {
    Plant myPlant= new Plant("tree", 2);
    //myPlant.grab("oak");
    //myPlant.drop("maple");
    //myPlant.examine("maple");
    //myPlant.use("maple");
    //myPlant.walk("right");
    //myPlant.fly(30,44);
    //myPlant.shrink();
    //myPlant.grow();
    //myPlant.rest();
    myPlant.undo();

 }
        
}

