package pertemuan601;

/**
 *
 * @author Elisabet Serianti
 * TGL 26-4-2015
 */
public class Pertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        buah apel = new buah ();
        apel.warna = "kuning";
        apel.SetRasa ("manis");
        
        System.out.printf("warna apel diset %s\n",apel.warna );
        System.out.printf("rasa apel diset %s\n",apel.getRasa());
                
        
        
        
        buah anggur = new buah();
        anggur.warna = "hijau";
       System.out.printf("warna anggur diset %s\n",anggur.warna );
     
    }
    
}

        
class buah {
    public String warna;
    private String rasa;
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;
    }
    public String getRasa (){
        return this.rasa;
        
    }
}