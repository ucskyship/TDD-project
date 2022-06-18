package exercises;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public boolean getOnValue() {
        return isOn;
    }

    public void setOn(boolean working) {

        isOn = working;
    }

    public void setTemperature(int temp) {
        temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature >= 16 && temperature < 30){
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (temperature > 16 && temperature < 30){
            temperature--;
        }
    }
}
