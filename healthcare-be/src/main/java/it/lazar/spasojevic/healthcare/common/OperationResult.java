package it.lazar.spasojevic.healthcare.common;

import lombok.Data;
import org.springframework.data.util.Pair;

import java.util.Map;

@Data
public class OperationResult<T>{

    private Boolean success;
    private final T targetObject;
    private final Map<String,String> messsages;
    private final String errorCode;


    public static <T> OperationResult<T> success(T targetObject) {
        return new OperationResult<T>(true,targetObject,null, null);
    }

    public static <T> OperationResult<T> failure(Map<String,String> message){
        return new OperationResult<T>(false,null,message,null);
    }

    public OperationResult(Boolean success, T targetObject, Map<String, String> messsages, String errorCode) {
        this.success = success;
        this.targetObject = targetObject;
        this.messsages = messsages;
        this.errorCode = errorCode;
    }
}
