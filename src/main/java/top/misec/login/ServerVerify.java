package top.misec.login;

import lombok.Getter;

/**
 * 服务器验证
 *
 * @author Junzhou Liu
 * @date 2022/12/26 21:08
 */
@Getter
public class ServerVerify {

    private static String FTKEY = null;
    private static String CHATID = null;

    public static void verifyInit(String ftKey) {
        ServerVerify.FTKEY = ftKey;
    }

    public static void verifyInit(String ftKey, String chatId) {
        ServerVerify.FTKEY = ftKey;
        ServerVerify.CHATID = chatId;
    }

    public static String getFtkey() {
        return FTKEY;
    }

    public static String getChatId() {
        return CHATID;
    }
}
