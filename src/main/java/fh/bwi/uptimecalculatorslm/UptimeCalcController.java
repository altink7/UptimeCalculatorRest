package fh.bwi.uptimecalculatorslm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc/")
public class UptimeCalcController {

    @GetMapping("/{percent}")
    public String calcCL(@PathVariable float percent) {

        //Hier Wert reingeben!!
        float Value= percent; //percent löschen, dein Wert reingeben, mit percent beim / ( hier Wert reingeben)
        //Oben Wert eingeben beim Value

        float Val=100-Value;
        String sVal =String.valueOf("|"+Val+"|\n");
        return "Value:"+sVal+"====>"
                +String.format(" %s %2f%s %2.0f%s %2.0f%s", "Daily:", 24*Val/100,"h" ,
                (24*Val/100%1)*60-(24*Val/100%1)*60%1,"m",(24*Val/100%1)*60%160,"s");
    }
}

