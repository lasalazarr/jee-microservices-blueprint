package com.adv.blueprint.jee;

/**
 * Created by alberto on 5/15/17.
 */
public class ResultVo {

    private String result;
    private String cause;
    private Object data;


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
