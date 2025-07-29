package pixel.academy.setter_injection_app.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class FrenchChef implements Chef{

    public FrenchChef() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyRecipe() {
        return "Prepare boef bourgignon";
    }
}
