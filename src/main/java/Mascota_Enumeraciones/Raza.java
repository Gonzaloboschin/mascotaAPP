package Mascota_Enumeraciones;

public enum Raza {

    BEAGLE(32131,"Beagle"), COCKER(12312,"Cocker"), PITBULL(15315,"Pitbull"), BORDER_COLLIE(15124,"Border Collie");
        
    private Integer codigo;
    private String valor;

    private Raza(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
    
}
