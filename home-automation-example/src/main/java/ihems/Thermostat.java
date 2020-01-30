package ihems;

import java.util.Observable;
import java.util.Observer;

public class Thermostat implements Observer
{
   private Furnace furnace;
   private TemperatureSensor temperatureSensor;
   private double desiredTemperature;

   public Thermostat(TemperatureSensor temperatureSensor, Furnace furnace)
   {
      this.furnace = furnace;
      this.temperatureSensor = temperatureSensor;

      temperatureSensor.addObserver(this);
   }

   public void setDesiredTemperature(double temperature)
   {
      desiredTemperature = temperature;
      update(null, null);
   }

   public void update(Observable arg0, Object arg1)
   {
      if (temperatureSensor.getTemperature() < desiredTemperature)
         furnace.start();
      else
         furnace.stop();
   }
}
