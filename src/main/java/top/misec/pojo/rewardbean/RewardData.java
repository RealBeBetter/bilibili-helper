package top.misec.pojo.rewardbean;

import lombok.Data;

/**
 * 奖励数据
 *
 * @author Real
 * @date 2022/12/26 21:03
 */
@Data
public class RewardData {
    private boolean login;
    private boolean watch;
    private int coins;
    private boolean share;
    private boolean email;
    private boolean tel;
    private boolean safeQuestion;
    private boolean identifyCard;
}
