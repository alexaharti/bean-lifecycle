package pixel.academy.setter_injection_app.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class ItalianChef implements Chef {

    public ItalianChef() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return " Prepare pasta al pomodoro with frsh tomatoees and basil.";
    }
}
