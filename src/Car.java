public class Car {
    private String myColor;//global scope
    public Car(String color){
        myColor = color;
    }

    public void setColor(String color){

        String[] allowedColors = {
                "red",
                "blue",
                "white",
                "black"
        };
        for (String ac : allowedColors) {
            if(ac.equals(color) ){
                myColor = color;
                return;
            }

        }
        System.out.println("color is not allowed");



    }
    public String getColor(){
        return myColor;
    }

}
