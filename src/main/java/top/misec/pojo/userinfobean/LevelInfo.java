package top.misec.pojo.userinfobean;

import lombok.Data;

/**
 * 级别信息
 * Auto-generated
 *
 * @author Junzhou Liu
 * @date 2022/12/26 21:14
 */
@Data
public class LevelInfo {

    private int current_level;
    private int current_min;
    private int current_exp;
    private String next_exp;

    public int getNext_exp_asInt() {
        if ("--".equals(next_exp)) {
            return current_exp;
        } else {
            return Integer.parseInt(next_exp);
        }
    }
}
