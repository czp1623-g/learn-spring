package org.czp.common.rest;

import lombok.Data;

@Data
public class Resp {
    private String code;
    private String msg;
    private String data;

    public static Resp gen200() {
        Resp resp = new Resp();
        resp.code = "200";
        resp.msg = "success";
        return resp;
    }
}
