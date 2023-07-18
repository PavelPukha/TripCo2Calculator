class Co2Emission  {
     private final double distance;

   private final double  cO2EmissionSmallCar = 0.1276;
   private final double  cO2EmissionMediumCar = 0.167;
    private final double co2EmissionLargeCar = 0.257;
   private final double  cO2EmissionPlane = 0.1753;
   private final double  cO2EmissionTrain = 0.065;
   private final double cO2EmissionBus = 0.089;

     public Co2Emission (double distance){
         this.distance = distance;
     }


    public double calculateCo2Emissions (String transport) {
         double CO2PerPassengerKm = 0;
         if (transport.equalsIgnoreCase("Compact car")){
             CO2PerPassengerKm = cO2EmissionSmallCar;
         }else if (transport.equalsIgnoreCase("Mid-range car")){
             CO2PerPassengerKm = cO2EmissionMediumCar;
         }else if (transport.equalsIgnoreCase("Luxury/SUV/Van")){
             CO2PerPassengerKm = co2EmissionLargeCar;
         } else if  (transport.equalsIgnoreCase("Plane")) {
             CO2PerPassengerKm = cO2EmissionPlane;
         } else if  (transport.equalsIgnoreCase("Train")) {
             CO2PerPassengerKm = cO2EmissionTrain;
         } else if  (transport.equalsIgnoreCase("Bus")) {
             CO2PerPassengerKm = cO2EmissionBus;
         }
        double totalFuelConsumption =  distance   * CO2PerPassengerKm;
        return totalFuelConsumption;

    }
}

