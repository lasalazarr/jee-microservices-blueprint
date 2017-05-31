package com.adv.blueprint.jee;

import java.sql.SQLDataException;
import java.util.logging.Logger;

/**
 * Created by alberto on 5/30/17.
 */
public class RestUser {

    private static final Logger logger = Logger.getLogger(RestUser.class.getName());

    public static void main(String args[]) throws Exception {

        String data = methodSample(null);

        ResultVo resultVo = EnvelopUtil.fillEnvelop(null, "list");

        logger.info("CAUSE = " + resultVo.getCause() + " - RESULT= " + resultVo.getResult());

        resultVo = EnvelopUtil.fillEnvelop(data, "list");

        logger.info("CAUSE = " + resultVo.getCause() + " - RESULT= " + resultVo.getResult());

    }

    private static String methodSample(String data) throws Exception{

        if(data == null)
            throw new SQLDataException();

        return data;
    }

}
