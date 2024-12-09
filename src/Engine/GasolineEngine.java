package Engine;

public class GasolineEngine implements Engine {
        int rotation;
        double optimalTemperature = 110;
        double currentEngineTemperature;

        public GasolineEngine() {
            this.currentEngineTemperature = optimalTemperature;
            this.rotation = 2000;
        }
        @Override
        public int getRotation() {
            return rotation;
        }

        @Override
        public double getOptimalTemperature() {
            return optimalTemperature;
        }

        @Override
        public double getTemperature() {
            return currentEngineTemperature;
        }

        @Override
        public void setTemperature(double engineTemperature) {
            this.currentEngineTemperature = engineTemperature;

            System.out.println("текущая температура двигателя " + currentEngineTemperature);
        }


    }

