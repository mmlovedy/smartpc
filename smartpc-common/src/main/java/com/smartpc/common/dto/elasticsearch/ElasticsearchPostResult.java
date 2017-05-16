/**
  * Copyright 2017 bejson.com 
  */
package com.smartpc.common.dto.elasticsearch;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class ElasticsearchPostResult implements Serializable{

    @JSONField(name="_index")
    private String Index;
    @JSONField(name="_type")
    private String Type;
    @JSONField(name="_id")
    private String Id;
    @JSONField(name="_version")
    private int Version;
    private String result;
    @JSONField(name="_shards")
    private Shards Shards;
    private boolean created;
    public void setIndex(String Index) {
         this.Index = Index;
     }
     public String getIndex() {
         return Index;
     }

    public void setType(String Type) {
         this.Type = Type;
     }
     public String getType() {
         return Type;
     }

    public void setId(String Id) {
         this.Id = Id;
     }
     public String getId() {
         return Id;
     }

    public void setVersion(int Version) {
         this.Version = Version;
     }
     public int getVersion() {
         return Version;
     }

    public void setResult(String result) {
         this.result = result;
     }
     public String getResult() {
         return result;
     }

    public void setShards(Shards Shards) {
         this.Shards = Shards;
     }
     public Shards getShards() {
         return Shards;
     }

    public void setCreated(boolean created) {
         this.created = created;
     }
     public boolean getCreated() {
         return created;
     }

}