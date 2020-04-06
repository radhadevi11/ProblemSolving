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
        if(restaurants1 == null || restaurants2 == null){
            throw new IllegalArgumentException("Not a valid Input");
        }
        if( restaurants1.isEmpty() || restaurants2.isEmpty()){
            throw new IllegalArgumentException("One of the inputs is empty");
        }
        Map<String, Integer> restaurantsWithIndex = convertListToMap(restaurants1);
        return populateRestaurantList(restaurantsWithIndex, restaurants2);
    }
    List<String> populateRestaurantList(Map<String, Integer> restaurantsWithIndex, List<String> restaurants2) {

        /*
        Step 1: Create a resultList
        Step 2: set minIndexSoFar as MAX_VALUE
        Step 3: For each restaurants in restaurants2
            3.1: if the restaurant is present in the map
                    3.1.1: add the index of both restaurant and assign it to sumOfIndex
                    3.1.2: if sumOfIndex  is equal to minIndexSoFar
                                3.1.2.1: add the restaurant name to resultList
                    3.1.3: if sumOfIndex is less than minIndexSoFar
                                3.1.3.1: remove all the elements from resultList
                                3.1.3.2: add the restaurant name to resultList
                                3.1.3.3: assign sumOfIndex to minIndexSoFar

         */
        List<String> resultList = new ArrayList<>();
        int minIndexSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < restaurants2.size(); i++) {

            String curRestaurant = restaurants2.get(i);
            if (restaurantsWithIndex.containsKey(curRestaurant)) {
                int sumOfIndex = i + restaurantsWithIndex.get(curRestaurant);
                //sumOfIndex  is equal to minIndexSoFar
                if (sumOfIndex == minIndexSoFar) {
                    resultList.add(curRestaurant);
                    //minIndexSoFar = getSumOfMinIndex(resultList, sumOfIndex, curRestaurant);
                }
                //sumOfIndex is less than minIndexSoFar
                if (sumOfIndex < minIndexSoFar) {
                    resultList.clear();
                    resultList.add(curRestaurant);
                    minIndexSoFar = sumOfIndex;
                }
            }
        }
        return resultList;
    }


}
