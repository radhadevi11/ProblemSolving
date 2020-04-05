import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class ChooseRestaurantsTest {


    @Test
    public void populateRestaurantList() {
        ChooseRestaurants chooseRestaurants = new ChooseRestaurants();

        Map<String, Integer> restaurantsWithIndex = new HashMap<>();
        restaurantsWithIndex.put("Shogun",0 );
        restaurantsWithIndex.put("Tapioca Express",1 );
        restaurantsWithIndex.put("Burger King",2 );
        restaurantsWithIndex.put("KFC",3 );

        List<String> restaurants = new ArrayList<>(
                Arrays.asList("Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"));

        List<String> actual = chooseRestaurants.populateRestaurantList(restaurantsWithIndex, restaurants);

        assertThat(actual).isEqualTo(new ArrayList<String>(Arrays.asList("Shogun")));
    }

    @Test
    public void populateRestaurantListWithLeastIndex() {
        ChooseRestaurants chooseRestaurants = new ChooseRestaurants();

        Map<String, Integer> restaurantsWithIndex = new HashMap<>();
        restaurantsWithIndex.put("Shogun",0 );
        restaurantsWithIndex.put("Tapioca Express",1 );
        restaurantsWithIndex.put("Burger King",2 );
        restaurantsWithIndex.put("KFC",3 );

        List<String> restaurants = new ArrayList<>(
                Arrays.asList("KFC", "Shogun", "Burger King"));

        List<String> actual = chooseRestaurants.populateRestaurantList(restaurantsWithIndex, restaurants);

        assertThat(actual).isEqualTo(new ArrayList<String>(Arrays.asList("Shogun")));
    }

    @Test
    public void populateRestaurantLisMultipleOutput() {
        ChooseRestaurants chooseRestaurants = new ChooseRestaurants();

        Map<String, Integer> restaurantsWithIndex = new HashMap<>();
        restaurantsWithIndex.put("Shogun",0 );
        restaurantsWithIndex.put("Tapioca Express",1 );
        restaurantsWithIndex.put("Burger King",2 );
        restaurantsWithIndex.put("KFC",3 );

        List<String> restaurants = new ArrayList<>(
                Arrays.asList("KFC", "Tapioca Express", "Shogun"));

        List<String> actual = chooseRestaurants.populateRestaurantList(restaurantsWithIndex, restaurants);

        assertThat(actual).isEqualTo(new ArrayList<String>(Arrays.asList("Tapioca Express", "Shogun")));
    }

    @Test
    public void testGetCommonRestaurantWithLeastIndex() {
        ChooseRestaurants chooseRestaurants = new ChooseRestaurants();

        List<String> restaurants1 = new ArrayList<>(
                Arrays.asList("Shogun", "Tapioca Express", "Burger King", "KFC"));

        List<String> restaurants2 = new ArrayList<>(
                Arrays.asList("KFC", "Tapioca Express", "Shogun"));

        List<String> actual = chooseRestaurants.getCommonRestaurantsWithLeastIndex(restaurants1, restaurants2);

        assertThat(actual).isEqualTo(new ArrayList<String>(Arrays.asList("Tapioca Express", "Shogun")));
    }
}
