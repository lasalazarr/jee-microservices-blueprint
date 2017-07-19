package org.ecuadorjug;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alberto on 7/17/17.
 */

@Stateless
public class BusinessLogic {

    private static List<Cloud> cloudsDB = Arrays.asList(new Cloud("Oracle", 1), new Cloud("Scala ", 2));;

    public List<Cloud> getClouds(){
        return cloudsDB;//Arrays.asList(new Cloud("Oracle", 1), new Cloud("Scala ", 2));
    }

    public void createCloud(Cloud cloud) {
        System.out.println("Cloud: " + cloud);
        //cloudsDB.add(new Cloud("adsdsa", 1));
    }

    public Cloud getCloud(String name) {
        return new Cloud("adsdsa", 1);
    }

    public boolean isCloudTaken(final String name) {
        return "java".equals(name);
    }
}
