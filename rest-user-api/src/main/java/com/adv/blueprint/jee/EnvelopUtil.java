package com.adv.blueprint.jee;

import java.util.logging.Logger;

public class EnvelopUtil {

    private static final Logger logger = Logger.getLogger(EnvelopUtil.class.getName());

    public static ResultVo fillEnvelop(Object data, String method){

        ResultVo resultVo = new ResultVo();
        boolean fail = false;
        try {
            if (data == null)
                throw new Exception(ResultEnum.ListFail.getValue());

            logger.info(data.toString());
            resultVo.setResult(ResultEnum.OK.getValue());
            resultVo.setData(data);
            resultVo.setCause("Record has been " + method + " successfully");
        } catch (Exception e) {
            fail = true;
            logger.severe(method + e.getMessage());
        }
        if (fail) {
            resultVo.setResult(ResultEnum.FAIL.getValue());
            resultVo.setData(data);
            resultVo.setCause( method + " failure "  );
        }
        return resultVo;
    }
}
