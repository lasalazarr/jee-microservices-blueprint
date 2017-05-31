package com.adv.blueprint.jee;

/**
 * Created by alberto on 5/30/17.
 */
public class RestUser {

    public static void main(String args[]){

        String data = new String("DATA DE MENSAJE");

        EnvelopUtil.fillEnvelop(data, "list");

    }

}
