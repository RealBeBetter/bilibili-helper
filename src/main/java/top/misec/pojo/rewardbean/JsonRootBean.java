package top.misec.pojo.rewardbean;

import lombok.Data;

/**
 * json根bean
 *
 * @author Real
 * @date 2022/12/26 21:03
 */
@Data
public class JsonRootBean {
    private int code;
    private String message;
    private int ttl;
    private RewardData rewardData;
}
