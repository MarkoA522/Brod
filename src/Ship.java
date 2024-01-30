import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Apstraktna klasa Ship (Brod)
abstract class Ship {
    protected int id;
    protected String name;
    protected EngineType engineType;

    public Ship(int id, String name, EngineType engineType) {
        this.id = id;
        this.name = name;
        this.engineType = engineType;
    }

    public abstract String getInfo();
}


