package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CustomListTest {

    private CustomList mockCityList() {
        CustomList list = new CustomList();
        list.addCity(mockCity());
        return list;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList cityList = mockCityList();
        cityList.delete(mockCity());
        assertFalse(cityList.hasCity(mockCity()));
    }
}
