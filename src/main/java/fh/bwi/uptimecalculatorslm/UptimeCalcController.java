package fh.bwi.uptimecalculatorslm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UptimeCalcController {

    @GetMapping("/calc")
    public String greeting() {

        //Hier Wert reingeben!!
        int Value= 49;
        //Oben Wert eingeben beim Value
        int Val=100-Value;
        String sVal =String.valueOf(Val);
        return "Value:"+sVal+"====>"
                +String.format(" %s %2d%s %2.0f%s %2.0f%s", "Daily:", 24*Val/100,"d" ,(24*(float)Val/100%1)*60-(24*(float)Val/100%1)*60%1,"m",(24*(float)Val/100%1)*60%1*60,"s");
    }



}
