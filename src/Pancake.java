public class Pancake {

    private int temperature;

    public Pancake(){

    }
    public void setTemperature(int degrees){
        if(degrees <150 && degrees > 0)
        {
            temperature = degrees;
        }
        else
        {
            System.out.println("dat is echt te heet of te koud");
        }

    }
    public int getTemperature(){
        return temperature;
    }


}
