package com.lqx.incubator.lightning.web;

/**
 * @Author ultima
 * @Date 2021/1/20 20:54
 **/
public class Result<T> {
  private boolean isSuccess;
  private String code;
  private String message;
  private T content;

  public Result(T content){
    this.content = content;
    isSuccess = true;
  }

  public static <T>Result<T> success(T t){
    return new Result(t);
  }

  public void setSuccess(boolean success) {
    isSuccess = success;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public boolean isSuccess() {
    return isSuccess;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public T getContent() {
    return content;
  }
}
