import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create tables.
        Table table1 = new Table(false, true, false, Furniture.TypeOfFurniture.Skrivbord, "Gamingbord", 5.5);
        Table table2 = new Table(true, false, false, Furniture.TypeOfFurniture.Bord, "Matbord", 10);
        Table table3 = new Table(false, true, false, Furniture.TypeOfFurniture.Bord, "Campingbord", 3);
        List<Table> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);
        tables.add(table3);

        // Write tables unsorted.
        System.out.println("\nTables:");
        for (Table table : tables) {
            System.out.println(table.ToString());
        }

        // Write tables sorted.
        tables.sort(Table::compareTo);
        System.out.println("\nTables sorted:");
        for (Table table : tables) {
            System.out.println(table.ToString());
        }

        // Create lamps.
        Lamp lamp1 = new Lamp(false, true, false, Furniture.TypeOfFurniture.Taklampa, "Kökslampa", 0.5);
        Lamp lamp2 = new Lamp(false, true, false, Furniture.TypeOfFurniture.Bordslampa, "Läslampa", 0.12);
        Lamp lamp3 = new Lamp(false, false, true, Furniture.TypeOfFurniture.Taklampa, "Vardagsrumslampa", 0.3);
        List<Lamp> lamps = new ArrayList<>();
        lamps.add(lamp1);
        lamps.add(lamp2);
        lamps.add(lamp3);

        // Write lamps unsorted.
        System.out.println("\nLamps:");
        for (Lamp lamp : lamps) {
            System.out.println(lamp.ToString());
        }

        // Write lamps sorted.
        lamps.sort(Lamp::compareTo);
        System.out.println("\nLamps sorted:");
        for (Lamp lamp : lamps) {
            System.out.println(lamp.ToString());
        }
    }
}