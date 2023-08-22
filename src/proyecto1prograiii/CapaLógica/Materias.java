package proyecto1prograiii.CapaLógica;

public class Materias {
    public String Nombre = "";
    public String Codigo = "";
    public String facu = "";
    public int creditos =0;
    public String aula = "";
    public String Horario = "";
    public String requisitos = "";
    public boolean EsRelleno = true;
    public String  Objetivos = "";

    public Materias(String Nombre, String Codigo, String Facu, int creditos, String Aula, String Horario, String Requisitos, boolean Esrelleno, String Objetivos) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.facu = Facu;
        this.creditos = creditos;
        this.aula = Aula;
        this.Horario = Horario;
        this.requisitos = Requisitos;
        this.EsRelleno = Esrelleno;;
        this.Objetivos = Objetivos;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFacu() {
        return facu;
    }

    public void setFacu(String facu) {
        this.facu = facu;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public boolean isEsRelleno() {
        return EsRelleno;
    }

    public void setEsRelleno(boolean EsRelleno) {
        this.EsRelleno = EsRelleno;
    }

    public String getObjetivos() {
        return Objetivos;
    }

    public void setObjetivos(String Objetivos) {
        this.Objetivos = Objetivos;
    }

}
