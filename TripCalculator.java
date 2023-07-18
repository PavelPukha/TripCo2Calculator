import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TripCalculator {
    public static void main(String[] args) {
        CityDistanceAPI cityData = new CityDistanceAPI();
        TripCalculator tripCalculator = new TripCalculator();


        Scanner scanner = new Scanner(System.in);


        System.out.println("This program calculates a distance and CO2 emissions per trip, providing accurate measurements.");
        System.out.println("Here is the list of available cities:");
        for (int i = 0; i < cityData.cities.size(); i++) {
            System.out.println((i + 1) + ". " + cityData.getCity(i));
        }

        System.out.print("Choose the city of departure from the list above (enter the number): ");
        int cityIndex1 = scanner.nextInt();
        scanner.nextLine();
        cityIndex1--;

        if (!validateCityIndex(cityIndex1, cityData.cities.size())) {
            return;
        }


        System.out.print("Choose the city of destination from the list above (enter the  number): ");
        int cityIndex2 = scanner.nextInt();
        scanner.nextLine();
        cityIndex2--;

        if (!validateCityIndex(cityIndex2, cityData.cities.size())) {
            return;
        }


        int distance = cityData.getDistance(cityIndex1, cityIndex2);
        if (distance != 0) {
            String city1 = cityData.getCity(cityIndex1);
            String city2 = cityData.getCity(cityIndex2);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Distance between " + city1 + " and " + city2 + ": " + distance + " km");
        } else {
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Try it again. It's the same city.");
            return;

        }
            System.out.println("----------------------------------------------------------------------------------------------------------------");


        Co2Emission co2 = new Co2Emission(distance);

        double totalCO2EmissionSmallCar = co2.calculateCo2Emissions("Compact car");
        double totalCO2EmissionMediumCar = co2.calculateCo2Emissions("Mid-range car");
        double totalCO2EmissionLargeCar = co2.calculateCo2Emissions("Luxury/SUV/Van");
        double totalCO2EmissionPlane = co2.calculateCo2Emissions("Plane");
        double totalCO2EmissionTrain = co2.calculateCo2Emissions("Train");
        double totalCO2EmissionBus = co2.calculateCo2Emissions("Bus");


        List<String> transport = new ArrayList<>();

        transport.add("Car");
        transport.add("Plane");
        transport.add("Train");
        transport.add("Bus");

        List<String> typeOfTheCar = new ArrayList<>();
        typeOfTheCar.add("Compact car");
        typeOfTheCar.add("Mid-range car");
        typeOfTheCar.add("Luxury/SUV/Van");


        System.out.println("Choose the transport from the list below (enter the  number): ");
        for (int i = 0; i < transport.size(); i++) {
            System.out.println((i + 1) + ". " + transport.get(i));
        }
        int choiceOfTransport = scanner.nextInt();


        if (choiceOfTransport == 1)
        {
            {
                System.out.println("Enter how many people will be in the car: ");
            }

            int peopleInTheCar = scanner.nextInt();



            {
                System.out.println("Choose the type of car from the list below (enter the  number): ");

                for (int i = 0; i < typeOfTheCar.size(); i++) {
                    System.out.println((i + 1) + ". " + typeOfTheCar.get(i));
                }
                int choiceTypeOfTheCar = scanner.nextInt();


                if (choiceTypeOfTheCar == 1) {
                    System.out.println("Average CO2 emissions for the trip of " + peopleInTheCar + " people by smaal car: " + totalCO2EmissionSmallCar / peopleInTheCar + " kg CO2");
                } else if (choiceTypeOfTheCar == 2) {
                    System.out.println("Average CO2 emissions for the trip of " + peopleInTheCar + " people by memedium car : " + totalCO2EmissionMediumCar / peopleInTheCar + " kg CO2");
                } else if (choiceTypeOfTheCar == 3) {
                    System.out.println("Average CO2 emissions for the trip of " + peopleInTheCar + " people by large car: " + totalCO2EmissionLargeCar / peopleInTheCar + " kg CO2");
                }

            }

        } else if (choiceOfTransport == 2) {
            System.out.println("Average CO2 emissions for the trip by plane: " + totalCO2EmissionPlane + " kg CO2");
        } else if (choiceOfTransport == 3) {
            System.out.println("Average CO2 emissions for the trip by train: " + totalCO2EmissionTrain + " kg CO2");
        } else if (choiceOfTransport == 4) {
            System.out.println("Average CO2 emissions for the trip by bus: " + totalCO2EmissionBus + " kg CO2");

        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Maybe you want to know more about Co2 emission of another trasport? ");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int choiceAnotherTransport = scanner.nextInt();

        if (choiceAnotherTransport == 1) {

            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Average CO2 emissions for the trip by smaal car with one person : " + totalCO2EmissionSmallCar + " kg CO2");
            System.out.println("Average CO2 emissions for the trip by medium car with one person : " + totalCO2EmissionMediumCar + " kg CO2");
            System.out.println("Average CO2 emissions for the trip by large car with one person " + totalCO2EmissionLargeCar + " kg CO2");
            System.out.println("Average CO2 emissions for the trip by plane: " + totalCO2EmissionPlane + " kg CO2");
            System.out.println("Average CO2 emissions for the trip by train: " + totalCO2EmissionTrain + " kg CO2");
            System.out.println("Average CO2 emissions for the trip by bus: " + totalCO2EmissionBus + " kg CO2");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");


        } else if (choiceAnotherTransport == 2) {
            System.out.println("Of course, no problem!");

        } else {
            System.out.println("Invalid input. Please enter either '1' or '2'.");
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Maybe you want to see the average annual amount of Co2 generated by a single person in the EU? ");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int choiceAmountOfCo2InEurope = scanner.nextInt();

        if (choiceAmountOfCo2InEurope == 1) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("In order to stop climate change, this is the maximum amount of Co2 that can be generated by a single person in a year --> 600 kg Co2");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("This is the average annual amount of Co2 generated by a single person in the EU --> 8400 kg Co2");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Thank you for using our program!");
        } else if (choiceAmountOfCo2InEurope == 2) {
            System.out.println("Thank you for using our program!");
        } else {
            System.out.println("Invalid input. Please enter either '1' or '2'.");
        }
        scanner.close();

    }



    private static boolean validateCityIndex(int cityIndex, int citySize) {
        if (cityIndex < 0 || cityIndex >= citySize) {
            System.out.println("Invalid city!");
            return false;
        }
        return true;

    }
}
