/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citytest;

/**
 *
 * @author hmyra
 */
public class CityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City[] cities = new City [5];
        City c1 = new City ("İzmir", 35);
        City c2 = new City ("Antalya",39.2);
        City c3 = new City ("Yozgat", 25.3);
        City c4 = new City ("Muğla", 38.5);
        City c5 = new City ("Ordu", 27.15);
        cities [0] = c1;
        cities [1] = c2;
        cities [2] = c3;
        cities [3] = c4;
        cities [4] = c5;
                
        System.out.println("Sıralanmamış dizi yazdırılıyor: ");
        for (City c : cities){
            System.out.println(c);
        }
        
        GeneralizedSelectionSort.sort(cities, cities.length);
        System.out.println("Sıralanmış dizi yazdırılıyor: ");
        for (City c : cities){
            System.out.println(c);
        }
    }
    
}
