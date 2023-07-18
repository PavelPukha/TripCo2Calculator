
import java.util.ArrayList;
import java.util.List;


public class CityDistanceAPI {
    public List<String> cities;
    private final int[][] distances;

    public CityDistanceAPI() {
        cities = new ArrayList<>();
        distances = new int[8][8];
        initializeCities();
        distancesTable();
    }

    private void initializeCities() {
                              //        [0] [1] [2 [3] [4 [5] [6] [7]
        cities.add("Berlin");//    [0]
        cities.add("Brussels");//  [1]
        cities.add("Dublin"); //   [2]
        cities.add("London"); //   [3]
        cities.add("Madrid");//    [4]
        cities.add("Munich");//    [5]
        cities.add("Paris");//     [6]
        cities.add("Rome"); //     [7]

    }

    private void distancesTable() {
        setDistance(0, 1, 658);
        setDistance(0, 2, 1315);
        setDistance(0, 3, 930);
        setDistance(0, 4, 1868);
        setDistance(0, 5, 502);
        setDistance(0, 6, 877);
        setDistance(0, 7, 1182);

        setDistance(1, 2, 773);
        setDistance(1, 3, 319);
        setDistance(1, 4, 1314);
        setDistance(1, 5, 602);
        setDistance(1, 6, 261);
        setDistance(1, 7, 1171);

        setDistance(2, 3, 463);
        setDistance(2, 4, 1450);
        setDistance(2, 5, 1375);
        setDistance(2, 6, 777);
        setDistance(2, 7, 1882);

        setDistance(3, 4, 1263);
        setDistance(3, 5, 916);
        setDistance(3, 6, 341);
        setDistance(3, 7, 1431);

        setDistance(4, 5, 1485);
        setDistance(4, 6, 1053);
        setDistance(4, 7, 1361);

        setDistance(5, 6, 685);
        setDistance(5, 7, 698);

        setDistance(6, 7, 1106);

    }

    public void setDistance(int cityIndex1, int cityIndex2, int distance) {
        distances[cityIndex1][cityIndex2] = distance;
        distances[cityIndex2][cityIndex1] = distance;
    }

    public int getDistance(int cityIndex1, int cityIndex2) {

        return distances[cityIndex1][cityIndex2];
    }

    public String getCity(int cityIndex) {
        return cities.get(cityIndex);
    }
}
