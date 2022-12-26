package top.misec.pojo.userinfobean;

/**
 * 数据
 *
 * @author Real
 * @date 2022/12/26 21:04
 */
@lombok.Data
public class Data {
    private boolean isLogin;
    private int email_verified;
    private String face;
    private LevelInfo level_info;
    private long mid;
    private int mobile_verified;
    private double money;
    private int moral;
    private Official official;
    private OfficialVerify officialVerify;
    private Pendant pendant;
    private int scores;
    private String uname;
    private long vipDueDate;
    private int vipStatus;
    private int vipType;
    private int vip_pay_type;
    private int vip_theme_type;
    private VipLabel vipLabel;
    private int vip_avatar_subscript;
    private String vip_nickname_color;
    private Wallet wallet;
    private boolean has_shop;
    private String shop_url;
    private int allowance_count;
    private int answer_status;
}
