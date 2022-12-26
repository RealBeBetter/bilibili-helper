package top.misec.pojo.userinfobean;

/**
 * json根bean
 *
 * @author Real
 * @date 2022/12/26 21:04
 */
@lombok.Data
public class JsonRootBean {
    private int code;
    private String message;
    private int ttl;
    private Data data;
}
