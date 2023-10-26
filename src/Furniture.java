public class Furniture {

    private boolean wood;
    private boolean steel;
    private boolean fabric;
    private String name;
    private TypeOfFurniture type;

    enum TypeOfFurniture {
        Bord,
        Stol,
        Taklampa,
        Bordslampa,
        Skrivbord;
    }

    public Furniture(boolean wood, boolean steel, boolean fabric, TypeOfFurniture type, String name) {
        this.wood = wood;
        this.steel = steel;
        this.fabric = fabric;
        this.type = type;
        this.name = name;
    }

    public boolean isWood() {
        return wood;
    }

    public boolean isSteel() {
        return steel;
    }

    public String getName() {
        return name;
    }

    public TypeOfFurniture getType() {
        return type;
    }
}
