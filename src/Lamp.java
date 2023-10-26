public class Lamp extends Furniture implements Comparable<Lamp> {

    private double current; // The amp current of lamp.

    /**
     *
     * @param wood
     * @param steel
     * @param fabric
     * @param type
     * @param name
     * @param current
     */
    public Lamp(boolean wood, boolean steel, boolean fabric, Furniture.TypeOfFurniture type, String name, double current) {
        super(wood, steel, fabric, type, name);
        this.current = current;
    }

    /**
     *
     * @return
     */
    public String ToString() {
        return "Lampan " + super.getName() + " drar " + current + " amp";
    }

    /**
     *
     * @param other the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Lamp other) {
        if (current < other.getCurrent()) {
            return -1;
        } else if (current > other.getCurrent()) {
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return
     */
    public double getCurrent() {
        return current;
    }
}
