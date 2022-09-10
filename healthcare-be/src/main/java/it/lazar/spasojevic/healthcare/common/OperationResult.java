package it.lazar.spasojevic.healthcare.common;

import lombok.Data;
import org.springframework.data.util.Pair;

@Data
public class OperationResult<T>{

    private Boolean success;
    private final T targetObject;
    private final Pair<String,String> messsage;
    private final String errorCode;


    public static <T> OperationResult<T> success(T targetObject) {
        return new OperationResult<T>(true,targetObject,null, null);
    }

    public static <T> OperationResult<T> failure(Pair<String,String> message){
        return new OperationResult<T>(false,null,message,null);
    }

    public OperationResult(Boolean success, T targetObject, Pair<String, String> messsage, String errorCode) {
        this.success = success;
        this.targetObject = targetObject;
        this.messsage = messsage;
        this.errorCode = errorCode;
    }
}
