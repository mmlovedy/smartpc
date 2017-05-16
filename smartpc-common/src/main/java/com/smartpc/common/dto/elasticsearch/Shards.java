/**
  * Copyright 2017 bejson.com 
  */
package com.smartpc.common.dto.elasticsearch;

import java.io.Serializable;

public class Shards implements Serializable{

    private int total;
    private int successful;
    private int failed;
    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setSuccessful(int successful) {
         this.successful = successful;
     }
     public int getSuccessful() {
         return successful;
     }

    public void setFailed(int failed) {
         this.failed = failed;
     }
     public int getFailed() {
         return failed;
     }

}