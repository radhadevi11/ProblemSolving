import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChooseRestaurants {
    Map<String, Integer> convertListToMap(List<String> restaurantNames){
        Map<String, Integer> restaurantsWithIndex = new HashMap<>();
        for(int i = 0; i < restaurantNames.size(); i++){
            restaurantsWithIndex.put(restaurantNames.get(i), i);
        }
        return restaurantsWithIndex;
    }

    List<String> getCommonRestaurantsWithLeastIndex(List<String> restaurants1, List<String> restaurants2){
        /*

        Step 1: Convert restaurants1 list as map
        Step 2: populateRestaurantList
        Step 3: Return resultList

         */
        Map<String, Integer> restaurantsWithIndex = convertListToMap(restaurants1);
        return populateRestaurantList(restaurantsWithIndex, restaurants2);
    }
    List<String> populateRestaurantList(Map<String, Integer> restaurantsWithIndex, List<String> restaurants2) {

        /*
        Step 1: Create a resultList
        Step 2: set minRestaurantIndex as MAX_VALUE
        Step 3: For each restaurants in restaurants2
            3.1: if the restaurant is present in the map
                    3.1.1: add the index of both restaurant and assign it to sumOfIndex
                    3.1.2: if sumOfIndex  is equal to minRestaurantIndex
                                3.1.2.1: add the restaurant name to resultList
                    3.1.3: if sumOfIndex is less than minRestaurantIndex
                                3.1.3.1: remove all the elements from resultList
                                3.1.3.2: add the restaurant name to resultList
                                3.1.3.3: assign sumOfIndex to minRestaurantIndex

         */
        List<String> resultList = new ArrayList<>();
        int minRestaurantIndex = Integer.MAX_VALUE;
        int sumOfIndex = 0;
        for (int i = 0; i < restaurants2.size(); i++) {
            String curRestaurent = restaurants2.get(i);
            if (restaurantsWithIndex.containsKey(curRestaurent)) {
                sumOfIndex = i + restaurantsWithIndex.get(curRestaurent);
                if (sumOfIndex == minRestaurantIndex) {
                    resultList.add(curRestaurent);
                    minRestaurantIndex = sumOfIndex;
                }
                if (sumOfIndex < minRestaurantIndex) {
                    resultList.removeAll(resultList);
                    resultList.add(curRestaurent);
                    minRestaurantIndex = sumOfIndex;
                }
            }
        }
        return resultList;
    }

}
