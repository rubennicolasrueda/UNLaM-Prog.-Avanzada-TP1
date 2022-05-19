package domain;

// todo nombre, código (si es necesario para simplificar las búsquedas o comparaciones), cantidad
public class Ingredient {

    private int id; //Codigo del ingrediente
    private String name; //Nombre del ingrediente
    private int amount; //Cantidad del ingrediente
    public Ingredient(int id, String name, int amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}

