package bird;

public class Bird {
    String BirdName;
    String BirdColor;
    int BirdWeight;
    public String getName(){
        return BirdName;
    }
    public  String getColor(){
        return BirdColor;
    }
    public int weight(){
        return BirdWeight;
    }
    public void setColor(String BirdColor){
        this.BirdColor=BirdColor;
    }
    public void setName(String BirdName){
        this.BirdName=BirdName;
    }
    public void setWeight(int BirdWeight){
        this.BirdWeight=BirdWeight;
    }


}
