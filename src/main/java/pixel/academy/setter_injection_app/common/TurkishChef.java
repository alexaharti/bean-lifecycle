package pixel.academy.setter_injection_app.common;


import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef{

    public TurkishChef() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare kebab";
    }
}
