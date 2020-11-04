package com.zb.blog.utils;

import java.io.Serializable;
/**
 * DESC: Result
 * DateTime: 2020/11/4 000411:40
 *
 * @author 张彪
 * @version 1.0
 */

public class Result implements Serializable {
    private static final long serialVersionUID = 1L;
    //状态码
    private Integer code;
    //消息
    private String msg;
    //数据对象
    private Object data;

    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    //操作成功
    public static Result success(Object data) {
        return success(200,"操作成功",data);

    }
    //分页
    public static Result success(Object data,Integer total) {
        return success(200,"操作成功",data, total);

    }
    //失败
    public static Result fail(String msg) {

        return fail(400,msg,null);

    }
    public static Result success(Integer code,String msg,Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;

    }
    public static Result success(Integer code,String msg,Object data,Integer total) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        r.setTotal(total);
        return r;
    }
    public static Result fail(Integer code,String msg,Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;

    }
}
