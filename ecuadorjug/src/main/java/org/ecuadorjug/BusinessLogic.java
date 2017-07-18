package org.ecuadorjug;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alberto on 7/17/17.
 */

@Stateless
public class BusinessLogic {

    public List<Cloud> getClouds(){
        return Arrays.asList(new Cloud("TEST", 1), new Cloud("Test2 ", 2));
    }

    public void createCloud(Cloud cloud) {
        System.out.println("Cloud" + cloud);
    }
}
