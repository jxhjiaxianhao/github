package com.example.demo.JXH;

import lombok.Data;

@Data
public class Result {
   private Object status;
    private Object message;
    private Object data;

    public Result(Object dat){
     this.status=200;
        this.data=dat;
        this.message="ok";
    }
    public  static Result ok(Object data){
        return new Result(data);
    }

    public  static Object ok(){

        return "999";
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message=" + message +
                ", data=" + data +
                '}';
    }
}
