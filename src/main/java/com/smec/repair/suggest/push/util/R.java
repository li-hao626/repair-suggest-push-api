package com.smec.repair.suggest.push.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiHao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private int code;
    private String msg;
    private Object data;

    //
    public static R setR(int code,String msg,Object data){
        R r=new R();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
    //成功
    public static R ok(){
        return setR(200,"OK",null);
    }
    public static R ok(Object data){
        return setR(200,"OK",data);
    }
    //失败
    public static R fail(){
        return setR(400,"Fail",null);
    }
    public static R fail(String msg){
        return setR(400,msg,null);
    }
}
