package tdd;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public boolean getOnValue() {
        return isOn;
    }

    public void setWork(boolean working) {

        isOn = working;
    }

    public void setTemperature(int temp) {
        if (temperature >= 0) {
            temperature = temp;
        }
        if (temperature > 30) {
            temperature = 30;
        }
        if (temperature < 16) {
            temperature = 16;
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
