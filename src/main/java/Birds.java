
public class Birds {
    private String birdName;
    private String latinName;
    public int observation = 0;

    public Birds(String birdName, String latinName) {
        this.birdName = birdName;
        this.latinName = latinName;
        this.observation = 0;
    }
    public void observation(String name){
        if(this.birdName.equals(name)){
            this.observation++;
        } 
    }

    
    @Override
    public String toString(){
        return this.birdName + " (" + this.latinName + "): " + this.observation + " observations";
    }

    public String getBirdName() {
        return birdName;
    }
    
}
