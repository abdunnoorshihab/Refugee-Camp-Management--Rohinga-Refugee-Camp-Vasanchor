
package mainpakage;

/**
 *
 * @author USER
 */
public class Vaccination {
   private String TypeOfVaccin;
   private int date;
   private String doseType;

    @Override
    public String toString() {
        return "Vaccination{" + "TypeOfVaccin=" + TypeOfVaccin + ", date=" + date + ", doseType=" + doseType + '}';
    }

    public String getTypeOfVaccin() {
        return TypeOfVaccin;
    }

    public void setTypeOfVaccin(String TypeOfVaccin) {
        this.TypeOfVaccin = TypeOfVaccin;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDoseType() {
        return doseType;
    }

    public void setDoseType(String doseType) {
        this.doseType = doseType;
    }
    
}
