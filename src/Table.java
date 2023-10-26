public class Table extends Furniture implements Comparable<Table> {

    private double areaOfTable;

    public Table(boolean wood, boolean steel, boolean fabric, TypeOfFurniture type, String name, double areaOfTable) {
        super(wood, steel, fabric, type, name);
        this.areaOfTable = areaOfTable;
    }

    public String ToString() {
        return "Bordet " + super.getName() + " har ytan " + areaOfTable;
    }

    @Override
    public int compareTo(Table other) {
        if (areaOfTable < other.getAreaOfTable()) {
            return -1;
        } else if (areaOfTable > other.getAreaOfTable()) {
            return 1;
        }
        return 0;
    }

    public double getAreaOfTable() {
        return areaOfTable;
    }
}
