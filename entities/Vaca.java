package entities;

public class Vaca {
    int id;
    String Arete;
    String FechaN;
    Finca fincaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArete() {
        return Arete;
    }

    public void setArete(String arete) {
        Arete = arete;
    }

    public String getFechaN() {
        return FechaN;
    }

    public void setFechaN(String fechaN) {
        FechaN = fechaN;
    }

    public Finca getFincaId() {
        return fincaId;
    }

    public void setFincaId(Finca fincaId) {
        this.fincaId = fincaId;
    }



}
